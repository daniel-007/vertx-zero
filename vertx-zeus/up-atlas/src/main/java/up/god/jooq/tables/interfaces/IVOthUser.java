/*
 * This file is generated by jOOQ.
*/
package up.god.jooq.tables.interfaces;


import java.io.Serializable;

import javax.annotation.Generated;


/**
 * VIEW
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface IVOthUser extends Serializable {

    /**
     * Setter for <code>DB_HTL.v_oth_user.PK_ID</code>. uniqueId,PK_ID
     */
    public IVOthUser setPkId(String value);

    /**
     * Getter for <code>DB_HTL.v_oth_user.PK_ID</code>. uniqueId,PK_ID
     */
    public String getPkId();

    /**
     * Setter for <code>DB_HTL.v_oth_user.S_USERNAME</code>. 登陆账号,username,S_USERNAME
     */
    public IVOthUser setSUsername(String value);

    /**
     * Getter for <code>DB_HTL.v_oth_user.S_USERNAME</code>. 登陆账号,username,S_USERNAME
     */
    public String getSUsername();

    /**
     * Setter for <code>DB_HTL.v_oth_user.S_EMAIL</code>. 个人Email,email,S_EMAIL
     */
    public IVOthUser setSEmail(String value);

    /**
     * Getter for <code>DB_HTL.v_oth_user.S_EMAIL</code>. 个人Email,email,S_EMAIL
     */
    public String getSEmail();

    /**
     * Setter for <code>DB_HTL.v_oth_user.S_MOBILE</code>. 手机号,mobile,S_MOBILE
     */
    public IVOthUser setSMobile(String value);

    /**
     * Getter for <code>DB_HTL.v_oth_user.S_MOBILE</code>. 手机号,mobile,S_MOBILE
     */
    public String getSMobile();

    /**
     * Setter for <code>DB_HTL.v_oth_user.S_PASSWORD</code>. 登陆口令/密码,password,S_PASSWORD
     */
    public IVOthUser setSPassword(String value);

    /**
     * Getter for <code>DB_HTL.v_oth_user.S_PASSWORD</code>. 登陆口令/密码,password,S_PASSWORD
     */
    public String getSPassword();

    /**
     * Setter for <code>DB_HTL.v_oth_user.S_QQ</code>. 个人QQ号,qq,S_QQ
     */
    public IVOthUser setSQq(String value);

    /**
     * Getter for <code>DB_HTL.v_oth_user.S_QQ</code>. 个人QQ号,qq,S_QQ
     */
    public String getSQq();

    /**
     * Setter for <code>DB_HTL.v_oth_user.S_ALIPAY</code>. 支付宝,alipay,S_ALIPAY
     */
    public IVOthUser setSAlipay(String value);

    /**
     * Getter for <code>DB_HTL.v_oth_user.S_ALIPAY</code>. 支付宝,alipay,S_ALIPAY
     */
    public String getSAlipay();

    /**
     * Setter for <code>DB_HTL.v_oth_user.S_TAOBAO</code>. 淘宝,taobao,S_TAOBAO
     */
    public IVOthUser setSTaobao(String value);

    /**
     * Getter for <code>DB_HTL.v_oth_user.S_TAOBAO</code>. 淘宝,taobao,S_TAOBAO
     */
    public String getSTaobao();

    /**
     * Setter for <code>DB_HTL.v_oth_user.S_WEIBO</code>. 微博账号,weibo,S_WEIBO
     */
    public IVOthUser setSWeibo(String value);

    /**
     * Getter for <code>DB_HTL.v_oth_user.S_WEIBO</code>. 微博账号,weibo,S_WEIBO
     */
    public String getSWeibo();

    /**
     * Setter for <code>DB_HTL.v_oth_user.S_WECHAT</code>. 微信账号,wechat,S_WECHAT
     */
    public IVOthUser setSWechat(String value);

    /**
     * Getter for <code>DB_HTL.v_oth_user.S_WECHAT</code>. 微信账号,wechat,S_WECHAT
     */
    public String getSWechat();

    /**
     * Setter for <code>DB_HTL.v_oth_user.S_SECRET</code>. 专用私钥，OAuth中也可用,secret,S_SECRET
     */
    public IVOthUser setSSecret(String value);

    /**
     * Getter for <code>DB_HTL.v_oth_user.S_SECRET</code>. 专用私钥，OAuth中也可用,secret,S_SECRET
     */
    public String getSSecret();

    /**
     * Setter for <code>DB_HTL.v_oth_user.T_REDIRECT_URI</code>. redirectUri,T_REDIRECT_URI
     */
    public IVOthUser setTRedirectUri(String value);

    /**
     * Getter for <code>DB_HTL.v_oth_user.T_REDIRECT_URI</code>. redirectUri,T_REDIRECT_URI
     */
    public String getTRedirectUri();

    /**
     * Setter for <code>DB_HTL.v_oth_user.S_SCOPE</code>. scope,S_SCOPE
     */
    public IVOthUser setSScope(String value);

    /**
     * Getter for <code>DB_HTL.v_oth_user.S_SCOPE</code>. scope,S_SCOPE
     */
    public String getSScope();

    /**
     * Setter for <code>DB_HTL.v_oth_user.S_CLIENT_SECRET</code>. clientSecret,S_CLIENT_SECRET
     */
    public IVOthUser setSClientSecret(String value);

    /**
     * Getter for <code>DB_HTL.v_oth_user.S_CLIENT_SECRET</code>. clientSecret,S_CLIENT_SECRET
     */
    public String getSClientSecret();

    /**
     * Setter for <code>DB_HTL.v_oth_user.S_GRANT_TYPE</code>. grantType,S_GRANT_TYPE
     */
    public IVOthUser setSGrantType(String value);

    /**
     * Getter for <code>DB_HTL.v_oth_user.S_GRANT_TYPE</code>. grantType,S_GRANT_TYPE
     */
    public String getSGrantType();

    /**
     * Setter for <code>DB_HTL.v_oth_user.ROLE_ID</code>. roleId,R_ROLE_ID
     */
    public IVOthUser setRoleId(String value);

    /**
     * Getter for <code>DB_HTL.v_oth_user.ROLE_ID</code>. roleId,R_ROLE_ID
     */
    public String getRoleId();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface IVOthUser
     */
    public void from(up.god.jooq.tables.interfaces.IVOthUser from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface IVOthUser
     */
    public <E extends up.god.jooq.tables.interfaces.IVOthUser> E into(E into);

    default IVOthUser fromJson(io.vertx.core.json.JsonObject json) {
        setPkId(json.getString("PK_ID"));
        setSUsername(json.getString("S_USERNAME"));
        setSEmail(json.getString("S_EMAIL"));
        setSMobile(json.getString("S_MOBILE"));
        setSPassword(json.getString("S_PASSWORD"));
        setSQq(json.getString("S_QQ"));
        setSAlipay(json.getString("S_ALIPAY"));
        setSTaobao(json.getString("S_TAOBAO"));
        setSWeibo(json.getString("S_WEIBO"));
        setSWechat(json.getString("S_WECHAT"));
        setSSecret(json.getString("S_SECRET"));
        setTRedirectUri(json.getString("T_REDIRECT_URI"));
        setSScope(json.getString("S_SCOPE"));
        setSClientSecret(json.getString("S_CLIENT_SECRET"));
        setSGrantType(json.getString("S_GRANT_TYPE"));
        setRoleId(json.getString("ROLE_ID"));
        return this;
    }


    default io.vertx.core.json.JsonObject toJson() {
        io.vertx.core.json.JsonObject json = new io.vertx.core.json.JsonObject();
        json.put("PK_ID",getPkId());
        json.put("S_USERNAME",getSUsername());
        json.put("S_EMAIL",getSEmail());
        json.put("S_MOBILE",getSMobile());
        json.put("S_PASSWORD",getSPassword());
        json.put("S_QQ",getSQq());
        json.put("S_ALIPAY",getSAlipay());
        json.put("S_TAOBAO",getSTaobao());
        json.put("S_WEIBO",getSWeibo());
        json.put("S_WECHAT",getSWechat());
        json.put("S_SECRET",getSSecret());
        json.put("T_REDIRECT_URI",getTRedirectUri());
        json.put("S_SCOPE",getSScope());
        json.put("S_CLIENT_SECRET",getSClientSecret());
        json.put("S_GRANT_TYPE",getSGrantType());
        json.put("ROLE_ID",getRoleId());
        return json;
    }

}
