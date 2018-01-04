/*
 * This file is generated by jOOQ.
*/
package up.god.jooq.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;

import up.god.jooq.tables.HtlRelRoleMenu;
import up.god.jooq.tables.interfaces.IHtlRelRoleMenu;


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
public class HtlRelRoleMenuRecord extends UpdatableRecordImpl<HtlRelRoleMenuRecord> implements Record3<String, String, Boolean>, IHtlRelRoleMenu {

    private static final long serialVersionUID = -1714792527;

    /**
     * Setter for <code>DB_HTL.HTL_REL_ROLE_MENU.R_ROLE_ID</code>. roleId,R_ROLE_ID
     */
    @Override
    public HtlRelRoleMenuRecord setRRoleId(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>DB_HTL.HTL_REL_ROLE_MENU.R_ROLE_ID</code>. roleId,R_ROLE_ID
     */
    @Override
    public String getRRoleId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>DB_HTL.HTL_REL_ROLE_MENU.R_MENU_ID</code>. menuId,R_MENU_ID
     */
    @Override
    public HtlRelRoleMenuRecord setRMenuId(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>DB_HTL.HTL_REL_ROLE_MENU.R_MENU_ID</code>. menuId,R_MENU_ID
     */
    @Override
    public String getRMenuId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>DB_HTL.HTL_REL_ROLE_MENU.IS_ORIGINAL</code>. original,IS_ORIGINAL
     */
    @Override
    public HtlRelRoleMenuRecord setIsOriginal(Boolean value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>DB_HTL.HTL_REL_ROLE_MENU.IS_ORIGINAL</code>. original,IS_ORIGINAL
     */
    @Override
    public Boolean getIsOriginal() {
        return (Boolean) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record2<String, String> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<String, String, Boolean> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<String, String, Boolean> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return HtlRelRoleMenu.HTL_REL_ROLE_MENU.R_ROLE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return HtlRelRoleMenu.HTL_REL_ROLE_MENU.R_MENU_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field3() {
        return HtlRelRoleMenu.HTL_REL_ROLE_MENU.IS_ORIGINAL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getRRoleId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getRMenuId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component3() {
        return getIsOriginal();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getRRoleId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getRMenuId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value3() {
        return getIsOriginal();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HtlRelRoleMenuRecord value1(String value) {
        setRRoleId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HtlRelRoleMenuRecord value2(String value) {
        setRMenuId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HtlRelRoleMenuRecord value3(Boolean value) {
        setIsOriginal(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HtlRelRoleMenuRecord values(String value1, String value2, Boolean value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void from(IHtlRelRoleMenu from) {
        setRRoleId(from.getRRoleId());
        setRMenuId(from.getRMenuId());
        setIsOriginal(from.getIsOriginal());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends IHtlRelRoleMenu> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached HtlRelRoleMenuRecord
     */
    public HtlRelRoleMenuRecord() {
        super(HtlRelRoleMenu.HTL_REL_ROLE_MENU);
    }

    /**
     * Create a detached, initialised HtlRelRoleMenuRecord
     */
    public HtlRelRoleMenuRecord(String rRoleId, String rMenuId, Boolean isOriginal) {
        super(HtlRelRoleMenu.HTL_REL_ROLE_MENU);

        set(0, rRoleId);
        set(1, rMenuId);
        set(2, isOriginal);
    }
}
