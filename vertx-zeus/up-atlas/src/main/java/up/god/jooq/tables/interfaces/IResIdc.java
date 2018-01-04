/*
 * This file is generated by jOOQ.
*/
package up.god.jooq.tables.interfaces;


import java.io.Serializable;
import java.time.LocalDateTime;

import javax.annotation.Generated;


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
public interface IResIdc extends Serializable {

    /**
     * Setter for <code>DB_HTL.RES_IDC.PK_ID</code>. uniqueId,PK_ID
     */
    public IResIdc setPkId(String value);

    /**
     * Getter for <code>DB_HTL.RES_IDC.PK_ID</code>. uniqueId,PK_ID
     */
    public String getPkId();

    /**
     * Setter for <code>DB_HTL.RES_IDC.D_EXPIRED_TIME</code>. 过期时间,expiredTime,D_EXPIRED_TIME
     */
    public IResIdc setDExpiredTime(LocalDateTime value);

    /**
     * Getter for <code>DB_HTL.RES_IDC.D_EXPIRED_TIME</code>. 过期时间,expiredTime,D_EXPIRED_TIME
     */
    public LocalDateTime getDExpiredTime();

    /**
     * Setter for <code>DB_HTL.RES_IDC.S_CODE</code>. code,S_CODE
     */
    public IResIdc setSCode(String value);

    /**
     * Getter for <code>DB_HTL.RES_IDC.S_CODE</code>. code,S_CODE
     */
    public String getSCode();

    /**
     * Setter for <code>DB_HTL.RES_IDC.S_BACK</code>. 证件背面,back,S_BACK
     */
    public IResIdc setSBack(String value);

    /**
     * Getter for <code>DB_HTL.RES_IDC.S_BACK</code>. 证件背面,back,S_BACK
     */
    public String getSBack();

    /**
     * Setter for <code>DB_HTL.RES_IDC.S_COUNTRY</code>. country,S_COUNTRY
     */
    public IResIdc setSCountry(String value);

    /**
     * Getter for <code>DB_HTL.RES_IDC.S_COUNTRY</code>. country,S_COUNTRY
     */
    public String getSCountry();

    /**
     * Setter for <code>DB_HTL.RES_IDC.S_FRONT</code>. 证件正面,front,S_FRONT
     */
    public IResIdc setSFront(String value);

    /**
     * Getter for <code>DB_HTL.RES_IDC.S_FRONT</code>. 证件正面,front,S_FRONT
     */
    public String getSFront();

    /**
     * Setter for <code>DB_HTL.RES_IDC.S_IDC_NUMBER</code>. 证件号,idcNumber,S_IDC_NUMBER
     */
    public IResIdc setSIdcNumber(String value);

    /**
     * Getter for <code>DB_HTL.RES_IDC.S_IDC_NUMBER</code>. 证件号,idcNumber,S_IDC_NUMBER
     */
    public String getSIdcNumber();

    /**
     * Setter for <code>DB_HTL.RES_IDC.S_NATIVE_PLACE</code>. 籍贯,nativePlace,S_NATIVE_PLACE
     */
    public IResIdc setSNativePlace(String value);

    /**
     * Getter for <code>DB_HTL.RES_IDC.S_NATIVE_PLACE</code>. 籍贯,nativePlace,S_NATIVE_PLACE
     */
    public String getSNativePlace();

    /**
     * Setter for <code>DB_HTL.RES_IDC.S_REALNAME</code>. 真实姓名,realname,S_REALNAME
     */
    public IResIdc setSRealname(String value);

    /**
     * Getter for <code>DB_HTL.RES_IDC.S_REALNAME</code>. 真实姓名,realname,S_REALNAME
     */
    public String getSRealname();

    /**
     * Setter for <code>DB_HTL.RES_IDC.J_CONFIG</code>. config,J_CONFIG
     */
    public IResIdc setJConfig(String value);

    /**
     * Getter for <code>DB_HTL.RES_IDC.J_CONFIG</code>. config,J_CONFIG
     */
    public String getJConfig();

    /**
     * Setter for <code>DB_HTL.RES_IDC.RLT_IDC_TYPE</code>. 证件类型,idcType,RLT_IDC_TYPE
     */
    public IResIdc setRltIdcType(Long value);

    /**
     * Getter for <code>DB_HTL.RES_IDC.RLT_IDC_TYPE</code>. 证件类型,idcType,RLT_IDC_TYPE
     */
    public Long getRltIdcType();

    /**
     * Setter for <code>DB_HTL.RES_IDC.R_USER_ID</code>. userId,R_USER_ID
     */
    public IResIdc setRUserId(String value);

    /**
     * Getter for <code>DB_HTL.RES_IDC.R_USER_ID</code>. userId,R_USER_ID
     */
    public String getRUserId();

    /**
     * Setter for <code>DB_HTL.RES_IDC.R_LOCATION_ID</code>. locationId,R_LOCATION_ID
     */
    public IResIdc setRLocationId(Long value);

    /**
     * Getter for <code>DB_HTL.RES_IDC.R_LOCATION_ID</code>. locationId,R_LOCATION_ID
     */
    public Long getRLocationId();

    /**
     * Setter for <code>DB_HTL.RES_IDC.IS_VERIFIED</code>. 是否通过验证,verified,IS_VERIFIED
     */
    public IResIdc setIsVerified(Boolean value);

    /**
     * Getter for <code>DB_HTL.RES_IDC.IS_VERIFIED</code>. 是否通过验证,verified,IS_VERIFIED
     */
    public Boolean getIsVerified();

    /**
     * Setter for <code>DB_HTL.RES_IDC.IS_ACTIVE</code>. active,IS_ACTIVE
     */
    public IResIdc setIsActive(Boolean value);

