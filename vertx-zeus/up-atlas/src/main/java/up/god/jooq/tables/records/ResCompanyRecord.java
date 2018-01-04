/*
 * This file is generated by jOOQ.
*/
package up.god.jooq.tables.records;


import java.time.LocalDateTime;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record17;
import org.jooq.Row17;
import org.jooq.impl.UpdatableRecordImpl;

import up.god.jooq.tables.ResCompany;
import up.god.jooq.tables.interfaces.IResCompany;


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
public class ResCompanyRecord extends UpdatableRecordImpl<ResCompanyRecord> implements Record17<Long, String, String, String, String, String, String, String, String, Long, Boolean, String, String, String, LocalDateTime, String, LocalDateTime>, IResCompany {

    private static final long serialVersionUID = 1211350299;

    /**
     * Setter for <code>DB_HTL.RES_COMPANY.PK_ID</code>. uniqueId,PK_ID
     */
    @Override
    public ResCompanyRecord setPkId(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>DB_HTL.RES_COMPANY.PK_ID</code>. uniqueId,PK_ID
     */
    @Override
    public Long getPkId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>DB_HTL.RES_COMPANY.S_NAME</code>. name,S_NAME
     */
    @Override
    public ResCompanyRecord setSName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>DB_HTL.RES_COMPANY.S_NAME</code>. name,S_NAME
     */
    @Override
    public String getSName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>DB_HTL.RES_COMPANY.S_CODE</code>. code,S_CODE
     */
    @Override
    public ResCompanyRecord setSCode(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>DB_HTL.RES_COMPANY.S_CODE</code>. code,S_CODE
     */
    @Override
    public String getSCode() {
        return (String) get(2);
    }

    /**
     * Setter for <code>DB_HTL.RES_COMPANY.S_EMAIL</code>. email,S_EMAIL
     */
    @Override
    public ResCompanyRecord setSEmail(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>DB_HTL.RES_COMPANY.S_EMAIL</code>. email,S_EMAIL
     */
    @Override
    public String getSEmail() {
        return (String) get(3);
    }

    /**
     * Setter for <code>DB_HTL.RES_COMPANY.S_FONT</code>. font,S_FONT
     */
    @Override
    public ResCompanyRecord setSFont(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>DB_HTL.RES_COMPANY.S_FONT</code>. font,S_FONT
     */
    @Override
    public String getSFont() {
        return (String) get(4);
    }

    /**
     * Setter for <code>DB_HTL.RES_COMPANY.S_LOGO</code>. logo,S_LOGO
     */
    @Override
    public ResCompanyRecord setSLogo(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>DB_HTL.RES_COMPANY.S_LOGO</code>. logo,S_LOGO
     */
    @Override
    public String getSLogo() {
        return (String) get(5);
    }

    /**
     * Setter for <code>DB_HTL.RES_COMPANY.S_PHONE</code>. phone,S_PHONE
     */
    @Override
    public ResCompanyRecord setSPhone(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>DB_HTL.RES_COMPANY.S_PHONE</code>. phone,S_PHONE
     */
    @Override
    public String getSPhone() {
        return (String) get(6);
    }

    /**
     * Setter for <code>DB_HTL.RES_COMPANY.S_REGISTRY</code>. 公司登记法人,registry,S_REGISTRY
     */
    @Override
    public ResCompanyRecord setSRegistry(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>DB_HTL.RES_COMPANY.S_REGISTRY</code>. 公司登记法人,registry,S_REGISTRY
     */
    @Override
    public String getSRegistry() {
        return (String) get(7);
    }

    /**
     * Setter for <code>DB_HTL.RES_COMPANY.J_CONFIG</code>. config,J_CONFIG
     */
    @Override
    public ResCompanyRecord setJConfig(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>DB_HTL.RES_COMPANY.J_CONFIG</code>. config,J_CONFIG
     */
    @Override
    public String getJConfig() {
        return (String) get(8);
    }

    /**
     * Setter for <code>DB_HTL.RES_COMPANY.R_LOCATION_ID</code>. locationId,R_LOCATION_ID
     */
    @Override
    public ResCompanyRecord setRLocationId(Long value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>DB_HTL.RES_COMPANY.R_LOCATION_ID</code>. locationId,R_LOCATION_ID
     */
    @Override
    public Long getRLocationId() {
        return (Long) get(9);
    }

    /**
     * Setter for <code>DB_HTL.RES_COMPANY.IS_ACTIVE</code>. active,IS_ACTIVE
     */
    @Override
    public ResCompanyRecord setIsActive(Boolean value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>DB_HTL.RES_COMPANY.IS_ACTIVE</code>. active,IS_ACTIVE
     */
    @Override
    public Boolean getIsActive() {
        return (Boolean) get(10);
    }

    /**
     * Setter for <code>DB_HTL.RES_COMPANY.Z_SIGMA</code>. sigma,Z_SIGMA
     */
    @Override
    public ResCompanyRecord setZSigma(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>DB_HTL.RES_COMPANY.Z_SIGMA</code>. sigma,Z_SIGMA
     */
    @Override
    public String getZSigma() {
        return (String) get(11);
    }

    /**
     * Setter for <code>DB_HTL.RES_COMPANY.Z_LANGUAGE</code>. language,Z_LANGUAGE
     */
    @Override
    public ResCompanyRecord setZLanguage(String value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>DB_HTL.RES_COMPANY.Z_LANGUAGE</code>. language,Z_LANGUAGE
     */
    @Override
    public String getZLanguage() {
        return (String) get(12);
    }

    /**
     * Setter for <code>DB_HTL.RES_COMPANY.Z_CREATE_BY</code>. createBy,Z_CREATE_BY
     */
    @Override
    public ResCompanyRecord setZCreateBy(String value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>DB_HTL.RES_COMPANY.Z_CREATE_BY</code>. createBy,Z_CREATE_BY
     */
    @Override
    public String getZCreateBy() {
        return (String) get(13);
    }

    /**
     * Setter for <code>DB_HTL.RES_COMPANY.Z_CREATE_TIME</code>. createTime,Z_CREATE_TIME
     */
    @Override
    public ResCompanyRecord setZCreateTime(LocalDateTime value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>DB_HTL.RES_COMPANY.Z_CREATE_TIME</code>. createTime,Z_CREATE_TIME
     */
    @Override
    public LocalDateTime getZCreateTime() {
        return (LocalDateTime) get(14);
    }

    /**
     * Setter for <code>DB_HTL.RES_COMPANY.Z_UPDATE_BY</code>. updateBy,Z_UPDATE_BY
     */
    @Override
    public ResCompanyRecord setZUpdateBy(String value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>DB_HTL.RES_COMPANY.Z_UPDATE_BY</code>. updateBy,Z_UPDATE_BY
     */
    @Override
    public String getZUpdateBy() {
        return (String) get(15);
    }

    /**
     * Setter for <code>DB_HTL.RES_COMPANY.Z_UPDATE_TIME</code>. updateTime,Z_UPDATE_TIME
     */
    @Override
    public ResCompanyRecord setZUpdateTime(LocalDateTime value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>DB_HTL.RES_COMPANY.Z_UPDATE_TIME</code>. updateTime,Z_UPDATE_TIME
     */
    @Override
    public LocalDateTime getZUpdateTime() {
        return (LocalDateTime) get(16);
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
    // Record17 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row17<Long, String, String, String, String, String, String, String, String, Long, Boolean, String, String, String, LocalDateTime, String, LocalDateTime> fieldsRow() {
        return (Row17) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row17<Long, String, String, String, String, String, String, String, String, Long, Boolean, String, String, String, LocalDateTime, String, LocalDateTime> valuesRow() {
        return (Row17) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return ResCompany.RES_COMPANY.PK_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return ResCompany.RES_COMPANY.S_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return ResCompany.RES_COMPANY.S_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return ResCompany.RES_COMPANY.S_EMAIL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return ResCompany.RES_COMPANY.S_FONT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return ResCompany.RES_COMPANY.S_LOGO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return ResCompany.RES_COMPANY.S_PHONE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return ResCompany.RES_COMPANY.S_REGISTRY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return ResCompany.RES_COMPANY.J_CONFIG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field10() {
        return ResCompany.RES_COMPANY.R_LOCATION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field11() {
        return ResCompany.RES_COMPANY.IS_ACTIVE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return ResCompany.RES_COMPANY.Z_SIGMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return ResCompany.RES_COMPANY.Z_LANGUAGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field14() {
        return ResCompany.RES_COMPANY.Z_CREATE_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field15() {
        return ResCompany.RES_COMPANY.Z_CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field16() {
        return ResCompany.RES_COMPANY.Z_UPDATE_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field17() {
        return ResCompany.RES_COMPANY.Z_UPDATE_TIME;
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
    public String component2() {
        return getSName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getSCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getSEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getSFont();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getSLogo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getSPhone();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getSRegistry();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getJConfig();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component10() {
        return getRLocationId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component11() {
        return getIsActive();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component12() {
        return getZSigma();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component13() {
        return getZLanguage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component14() {
        return getZCreateBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime component15() {
        return getZCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component16() {
        return getZUpdateBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime component17() {
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
    public String value2() {
        return getSName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getSCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getSEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getSFont();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getSLogo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getSPhone();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getSRegistry();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getJConfig();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value10() {
        return getRLocationId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value11() {
        return getIsActive();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getZSigma();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getZLanguage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value14() {
        return getZCreateBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value15() {
        return getZCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value16() {
        return getZUpdateBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value17() {
        return getZUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResCompanyRecord value1(Long value) {
        setPkId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResCompanyRecord value2(String value) {
        setSName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResCompanyRecord value3(String value) {
        setSCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResCompanyRecord value4(String value) {
        setSEmail(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResCompanyRecord value5(String value) {
        setSFont(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResCompanyRecord value6(String value) {
        setSLogo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResCompanyRecord value7(String value) {
        setSPhone(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResCompanyRecord value8(String value) {
        setSRegistry(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResCompanyRecord value9(String value) {
        setJConfig(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResCompanyRecord value10(Long value) {
        setRLocationId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResCompanyRecord value11(Boolean value) {
        setIsActive(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResCompanyRecord value12(String value) {
        setZSigma(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResCompanyRecord value13(String value) {
        setZLanguage(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResCompanyRecord value14(String value) {
        setZCreateBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResCompanyRecord value15(LocalDateTime value) {
        setZCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResCompanyRecord value16(String value) {
        setZUpdateBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResCompanyRecord value17(LocalDateTime value) {
        setZUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResCompanyRecord values(Long value1, String value2, String value3, String value4, String value5, String value6, String value7, String value8, String value9, Long value10, Boolean value11, String value12, String value13, String value14, LocalDateTime value15, String value16, LocalDateTime value17) {
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
        value17(value17);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void from(IResCompany from) {
        setPkId(from.getPkId());
        setSName(from.getSName());
        setSCode(from.getSCode());
        setSEmail(from.getSEmail());
        setSFont(from.getSFont());
        setSLogo(from.getSLogo());
        setSPhone(from.getSPhone());
        setSRegistry(from.getSRegistry());
        setJConfig(from.getJConfig());
        setRLocationId(from.getRLocationId());
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
    public <E extends IResCompany> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ResCompanyRecord
     */
    public ResCompanyRecord() {
        super(ResCompany.RES_COMPANY);
    }

    /**
     * Create a detached, initialised ResCompanyRecord
     */
    public ResCompanyRecord(Long pkId, String sName, String sCode, String sEmail, String sFont, String sLogo, String sPhone, String sRegistry, String jConfig, Long rLocationId, Boolean isActive, String zSigma, String zLanguage, String zCreateBy, LocalDateTime zCreateTime, String zUpdateBy, LocalDateTime zUpdateTime) {
        super(ResCompany.RES_COMPANY);

        set(0, pkId);
        set(1, sName);
        set(2, sCode);
        set(3, sEmail);
        set(4, sFont);
        set(5, sLogo);
        set(6, sPhone);
        set(7, sRegistry);
        set(8, jConfig);
        set(9, rLocationId);
        set(10, isActive);
        set(11, zSigma);
        set(12, zLanguage);
        set(13, zCreateBy);
        set(14, zCreateTime);
        set(15, zUpdateBy);
        set(16, zUpdateTime);
    }
}
