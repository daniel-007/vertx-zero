/*
 * This file is generated by jOOQ.
*/
package up.god.jooq.tables.daos;


import io.github.jklingsporn.vertx.jooq.future.VertxDAO;

import java.time.LocalDateTime;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;

import up.god.jooq.tables.SecResource;
import up.god.jooq.tables.records.SecResourceRecord;


import java.util.concurrent.CompletableFuture;
import io.github.jklingsporn.vertx.jooq.future.util.FutureTool;
/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SecResourceDao extends DAOImpl<SecResourceRecord, up.god.jooq.tables.pojos.SecResource, String> implements VertxDAO<up.god.jooq.tables.records.SecResourceRecord,up.god.jooq.tables.pojos.SecResource,java.lang.String> {

    /**
     * Create a new SecResourceDao without any configuration
     */
    public SecResourceDao() {
        super(SecResource.SEC_RESOURCE, up.god.jooq.tables.pojos.SecResource.class);
    }

    /**
     * Create a new SecResourceDao with an attached configuration
     */
    public SecResourceDao(Configuration configuration) {
        super(SecResource.SEC_RESOURCE, up.god.jooq.tables.pojos.SecResource.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getId(up.god.jooq.tables.pojos.SecResource object) {
        return object.getPkId();
    }

    /**
     * Fetch records that have <code>PK_ID IN (values)</code>
     */
    public List<up.god.jooq.tables.pojos.SecResource> fetchByPkId(String... values) {
        return fetch(SecResource.SEC_RESOURCE.PK_ID, values);
    }

    /**
     * Fetch a unique record that has <code>PK_ID = value</code>
     */
    public up.god.jooq.tables.pojos.SecResource fetchOneByPkId(String value) {
        return fetchOne(SecResource.SEC_RESOURCE.PK_ID, value);
    }

    /**
     * Fetch records that have <code>T_PROJECTION IN (values)</code>
     */
    public List<up.god.jooq.tables.pojos.SecResource> fetchByTProjection(String... values) {
        return fetch(SecResource.SEC_RESOURCE.T_PROJECTION, values);
    }

    /**
     * Fetch records that have <code>T_QUERY IN (values)</code>
     */
    public List<up.god.jooq.tables.pojos.SecResource> fetchByTQuery(String... values) {
        return fetch(SecResource.SEC_RESOURCE.T_QUERY, values);
    }

    /**
     * Fetch records that have <code>V_URL_ID IN (values)</code>
     */
    public List<up.god.jooq.tables.pojos.SecResource> fetchByVUrlId(String... values) {
        return fetch(SecResource.SEC_RESOURCE.V_URL_ID, values);
    }

    /**
     * Fetch records that have <code>S_CODE IN (values)</code>
     */
    public List<up.god.jooq.tables.pojos.SecResource> fetchBySCode(String... values) {
        return fetch(SecResource.SEC_RESOURCE.S_CODE, values);
    }

    /**
     * Fetch records that have <code>S_IDENTIFIER IN (values)</code>
     */
    public List<up.god.jooq.tables.pojos.SecResource> fetchBySIdentifier(String... values) {
        return fetch(SecResource.SEC_RESOURCE.S_IDENTIFIER, values);
    }

    /**
     * Fetch records that have <code>S_OBJ_ID IN (values)</code>
     */
    public List<up.god.jooq.tables.pojos.SecResource> fetchBySObjId(String... values) {
        return fetch(SecResource.SEC_RESOURCE.S_OBJ_ID, values);
    }

    /**
     * Fetch records that have <code>S_OBJ_TABLE IN (values)</code>
     */
    public List<up.god.jooq.tables.pojos.SecResource> fetchBySObjTable(String... values) {
        return fetch(SecResource.SEC_RESOURCE.S_OBJ_TABLE, values);
    }

    /**
     * Fetch records that have <code>J_CONFIG IN (values)</code>
     */
    public List<up.god.jooq.tables.pojos.SecResource> fetchByJConfig(String... values) {
        return fetch(SecResource.SEC_RESOURCE.J_CONFIG, values);
    }

    /**
     * Fetch records that have <code>J_PARAMS IN (values)</code>
     */
    public List<up.god.jooq.tables.pojos.SecResource> fetchByJParams(String... values) {
        return fetch(SecResource.SEC_RESOURCE.J_PARAMS, values);
    }

    /**
     * Fetch records that have <code>IS_ACTIVE IN (values)</code>
     */
    public List<up.god.jooq.tables.pojos.SecResource> fetchByIsActive(Boolean... values) {
        return fetch(SecResource.SEC_RESOURCE.IS_ACTIVE, values);
    }

    /**
     * Fetch records that have <code>Z_SIGMA IN (values)</code>
     */
    public List<up.god.jooq.tables.pojos.SecResource> fetchByZSigma(String... values) {
        return fetch(SecResource.SEC_RESOURCE.Z_SIGMA, values);
    }

    /**
     * Fetch records that have <code>Z_LANGUAGE IN (values)</code>
     */
    public List<up.god.jooq.tables.pojos.SecResource> fetchByZLanguage(String... values) {
        return fetch(SecResource.SEC_RESOURCE.Z_LANGUAGE, values);
    }

    /**
     * Fetch records that have <code>Z_CREATE_BY IN (values)</code>
     */
    public List<up.god.jooq.tables.pojos.SecResource> fetchByZCreateBy(String... values) {
        return fetch(SecResource.SEC_RESOURCE.Z_CREATE_BY, values);
    }

    /**
     * Fetch records that have <code>Z_CREATE_TIME IN (values)</code>
     */
    public List<up.god.jooq.tables.pojos.SecResource> fetchByZCreateTime(LocalDateTime... values) {
        return fetch(SecResource.SEC_RESOURCE.Z_CREATE_TIME, values);
    }

    /**
     * Fetch records that have <code>Z_UPDATE_BY IN (values)</code>
     */
    public List<up.god.jooq.tables.pojos.SecResource> fetchByZUpdateBy(String... values) {
        return fetch(SecResource.SEC_RESOURCE.Z_UPDATE_BY, values);
    }

    /**
     * Fetch records that have <code>Z_UPDATE_TIME IN (values)</code>
     */
    public List<up.god.jooq.tables.pojos.SecResource> fetchByZUpdateTime(LocalDateTime... values) {
        return fetch(SecResource.SEC_RESOURCE.Z_UPDATE_TIME, values);
    }

    /**
     * Fetch records that have <code>PK_ID IN (values)</code> asynchronously
     */
    public CompletableFuture<List<up.god.jooq.tables.pojos.SecResource>> fetchByPkIdAsync(List<String> values) {
        return fetchAsync(SecResource.SEC_RESOURCE.PK_ID,values);
    }

    /**
     * Fetch a unique record that has <code>PK_ID = value</code> asynchronously
     */
    public CompletableFuture<up.god.jooq.tables.pojos.SecResource> fetchOneByPkIdAsync(String value) {
        return FutureTool.executeBlocking(h->h.complete(fetchOneByPkId(value)),vertx());
    }

    /**
     * Fetch records that have <code>T_PROJECTION IN (values)</code> asynchronously
     */
    public CompletableFuture<List<up.god.jooq.tables.pojos.SecResource>> fetchByTProjectionAsync(List<String> values) {
        return fetchAsync(SecResource.SEC_RESOURCE.T_PROJECTION,values);
    }

    /**
     * Fetch records that have <code>T_QUERY IN (values)</code> asynchronously
     */
    public CompletableFuture<List<up.god.jooq.tables.pojos.SecResource>> fetchByTQueryAsync(List<String> values) {
        return fetchAsync(SecResource.SEC_RESOURCE.T_QUERY,values);
    }

    /**
     * Fetch records that have <code>V_URL_ID IN (values)</code> asynchronously
     */
    public CompletableFuture<List<up.god.jooq.tables.pojos.SecResource>> fetchByVUrlIdAsync(List<String> values) {
        return fetchAsync(SecResource.SEC_RESOURCE.V_URL_ID,values);
    }

    /**
     * Fetch records that have <code>S_CODE IN (values)</code> asynchronously
     */
    public CompletableFuture<List<up.god.jooq.tables.pojos.SecResource>> fetchBySCodeAsync(List<String> values) {
        return fetchAsync(SecResource.SEC_RESOURCE.S_CODE,values);
    }

    /**
     * Fetch records that have <code>S_IDENTIFIER IN (values)</code> asynchronously
     */
    public CompletableFuture<List<up.god.jooq.tables.pojos.SecResource>> fetchBySIdentifierAsync(List<String> values) {
        return fetchAsync(SecResource.SEC_RESOURCE.S_IDENTIFIER,values);
    }

    /**
     * Fetch records that have <code>S_OBJ_ID IN (values)</code> asynchronously
     */
    public CompletableFuture<List<up.god.jooq.tables.pojos.SecResource>> fetchBySObjIdAsync(List<String> values) {
        return fetchAsync(SecResource.SEC_RESOURCE.S_OBJ_ID,values);
    }

    /**
     * Fetch records that have <code>S_OBJ_TABLE IN (values)</code> asynchronously
     */
    public CompletableFuture<List<up.god.jooq.tables.pojos.SecResource>> fetchBySObjTableAsync(List<String> values) {
        return fetchAsync(SecResource.SEC_RESOURCE.S_OBJ_TABLE,values);
    }

    /**
     * Fetch records that have <code>J_CONFIG IN (values)</code> asynchronously
     */
    public CompletableFuture<List<up.god.jooq.tables.pojos.SecResource>> fetchByJConfigAsync(List<String> values) {
        return fetchAsync(SecResource.SEC_RESOURCE.J_CONFIG,values);
    }

    /**
     * Fetch records that have <code>J_PARAMS IN (values)</code> asynchronously
     */
    public CompletableFuture<List<up.god.jooq.tables.pojos.SecResource>> fetchByJParamsAsync(List<String> values) {
        return fetchAsync(SecResource.SEC_RESOURCE.J_PARAMS,values);
    }

    /**
     * Fetch records that have <code>IS_ACTIVE IN (values)</code> asynchronously
     */
    public CompletableFuture<List<up.god.jooq.tables.pojos.SecResource>> fetchByIsActiveAsync(List<Boolean> values) {
        return fetchAsync(SecResource.SEC_RESOURCE.IS_ACTIVE,values);
    }

    /**
     * Fetch records that have <code>Z_SIGMA IN (values)</code> asynchronously
     */
    public CompletableFuture<List<up.god.jooq.tables.pojos.SecResource>> fetchByZSigmaAsync(List<String> values) {
        return fetchAsync(SecResource.SEC_RESOURCE.Z_SIGMA,values);
    }

    /**
     * Fetch records that have <code>Z_LANGUAGE IN (values)</code> asynchronously
     */
    public CompletableFuture<List<up.god.jooq.tables.pojos.SecResource>> fetchByZLanguageAsync(List<String> values) {
        return fetchAsync(SecResource.SEC_RESOURCE.Z_LANGUAGE,values);
    }

    /**
     * Fetch records that have <code>Z_CREATE_BY IN (values)</code> asynchronously
     */
    public CompletableFuture<List<up.god.jooq.tables.pojos.SecResource>> fetchByZCreateByAsync(List<String> values) {
        return fetchAsync(SecResource.SEC_RESOURCE.Z_CREATE_BY,values);
    }

    /**
     * Fetch records that have <code>Z_CREATE_TIME IN (values)</code> asynchronously
     */
    public CompletableFuture<List<up.god.jooq.tables.pojos.SecResource>> fetchByZCreateTimeAsync(List<LocalDateTime> values) {
        return fetchAsync(SecResource.SEC_RESOURCE.Z_CREATE_TIME,values);
    }

    /**
     * Fetch records that have <code>Z_UPDATE_BY IN (values)</code> asynchronously
     */
    public CompletableFuture<List<up.god.jooq.tables.pojos.SecResource>> fetchByZUpdateByAsync(List<String> values) {
        return fetchAsync(SecResource.SEC_RESOURCE.Z_UPDATE_BY,values);
    }

    /**
     * Fetch records that have <code>Z_UPDATE_TIME IN (values)</code> asynchronously
     */
    public CompletableFuture<List<up.god.jooq.tables.pojos.SecResource>> fetchByZUpdateTimeAsync(List<LocalDateTime> values) {
        return fetchAsync(SecResource.SEC_RESOURCE.Z_UPDATE_TIME,values);
    }

    private io.vertx.core.Vertx vertx;

    @Override
    public void setVertx(io.vertx.core.Vertx vertx) {
        this.vertx = vertx;
    }

    @Override
    public io.vertx.core.Vertx vertx() {
        return this.vertx;
    }

}
