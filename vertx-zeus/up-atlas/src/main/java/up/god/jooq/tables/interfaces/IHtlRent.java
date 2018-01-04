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
public interface IHtlRent extends Serializable {

    /**
     * Setter for <code>DB_HTL.HTL_RENT.PK_ID</code>. uniqueId,PK_ID
     */
    public IHtlRent setPkId(Long value);

    /**
     * Getter for <code>DB_HTL.HTL_RENT.PK_ID</code>. uniqueId,PK_ID
     */
    public Long getPkId();

    /**
     * Setter for <code>DB_HTL.HTL_RENT.T_COMMENT</code>. comment,T_COMMENT
     */
    public IHtlRent setTComment(String value);

    /**
     * Getter for <code>DB_HTL.HTL_RENT.T_COMMENT</code>. comment,T_COMMENT
     */
    public String getTComment();

    /**
     * Setter for <code>DB_HTL.HTL_RENT.S_CODE</code>. code,S_CODE
     */
    public IHtlRent setSCode(String value);

    /**
     * Getter for <code>DB_HTL.HTL_RENT.S_CODE</code>. code,S_CODE
     */
    public String getSCode();

    /**
     * Setter for <code>DB_HTL.HTL_RENT.S_CALL</code>. 联系电话,call,S_CALL
     */
    public IHtlRent setSCall(String value);

    /**
     * Getter for <code>DB_HTL.HTL_RENT.S_CALL</code>. 联系电话,call,S_CALL
     */
    public String getSCall();

    /**
     * Setter for <code>DB_HTL.HTL_RENT.S_CONTACT</code>. 联系人,contact,S_CONTACT
     */
    public IHtlRent setSContact(String value);

    /**
     * Getter for <code>DB_HTL.HTL_RENT.S_CONTACT</code>. 联系人,contact,S_CONTACT
     */
    public String getSContact();

    /**
     * Setter for <code>DB_HTL.HTL_RENT.S_ROOM_NUMBER</code>. 房间号码,roomNumber,S_ROOM_NUMBER
     */
    public IHtlRent setSRoomNumber(String value);

    /**
     * Getter for <code>DB_HTL.HTL_RENT.S_ROOM_NUMBER</code>. 房间号码,roomNumber,S_ROOM_NUMBER
     */
    public String getSRoomNumber();

    /**
     * Setter for <code>DB_HTL.HTL_RENT.S_THING</code>. 租借物品名称,thing,S_THING
     */
    public IHtlRent setSThing(String value);

    /**
     * Getter for <code>DB_HTL.HTL_RENT.S_THING</code>. 租借物品名称,thing,S_THING
     */
    public String getSThing();

    /**
     * Setter for <code>DB_HTL.HTL_RENT.J_CONFIG</code>. config,J_CONFIG
     */
    public IHtlRent setJConfig(String value);

    /**
     * Getter for <code>DB_HTL.HTL_RENT.J_CONFIG</code>. config,J_CONFIG
     */
    public String getJConfig();

    /**
     * Setter for <code>DB_HTL.HTL_RENT.R_CATEGORY_ID</code>. 【关联类别】该关联的类别ID,categoryId,R_CATEGORY_ID
     */
    public IHtlRent setRCategoryId(String value);

    /**
     * Getter for <code>DB_HTL.HTL_RENT.R_CATEGORY_ID</code>. 【关联类别】该关联的类别ID,categoryId,R_CATEGORY_ID
     */
    public String getRCategoryId();

    /**
     * Setter for <code>DB_HTL.HTL_RENT.R_HOTEL_ID</code>. hotelId,R_HOTEL_ID
     */
    public IHtlRent setRHotelId(Long value);

    /**
     * Getter for <code>DB_HTL.HTL_RENT.R_HOTEL_ID</code>. hotelId,R_HOTEL_ID
     */
    public Long getRHotelId();

    /**
     * Setter for <code>DB_HTL.HTL_RENT.IS_ACTIVE</code>. active,IS_ACTIVE
     */
    public IHtlRent setIsActive(Boolean value);

