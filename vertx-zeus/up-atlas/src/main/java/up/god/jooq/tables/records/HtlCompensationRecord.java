/*
 * This file is generated by jOOQ.
*/
package up.god.jooq.tables.records;


import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record16;
import org.jooq.Row16;
import org.jooq.impl.UpdatableRecordImpl;

import up.god.jooq.tables.HtlCompensation;
import up.god.jooq.tables.interfaces.IHtlCompensation;


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
public class HtlCompensationRecord extends UpdatableRecordImpl<HtlCompensationRecord> implements Record16<Long, BigDecimal, String, String, String, String, String, Long, String, Boolean, String, String, String, LocalDateTime, String, LocalDateTime>, IHtlCompensation {

    private static final long serialVersionUID = -43336078;

    /**
     * Setter for <code>DB_HTL.HTL_COMPENSATION.PK_ID</code>. uniqueId,PK_ID
     */
    @Override
    public HtlCompensationRecord setPkId(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>DB_HTL.HTL_COMPENSATION.PK_ID</code>. uniqueId,PK_ID
     */
    @Override
    public Long getPkId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>DB_HTL.HTL_COMPENSATION.D_PRICE</code>. 【单价】商品的单价。,price,D_PRICE
     */
    @Override
    public HtlCompensationRecord setDPrice(BigDecimal value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>DB_HTL.HTL_COMPENSATION.D_PRICE</code>. 【单价】商品的单价。,price,D_PRICE
     */
    @Override
    public BigDecimal getDPrice() {
        return (BigDecimal) get(1);
    }

    /**
     * Setter for <code>DB_HTL.HTL_COMPENSATION.S_NAME</code>. name,S_NAME
     */
    @Override
    public HtlCompensationRecord setSName(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>DB_HTL.HTL_COMPENSATION.S_NAME</code>. name,S_NAME
     */
    @Override
    public String getSName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>DB_HTL.HTL_COMPENSATION.S_CODE</code>. code,S_CODE
     */
    @Override
    public HtlCompensationRecord setSCode(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>DB_HTL.HTL_COMPENSATION.S_CODE</code>. code,S_CODE
     */
    @Override
    public String getSCode() {
        return (String) get(3);
    }

    /**
     * Setter for <code>DB_HTL.HTL_COMPENSATION.S_HELP_CODE</code>. helpCode,S_HELP_CODE
     */
    @Override
    public HtlCompensationRecord setSHelpCode(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>DB_HTL.HTL_COMPENSATION.S_HELP_CODE</code>. helpCode,S_HELP_CODE
     */
    @Override
    public String getSHelpCode() {
        return (String) get(4);
    }

    /**
     * Setter for <code>DB_HTL.HTL_COMPENSATION.S_UNIT</code>. unit,S_UNIT
     */
    @Override
    public HtlCompensationRecord setSUnit(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>DB_HTL.HTL_COMPENSATION.S_UNIT</code>. unit,S_UNIT
     */
    @Override
    public String getSUnit() {
        return (String) get(5);
    }

    /**
     * Setter for <code>DB_HTL.HTL_COMPENSATION.J_CONFIG</code>. config,J_CONFIG
     */
    @Override
    public HtlCompensationRecord setJConfig(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>DB_HTL.HTL_COMPENSATION.J_CONFIG</code>. config,J_CONFIG
     */
    @Override
    public String getJConfig() {
        return (String) get(6);
    }

    /**
     * Setter for <code>DB_HTL.HTL_COMPENSATION.R_HOTEL_ID</code>. hotelId,R_HOTEL_ID
     */
    @Override
    public HtlCompensationRecord setRHotelId(Long value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>DB_HTL.HTL_COMPENSATION.R_HOTEL_ID</code>. hotelId,R_HOTEL_ID
     */
    @Override
    public Long getRHotelId() {
        return (Long) get(7);
    }

    /**
     * Setter for <code>DB_HTL.HTL_COMPENSATION.R_PAYTERM_ID</code>. REF: SYS_CATEGORY【消费项】关联消费项ID,ptermId,R_PAYTERM_ID
     */
    @Override
    public HtlCompensationRecord setRPaytermId(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>DB_HTL.HTL_COMPENSATION.R_PAYTERM_ID</code>. REF: SYS_CATEGORY【消费项】关联消费项ID,ptermId,R_PAYTERM_ID
     */
    @Override
    public String getRPaytermId() {
        return (String) get(8);
    }

    /**
     * Setter for <code>DB_HTL.HTL_COMPENSATION.IS_ACTIVE</code>. active,IS_ACTIVE
     */
    @Override
    public HtlCompensationRecord setIsActive(Boolean value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>DB_HTL.HTL_COMPENSATION.IS_ACTIVE</code>. active,IS_ACTIVE
     */
    @Override
    public Boolean getIsActive() {
        return (Boolean) get(9);
    }

    /**
     * Setter for <code>DB_HTL.HTL_COMPENSATION.Z_SIGMA</code>. sigma,Z_SIGMA
     */
    @Override
    public HtlCompensationRecord setZSigma(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>DB_HTL.HTL_COMPENSATION.Z_SIGMA</code>. sigma,Z_SIGMA
     */
    @Override
    public String getZSigma() {
        return (String) get(10);
    }

    /**
     * Setter for <code>DB_HTL.HTL_COMPENSATION.Z_LANGUAGE</code>. language,Z_LANGUAGE
     */
    @Override
    public HtlCompensationRecord setZLanguage(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>DB_HTL.HTL_COMPENSATION.Z_LANGUAGE</code>. language,Z_LANGUAGE
     */
    @Override
    public String getZLanguage() {
        return (String) get(11);
    }

    /**
     * Setter for <code>DB_HTL.HTL_COMPENSATION.Z_CREATE_BY</code>. createBy,Z_CREATE_BY
     */
    @Override
    public HtlCompensationRecord setZCreateBy(String value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>DB_HTL.HTL_COMPENSATION.Z_CREATE_BY</code>. createBy,Z_CREATE_BY
     */
    @Override
    public String getZCreateBy() {
        return (String) get(12);
    }

    /**
     * Setter for <code>DB_HTL.HTL_COMPENSATION.Z_CREATE_TIME</code>. createTime,Z_CREATE_TIME
     */
    @Override
    public HtlCompensationRecord setZCreateTime(LocalDateTime value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>DB_HTL.HTL_COMPENSATION.Z_CREATE_TIME</code>. createTime,Z_CREATE_TIME
     */
    @Override
    public LocalDateTime getZCreateTime() {
        return (LocalDateTime) get(13);
    }

    /**
     * Setter for <code>DB_HTL.HTL_COMPENSATION.Z_UPDATE_BY</code>. updateBy,Z_UPDATE_BY
     */
    @Override
    public HtlCompensationRecord setZUpdateBy(String value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>DB_HTL.HTL_COMPENSATION.Z_UPDATE_BY</code>. updateBy,Z_UPDATE_BY
     */
    @Override
    public String getZUpdateBy() {
        return (String) get(14);
    }

    /**
     * Setter for <code>DB_HTL.HTL_COMPENSATION.Z_UPDATE_TIME</code>. updateTime,Z_UPDATE_TIME
     */
    @Override
    public HtlCompensationRecord setZUpdateTime(LocalDateTime value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>DB_HTL.HTL_COMPENSATION.Z_UPDATE_TIME</code>. updateTime,Z_UPDATE_TIME
     */
    @Override
    public LocalDateTime getZUpdateTime() {
        return (LocalDateTime) get(15);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record16 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row16<Long, BigDecimal, String, String, String, String, String, Long, String, Boolean, String, String, String, LocalDateTime, String, LocalDateTime> fieldsRow() {
        return (Row16) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row16<Long, BigDecimal, String, String, String, String, String, Long, String, Boolean, String, String, String, LocalDateTime, String, LocalDateTime> valuesRow() {
        return (Row16) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return HtlCompensation.HTL_COMPENSATION.PK_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field2() {
        return HtlCompensation.HTL_COMPENSATION.D_PRICE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return HtlCompensation.HTL_COMPENSATION.S_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return HtlCompensation.HTL_COMPENSATION.S_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return HtlCompensation.HTL_COMPENSATION.S_HELP_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return HtlCompensation.HTL_COMPENSATION.S_UNIT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return HtlCompensation.HTL_COMPENSATION.J_CONFIG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field8() {
        return HtlCompensation.HTL_COMPENSATION.R_HOTEL_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return HtlCompensation.HTL_COMPENSATION.R_PAYTERM_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field10() {
        return HtlCompensation.HTL_COMPENSATION.IS_ACTIVE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return HtlCompensation.HTL_COMPENSATION.Z_SIGMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return HtlCompensation.HTL_COMPENSATION.Z_LANGUAGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return HtlCompensation.HTL_COMPENSATION.Z_CREATE_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field14() {
        return HtlCompensation.HTL_COMPENSATION.Z_CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field15() {
        return HtlCompensation.HTL_COMPENSATION.Z_UPDATE_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field16() {
        return HtlCompensation.HTL_COMPENSATION.Z_UPDATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getPkId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component2() {
        return getDPrice();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getSName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getSCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getSHelpCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getSUnit();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getJConfig();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component8() {
        return getRHotelId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getRPaytermId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component10() {
        return getIsActive();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getZSigma();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component12() {
        return getZLanguage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component13() {
        return getZCreateBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime component14() {
        return getZCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component15() {
        return getZUpdateBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime component16() {
        return getZUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getPkId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value2() {
        return getDPrice();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getSName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getSCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getSHelpCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getSUnit();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getJConfig();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value8() {
        return getRHotelId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getRPaytermId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value10() {
        return getIsActive();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getZSigma();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getZLanguage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getZCreateBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value14() {
        return getZCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value15() {
        return getZUpdateBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value16() {
        return getZUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HtlCompensationRecord value1(Long value) {
        setPkId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HtlCompensationRecord value2(BigDecimal value) {
        setDPrice(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HtlCompensationRecord value3(String value) {
        setSName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HtlCompensationRecord value4(String value) {
        setSCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HtlCompensationRecord value5(String value) {
        setSHelpCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HtlCompensationRecord value6(String value) {
        setSUnit(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HtlCompensationRecord value7(String value) {
        setJConfig(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HtlCompensationRecord value8(Long value) {
        setRHotelId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HtlCompensationRecord value9(String value) {
        setRPaytermId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HtlCompensationRecord value10(Boolean value) {
        setIsActive(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HtlCompensationRecord value11(String value) {
        setZSigma(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HtlCompensationRecord value12(String value) {
        setZLanguage(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HtlCompensationRecord value13(String value) {
        setZCreateBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HtlCompensationRecord value14(LocalDateTime value) {
        setZCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HtlCompensationRecord value15(String value) {
        setZUpdateBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HtlCompensationRecord value16(LocalDateTime value) {
        setZUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HtlCompensationRecord values(Long value1, BigDecimal value2, String value3, String value4, String value5, String value6, String value7, Long value8, String value9, Boolean value10, String value11, String value12, String value13, LocalDateTime value14, String value15, LocalDateTime value16) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void from(IHtlCompensation from) {
        setPkId(from.getPkId());
        setDPrice(from.getDPrice());
        setSName(from.getSName());
        setSCode(from.getSCode());
        setSHelpCode(from.getSHelpCode());
        setSUnit(from.getSUnit());
        setJConfig(from.getJConfig());
        setRHotelId(from.getRHotelId());
        setRPaytermId(from.getRPaytermId());
        setIsActive(from.getIsActive());
        setZSigma(from.getZSigma());
        setZLanguage(from.getZLanguage());
        setZCreateBy(from.getZCreateBy());
        setZCreateTime(from.getZCreateTime());
        setZUpdateBy(from.getZUpdateBy());
        setZUpdateTime(from.getZUpdateTime());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends IHtlCompensation> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached HtlCompensationRecord
     */
    public HtlCompensationRecord() {
        super(HtlCompensation.HTL_COMPENSATION);
    }

    /**
     * Create a detached, initialised HtlCompensationRecord
     */
    public HtlCompensationRecord(Long pkId, BigDecimal dPrice, String sName, String sCode, String sHelpCode, String sUnit, String jConfig, Long rHotelId, String rPaytermId, Boolean isActive, String zSigma, String zLanguage, String zCreateBy, LocalDateTime zCreateTime, String zUpdateBy, LocalDateTime zUpdateTime) {
        super(HtlCompensation.HTL_COMPENSATION);

        set(0, pkId);
        set(1, dPrice);
        set(2, sName);
        set(3, sCode);
        set(4, sHelpCode);
        set(5, sUnit);
        set(6, jConfig);
        set(7, rHotelId);
        set(8, rPaytermId);
        set(9, isActive);
        set(10, zSigma);
        set(11, zLanguage);
        set(12, zCreateBy);
        set(13, zCreateTime);
        set(14, zUpdateBy);
        set(15, zUpdateTime);
    }
}
