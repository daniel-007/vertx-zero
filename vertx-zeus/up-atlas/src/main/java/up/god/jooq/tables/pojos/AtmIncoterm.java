/*
 * This file is generated by jOOQ.
*/
package up.god.jooq.tables.pojos;


import java.time.LocalDateTime;

import javax.annotation.Generated;

import up.god.jooq.tables.interfaces.IAtmIncoterm;


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
public class AtmIncoterm implements IAtmIncoterm {

    private static final long serialVersionUID = 2140076633;

    private Long          pkId;
    private String        tComment;
    private String        sName;
    private String        sCode;
    private String        jConfig;
    private Boolean       isActive;
    private String        zSigma;
    private String        zLanguage;
    private String        zCreateBy;
    private LocalDateTime zCreateTime;
    private String        zUpdateBy;
    private LocalDateTime zUpdateTime;

    public AtmIncoterm() {}

    public AtmIncoterm(AtmIncoterm value) {
        this.pkId = value.pkId;
        this.tComment = value.tComment;
        this.sName = value.sName;
        this.sCode = value.sCode;
        this.jConfig = value.jConfig;
        this.isActive = value.isActive;
        this.zSigma = value.zSigma;
        this.zLanguage = value.zLanguage;
        this.zCreateBy = value.zCreateBy;
        this.zCreateTime = value.zCreateTime;
        this.zUpdateBy = value.zUpdateBy;
        this.zUpdateTime = value.zUpdateTime;
    }

    public AtmIncoterm(
        Long          pkId,
        String        tComment,
        String        sName,
        String        sCode,
        String        jConfig,
        Boolean       isActive,
        String        zSigma,
        String        zLanguage,
        String        zCreateBy,
        LocalDateTime zCreateTime,
        String        zUpdateBy,
        LocalDateTime zUpdateTime
    ) {
        this.pkId = pkId;
        this.tComment = tComment;
        this.sName = sName;
        this.sCode = sCode;
        this.jConfig = jConfig;
        this.isActive = isActive;
        this.zSigma = zSigma;
        this.zLanguage = zLanguage;
        this.zCreateBy = zCreateBy;
        this.zCreateTime = zCreateTime;
        this.zUpdateBy = zUpdateBy;
        this.zUpdateTime = zUpdateTime;
    }

    @Override
    public Long getPkId() {
        return this.pkId;
    }

    @Override
    public AtmIncoterm setPkId(Long pkId) {
        this.pkId = pkId;
        return this;
    }

    @Override
    public String getTComment() {
        return this.tComment;
    }

    @Override
    public AtmIncoterm setTComment(String tComment) {
        this.tComment = tComment;
        return this;
    }

    @Override
    public String getSName() {
        return this.sName;
    }

    @Override
    public AtmIncoterm setSName(String sName) {
        this.sName = sName;
        return this;
    }

    @Override
    public String getSCode() {
        return this.sCode;
    }

    @Override
    public AtmIncoterm setSCode(String sCode) {
        this.sCode = sCode;
        return this;
    }

    @Override
    public String getJConfig() {
        return this.jConfig;
    }

    @Override
    public AtmIncoterm setJConfig(String jConfig) {
        this.jConfig = jConfig;
        return this;
    }

    @Override
    public Boolean getIsActive() {
        return this.isActive;
    }

    @Override
    public AtmIncoterm setIsActive(Boolean isActive) {
        this.isActive = isActive;
        return this;
    }

    @Override
    public String getZSigma() {
        return this.zSigma;
    }

    @Override
    public AtmIncoterm setZSigma(String zSigma) {
        this.zSigma = zSigma;
        return this;
    }

    @Override
    public String getZLanguage() {
        return this.zLanguage;
    }

    @Override
    public AtmIncoterm setZLanguage(String zLanguage) {
        this.zLanguage = zLanguage;
        return this;
    }

    @Override
    public String getZCreateBy() {
        return this.zCreateBy;
    }

    @Override
    public AtmIncoterm setZCreateBy(String zCreateBy) {
        this.zCreateBy = zCreateBy;
        return this;
    }

    @Override
    public LocalDateTime getZCreateTime() {
        return this.zCreateTime;
    }

    @Override
    public AtmIncoterm setZCreateTime(LocalDateTime zCreateTime) {
        this.zCreateTime = zCreateTime;
        return this;
    }

    @Override
    public String getZUpdateBy() {
        return this.zUpdateBy;
    }

    @Override
    public AtmIncoterm setZUpdateBy(String zUpdateBy) {
        this.zUpdateBy = zUpdateBy;
        return this;
    }

    @Override
    public LocalDateTime getZUpdateTime() {
        return this.zUpdateTime;
    }

    @Override
    public AtmIncoterm setZUpdateTime(LocalDateTime zUpdateTime) {
        this.zUpdateTime = zUpdateTime;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("AtmIncoterm (");

        sb.append(pkId);
        sb.append(", ").append(tComment);
        sb.append(", ").append(sName);
        sb.append(", ").append(sCode);
        sb.append(", ").append(jConfig);
        sb.append(", ").append(isActive);
        sb.append(", ").append(zSigma);
        sb.append(", ").append(zLanguage);
        sb.append(", ").append(zCreateBy);
        sb.append(", ").append(zCreateTime);
        sb.append(", ").append(zUpdateBy);
        sb.append(", ").append(zUpdateTime);

        sb.append(")");
        return sb.toString();
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void from(IAtmIncoterm from) {
        setPkId(from.getPkId());
        setTComment(from.getTComment());
        setSName(from.getSName());
        setSCode(from.getSCode());
        setJConfig(from.getJConfig());
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
    public <E extends IAtmIncoterm> E into(E into) {
        into.from(this);
        return into;
    }

    public AtmIncoterm(io.vertx.core.json.JsonObject json) {
        fromJson(json);
    }
}