    /**
     * Getter for <code>DB_HTL.HTL_RENT.IS_ACTIVE</code>. active,IS_ACTIVE
     */
    public Boolean getIsActive();

    /**
     * Setter for <code>DB_HTL.HTL_RENT.Z_SIGMA</code>. sigma,Z_SIGMA
     */
    public IHtlRent setZSigma(String value);

    /**
     * Getter for <code>DB_HTL.HTL_RENT.Z_SIGMA</code>. sigma,Z_SIGMA
     */
    public String getZSigma();

    /**
     * Setter for <code>DB_HTL.HTL_RENT.Z_LANGUAGE</code>. language,Z_LANGUAGE
     */
    public IHtlRent setZLanguage(String value);

    /**
     * Getter for <code>DB_HTL.HTL_RENT.Z_LANGUAGE</code>. language,Z_LANGUAGE
     */
    public String getZLanguage();

    /**
     * Setter for <code>DB_HTL.HTL_RENT.Z_CREATE_BY</code>. createBy,Z_CREATE_BY
     */
    public IHtlRent setZCreateBy(String value);

    /**
     * Getter for <code>DB_HTL.HTL_RENT.Z_CREATE_BY</code>. createBy,Z_CREATE_BY
     */
    public String getZCreateBy();

    /**
     * Setter for <code>DB_HTL.HTL_RENT.Z_CREATE_TIME</code>. createTime,Z_CREATE_TIME
     */
    public IHtlRent setZCreateTime(LocalDateTime value);

    /**
     * Getter for <code>DB_HTL.HTL_RENT.Z_CREATE_TIME</code>. createTime,Z_CREATE_TIME
     */
    public LocalDateTime getZCreateTime();

    /**
     * Setter for <code>DB_HTL.HTL_RENT.Z_UPDATE_BY</code>. updateBy,Z_UPDATE_BY
     */
    public IHtlRent setZUpdateBy(String value);

    /**
     * Getter for <code>DB_HTL.HTL_RENT.Z_UPDATE_BY</code>. updateBy,Z_UPDATE_BY
     */
    public String getZUpdateBy();

    /**
     * Setter for <code>DB_HTL.HTL_RENT.Z_UPDATE_TIME</code>. updateTime,Z_UPDATE_TIME
     */
    public IHtlRent setZUpdateTime(LocalDateTime value);

    /**
     * Getter for <code>DB_HTL.HTL_RENT.Z_UPDATE_TIME</code>. updateTime,Z_UPDATE_TIME
     */
    public LocalDateTime getZUpdateTime();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface IHtlRent
     */
    public void from(up.god.jooq.tables.interfaces.IHtlRent from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface IHtlRent
     */
    public <E extends up.god.jooq.tables.interfaces.IHtlRent> E into(E into);

    default IHtlRent fromJson(io.vertx.core.json.JsonObject json) {
        setPkId(json.getLong("PK_ID"));
        setTComment(json.getString("T_COMMENT"));
        setSCode(json.getString("S_CODE"));
        setSCall(json.getString("S_CALL"));
        setSContact(json.getString("S_CONTACT"));
        setSRoomNumber(json.getString("S_ROOM_NUMBER"));
        setSThing(json.getString("S_THING"));
        setJConfig(json.getString("J_CONFIG"));
        setRCategoryId(json.getString("R_CATEGORY_ID"));
        setRHotelId(json.getLong("R_HOTEL_ID"));
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
        json.put("T_COMMENT",getTComment());
        json.put("S_CODE",getSCode());
        json.put("S_CALL",getSCall());
        json.put("S_CONTACT",getSContact());
        json.put("S_ROOM_NUMBER",getSRoomNumber());
        json.put("S_THING",getSThing());
        json.put("J_CONFIG",getJConfig());
        json.put("R_CATEGORY_ID",getRCategoryId());
        json.put("R_HOTEL_ID",getRHotelId());
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