    /**
     * Getter for <code>DB_HTL.RES_IDC.IS_ACTIVE</code>. active,IS_ACTIVE
     */
    public Boolean getIsActive();

    /**
     * Setter for <code>DB_HTL.RES_IDC.Z_SIGMA</code>. sigma,Z_SIGMA
     */
    public IResIdc setZSigma(String value);

    /**
     * Getter for <code>DB_HTL.RES_IDC.Z_SIGMA</code>. sigma,Z_SIGMA
     */
    public String getZSigma();

    /**
     * Setter for <code>DB_HTL.RES_IDC.Z_LANGUAGE</code>. language,Z_LANGUAGE
     */
    public IResIdc setZLanguage(String value);

    /**
     * Getter for <code>DB_HTL.RES_IDC.Z_LANGUAGE</code>. language,Z_LANGUAGE
     */
    public String getZLanguage();

    /**
     * Setter for <code>DB_HTL.RES_IDC.Z_CREATE_BY</code>. createBy,Z_CREATE_BY
     */
    public IResIdc setZCreateBy(String value);

    /**
     * Getter for <code>DB_HTL.RES_IDC.Z_CREATE_BY</code>. createBy,Z_CREATE_BY
     */
    public String getZCreateBy();

    /**
     * Setter for <code>DB_HTL.RES_IDC.Z_CREATE_TIME</code>. createTime,Z_CREATE_TIME
     */
    public IResIdc setZCreateTime(LocalDateTime value);

    /**
     * Getter for <code>DB_HTL.RES_IDC.Z_CREATE_TIME</code>. createTime,Z_CREATE_TIME
     */
    public LocalDateTime getZCreateTime();

    /**
     * Setter for <code>DB_HTL.RES_IDC.Z_UPDATE_BY</code>. updateBy,Z_UPDATE_BY
     */
    public IResIdc setZUpdateBy(String value);

    /**
     * Getter for <code>DB_HTL.RES_IDC.Z_UPDATE_BY</code>. updateBy,Z_UPDATE_BY
     */
    public String getZUpdateBy();

    /**
     * Setter for <code>DB_HTL.RES_IDC.Z_UPDATE_TIME</code>. updateTime,Z_UPDATE_TIME
     */
    public IResIdc setZUpdateTime(LocalDateTime value);

    /**
     * Getter for <code>DB_HTL.RES_IDC.Z_UPDATE_TIME</code>. updateTime,Z_UPDATE_TIME
     */
    public LocalDateTime getZUpdateTime();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface IResIdc
     */
    public void from(up.god.jooq.tables.interfaces.IResIdc from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface IResIdc
     */
    public <E extends up.god.jooq.tables.interfaces.IResIdc> E into(E into);

    default IResIdc fromJson(io.vertx.core.json.JsonObject json) {
        setPkId(json.getString("PK_ID"));
        // Omitting unrecognized type java.time.LocalDateTime for column D_EXPIRED_TIME!
        setSCode(json.getString("S_CODE"));
        setSBack(json.getString("S_BACK"));
        setSCountry(json.getString("S_COUNTRY"));
        setSFront(json.getString("S_FRONT"));
        setSIdcNumber(json.getString("S_IDC_NUMBER"));
        setSNativePlace(json.getString("S_NATIVE_PLACE"));
        setSRealname(json.getString("S_REALNAME"));
        setJConfig(json.getString("J_CONFIG"));
        setRltIdcType(json.getLong("RLT_IDC_TYPE"));
        setRUserId(json.getString("R_USER_ID"));
        setRLocationId(json.getLong("R_LOCATION_ID"));
        setIsVerified(json.getBoolean("IS_VERIFIED"));
        setIsActive(json.getBoolean("IS_ACTIVE"));
        setZSigma(json.getString("Z_SIGMA"));
        setZLanguage(json.getString("Z_LANGUAGE"));
        setZCreateBy(json.getString("Z_CREATE_BY"));
        // Omitting unrecognized type java.time.LocalDateTime for column Z_CREATE_TIME!
        setZUpdateBy(json.getString("Z_UPDATE_BY"));
        // Omitting unrecognized type java.time.LocalDateTime for column Z_UPDATE_TIME!
        return this;
    }


    default io.vertx.core.json.JsonObject toJson() {
        io.vertx.core.json.JsonObject json = new io.vertx.core.json.JsonObject();
        json.put("PK_ID",getPkId());
        // Omitting unrecognized type java.time.LocalDateTime for column D_EXPIRED_TIME!
        json.put("S_CODE",getSCode());
        json.put("S_BACK",getSBack());
        json.put("S_COUNTRY",getSCountry());
        json.put("S_FRONT",getSFront());
        json.put("S_IDC_NUMBER",getSIdcNumber());
        json.put("S_NATIVE_PLACE",getSNativePlace());
        json.put("S_REALNAME",getSRealname());
        json.put("J_CONFIG",getJConfig());
        json.put("RLT_IDC_TYPE",getRltIdcType());
        json.put("R_USER_ID",getRUserId());
        json.put("R_LOCATION_ID",getRLocationId());
        json.put("IS_VERIFIED",getIsVerified());
        json.put("IS_ACTIVE",getIsActive());
        json.put("Z_SIGMA",getZSigma());
        json.put("Z_LANGUAGE",getZLanguage());
        json.put("Z_CREATE_BY",getZCreateBy());
        // Omitting unrecognized type java.time.LocalDateTime for column Z_CREATE_TIME!
        json.put("Z_UPDATE_BY",getZUpdateBy());
        // Omitting unrecognized type java.time.LocalDateTime for column Z_UPDATE_TIME!
        return json;
    }

}
