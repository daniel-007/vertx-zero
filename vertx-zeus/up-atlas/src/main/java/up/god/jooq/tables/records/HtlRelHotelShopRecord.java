/*
 * This file is generated by jOOQ.
*/
package up.god.jooq.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;

import up.god.jooq.tables.HtlRelHotelShop;
import up.god.jooq.tables.interfaces.IHtlRelHotelShop;


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
public class HtlRelHotelShopRecord extends UpdatableRecordImpl<HtlRelHotelShopRecord> implements Record2<Long, Long>, IHtlRelHotelShop {

    private static final long serialVersionUID = 35905603;

    /**
     * Setter for <code>DB_HTL.HTL_REL_HOTEL_SHOP.R_SHOP_ID</code>. shopId,R_SHOP_ID
     */
    @Override
    public HtlRelHotelShopRecord setRShopId(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>DB_HTL.HTL_REL_HOTEL_SHOP.R_SHOP_ID</code>. shopId,R_SHOP_ID
     */
    @Override
    public Long getRShopId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>DB_HTL.HTL_REL_HOTEL_SHOP.R_HOTEL_ID</code>. hotelId,R_HOTEL_ID
     */
    @Override
    public HtlRelHotelShopRecord setRHotelId(Long value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>DB_HTL.HTL_REL_HOTEL_SHOP.R_HOTEL_ID</code>. hotelId,R_HOTEL_ID
     */
    @Override
    public Long getRHotelId() {
        return (Long) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record2<Long, Long> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Long, Long> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Long, Long> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return HtlRelHotelShop.HTL_REL_HOTEL_SHOP.R_SHOP_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return HtlRelHotelShop.HTL_REL_HOTEL_SHOP.R_HOTEL_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getRShopId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component2() {
        return getRHotelId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getRShopId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getRHotelId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HtlRelHotelShopRecord value1(Long value) {
        setRShopId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HtlRelHotelShopRecord value2(Long value) {
        setRHotelId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HtlRelHotelShopRecord values(Long value1, Long value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void from(IHtlRelHotelShop from) {
        setRShopId(from.getRShopId());
        setRHotelId(from.getRHotelId());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends IHtlRelHotelShop> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached HtlRelHotelShopRecord
     */
    public HtlRelHotelShopRecord() {
        super(HtlRelHotelShop.HTL_REL_HOTEL_SHOP);
    }

    /**
     * Create a detached, initialised HtlRelHotelShopRecord
     */
    public HtlRelHotelShopRecord(Long rShopId, Long rHotelId) {
        super(HtlRelHotelShop.HTL_REL_HOTEL_SHOP);

        set(0, rShopId);
        set(1, rHotelId);
    }
}
