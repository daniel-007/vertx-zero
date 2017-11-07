package io.vertx.zero.ke.equip;

import com.vie.hors.ZeroException;
import com.vie.hors.ke.ArgumentException;
import com.vie.util.Instance;
import io.vertx.core.http.HttpServerOptions;
import org.junit.Assert;
import org.junit.Test;
import top.UnitBase;

import java.util.concurrent.ConcurrentMap;

public class HttpServerVisitorTc extends UnitBase {

    private static final int EXPECTED_PORT = 8083;
    final ServerVisitor<HttpServerOptions> visitor
            = Instance.singleton(HttpServerVisitor.class);

    ConcurrentMap<Integer, HttpServerOptions> options;

    public HttpServerVisitorTc() {
        try {
            options = visitor.visit();
        } catch (final ZeroException e) {
            Assert.fail("Cannot read vertx-server.yml");
        }
    }

    @Test(expected = ArgumentException.class)
    public void testVisit() throws ZeroException {
        final ServerVisitor<HttpServerOptions> visitor
                = Instance.singleton(HttpServerVisitor.class);
        visitor.visit("");
    }

    @Test
    public void testVisitOk() throws ZeroException {
        final ServerVisitor<HttpServerOptions> visitor
                = Instance.singleton(HttpServerVisitor.class);
        final ConcurrentMap<Integer, HttpServerOptions> options = visitor.visit();
        System.out.println(options);
    }

    @Test()
    public void test_visitor_port_from_yml_returns_default()
            throws ZeroException {
        Assert.assertNotNull(options.get(HttpServerOptions.DEFAULT_PORT));
        Assert.assertEquals(options.get(HttpServerOptions.DEFAULT_PORT).getPort(), HttpServerOptions.DEFAULT_PORT);
    }

    @Test()
    public void test_visitor_port_from_yml_returns_the_port()
            throws ZeroException {
        Assert.assertNotNull(options.get(EXPECTED_PORT));
        Assert.assertEquals(options.get(EXPECTED_PORT).getPort(), EXPECTED_PORT);
    }

    @Test()
    public void test_visitor_host_from_yml_returns_default() {
        Assert.assertNotNull(options.get(8084));
        Assert.assertEquals(options.get(8084).getHost(), HttpServerOptions.DEFAULT_HOST);
    }

    @Test()
    public void test_visitor_host_from_yml_returns_127002() {
        Assert.assertNotNull(options.get(8085));
        Assert.assertEquals(options.get(8085).getHost(), "127.0.0.2");
    }
}