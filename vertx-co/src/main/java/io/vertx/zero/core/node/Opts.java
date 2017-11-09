package io.vertx.zero.core.node;

import com.vie.exception.DemonException;
import com.vie.exception.ZeroException;
import com.vie.exception.run.LimeFileException;
import com.vie.fun.HPool;
import com.vie.util.Instance;
import io.vertx.core.json.JsonObject;
import io.vertx.zero.core.ZeroNode;
import io.vertx.zero.core.config.ZeroLime;
import io.vertx.zero.core.config.ZeroPlugin;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * Options for different configuration
 *
 * @param <T>
 */
public interface Opts<T> {
    /**
     * Read data from files
     *
     * @return
     * @throws DemonException
     */
    T ingest(String node) throws ZeroException;

    /**
     * Read reference of Opts
     *
     * @return
     */
    static Opts<JsonObject> get() {
        return YamlOpts.create();
    }
}

class YamlOpts implements Opts<JsonObject> {

    private static final ConcurrentMap<String, ZeroNode<JsonObject>>
            EXTENSIONS = new ConcurrentHashMap<>();

    /**
     * Default package scope, manually implement singleton
     * instead of Instance.singleton.
     *
     * @return
     */
    public static Opts<JsonObject> create() {
        if (null == INSTANCE) {
            synchronized (YamlOpts.class) {
                if (null == INSTANCE) {
                    INSTANCE = new YamlOpts();
                }
            }
        }
        return INSTANCE;
    }

    private static Opts<JsonObject> INSTANCE;

    private YamlOpts() {
    }

    ;

    @Override
    public JsonObject ingest(final String key)
            throws ZeroException {
        final ZeroNode<JsonObject> node =
                HPool.exec(EXTENSIONS, key,
                        () -> Instance.instance(ZeroPlugin.class, key));
        final JsonObject data = node.read();
        if (null == data) {
            throw new LimeFileException(ZeroLime.calculatePath(key));
        }
        return data;
    }
}