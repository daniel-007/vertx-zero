/*
 * This file is generated by jOOQ.
*/
package up.god.jooq.tables.daos;


import io.github.jklingsporn.vertx.jooq.future.VertxDAO;

import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.Record2;
import org.jooq.impl.DAOImpl;

import up.god.jooq.tables.HtlRelHotelLocation;
import up.god.jooq.tables.records.HtlRelHotelLocationRecord;


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
public class HtlRelHotelLocationDao extends DAOImpl<HtlRelHotelLocationRecord, up.god.jooq.tables.pojos.HtlRelHotelLocation, Record2<Long, Long>> implements VertxDAO<up.god.jooq.tables.records.HtlRelHotelLocationRecord,up.god.jooq.tables.pojos.HtlRelHotelLocation,org.jooq.Record2<java.lang.Long, java.lang.Long>> {

    /**
     * Create a new HtlRelHotelLocationDao without any configuration
     */
    public HtlRelHotelLocationDao() {
        super(HtlRelHotelLocation.HTL_REL_HOTEL_LOCATION, up.god.jooq.tables.pojos.HtlRelHotelLocation.class);
    }

    /**
     * Create a new HtlRelHotelLocationDao with an attached configuration
     */
    public HtlRelHotelLocationDao(Configuration configuration) {
        super(HtlRelHotelLocation.HTL_REL_HOTEL_LOCATION, up.god.jooq.tables.pojos.HtlRelHotelLocation.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Record2<Long, Long> getId(up.god.jooq.tables.pojos.HtlRelHotelLocation object) {
        return compositeKeyRecord(object.getRLocationId(), object.getRHotelId());
    }

    /**
     * Fetch records that have <code>R_LOCATION_ID IN (values)</code>
     */
    public List<up.god.jooq.tables.pojos.HtlRelHotelLocation> fetchByRLocationId(Long... values) {
        return fetch(HtlRelHotelLocation.HTL_REL_HOTEL_LOCATION.R_LOCATION_ID, values);
    }

    /**
     * Fetch a unique record that has <code>R_LOCATION_ID = value</code>
     */
    public up.god.jooq.tables.pojos.HtlRelHotelLocation fetchOneByRLocationId(Long value) {
        return fetchOne(HtlRelHotelLocation.HTL_REL_HOTEL_LOCATION.R_LOCATION_ID, value);
    }

    /**
     * Fetch records that have <code>R_HOTEL_ID IN (values)</code>
     */
    public List<up.god.jooq.tables.pojos.HtlRelHotelLocation> fetchByRHotelId(Long... values) {
        return fetch(HtlRelHotelLocation.HTL_REL_HOTEL_LOCATION.R_HOTEL_ID, values);
    }

    /**
     * Fetch records that have <code>R_LOCATION_ID IN (values)</code> asynchronously
     */
    public CompletableFuture<List<up.god.jooq.tables.pojos.HtlRelHotelLocation>> fetchByRLocationIdAsync(List<Long> values) {
        return fetchAsync(HtlRelHotelLocation.HTL_REL_HOTEL_LOCATION.R_LOCATION_ID,values);
    }

    /**
     * Fetch a unique record that has <code>R_LOCATION_ID = value</code> asynchronously
     */
    public CompletableFuture<up.god.jooq.tables.pojos.HtlRelHotelLocation> fetchOneByRLocationIdAsync(Long value) {
        return FutureTool.executeBlocking(h->h.complete(fetchOneByRLocationId(value)),vertx());
    }

    /**
     * Fetch records that have <code>R_HOTEL_ID IN (values)</code> asynchronously
     */
    public CompletableFuture<List<up.god.jooq.tables.pojos.HtlRelHotelLocation>> fetchByRHotelIdAsync(List<Long> values) {
        return fetchAsync(HtlRelHotelLocation.HTL_REL_HOTEL_LOCATION.R_HOTEL_ID,values);
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
