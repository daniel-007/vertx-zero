/*
 * This file is generated by jOOQ.
*/
package up.god.jooq.tables.pojos;


import java.time.LocalDateTime;

import javax.annotation.Generated;

import up.god.jooq.tables.interfaces.IAtmAccountItem;


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
public class AtmAccountItem implements IAtmAccountItem {

    private static final long serialVersionUID = 1401204936;

    private String        pkId;
    private String        tComment;
    private String        sName;
    private String        sCode;
    private String        sHelpCode;
    private String        sSerial;
    private String        jConfig;
    private Long          iLeft;
    private Integer       iLevel;
    private Long          iRight;
    private String        hCatId;
    private Long          rCompanyId;
    private String        rParentId;
    private Boolean       isActive;
    private String        zSigma;
    private String        zLanguage;
    private String        zCreateBy;
    private LocalDateTime zCreateTime;
    private String        zUpdateBy;
    private LocalDateTime zUpdateTime;

    public AtmAccountItem() {}

    public AtmAccountItem(AtmAccountItem value) {
        this.pkId = value.pkId;
        this.tComment = value.tComment;
        this.sName = value.sName;
        this.sCode = value.sCode;
        this.sHelpCode = value.sHelpCode;
        this.sSerial = value.sSerial;
        this.jConfig = value.jConfig;
        this.iLeft = value.iLeft;
        this.iLevel = value.iLevel;
        this.iRight = value.iRight;
        this.hCatId = value.hCatId;
        this.rCompanyId = value.rCompanyId;
        this.rParentId = value.rParentId;
        this.isActive = value.isActive;
        this.zSigma = value.zSigma;
        this.zLanguage = value.zLanguage;
        this.zCreateBy = value.zCreateBy;
        this.zCreateTime = value.zCreateTime;
        this.zUpdateBy = value.zUpdateBy;
        this.zUpdateTime = value.zUpdateTime;
    }

    public AtmAccountItem(
        String        pkId,
        String        tComment,
        String        sName,
        String        sCode,
        String        sHelpCode,
        String        sSerial,
        String        jConfig,
        Long          iLeft,
        Integer       iLevel,
        Long          iRight,
        String        hCatId,
        Long          rCompanyId,
        String        rParentId,
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
        this.sHelpCode = sHelpCode;
        this.sSerial = sSerial;
        this.jConfig = jConfig;
        this.iLeft = iLeft;
        this.iLevel = iLevel;
        this.iRight = iRight;
        this.hCatId = hCatId;
        this.rCompanyId = rCompanyId;
        this.rParentId = rParentId;
        this.isActive = isActive;
        this.zSigma = zSigma;
        this.zLanguage = zLanguage;
        this.zCreateBy = zCreateBy;
        this.zCreateTime = zCreateTime;
        this.zUpdateBy = zUpdateBy;
        this.zUpdateTime = zUpdateTime;
    }

    @Override
    public String getPkId() {
        return this.pkId;
    }

    @Override
    public AtmAccountItem setPkId(String pkId) {
        this.pkId = pkId;
        return this;
    }

    @Override
    public String getTComment() {
        return this.tComment;
    }

    @Override
    public AtmAccountItem setTComment(String tComment) {
        this.tComment = tComment;
        return this;
    }

    @Override
    public String getSName() {
        return this.sName;
    }

    @Override
    public AtmAccountItem setSName(String sName) {
        this.sName = sName;
        return this;
    }

    @Override
    public String getSCode() {
        return this.sCode;
    }

    @Override
    public AtmAccountItem setSCode(String sCode) {
        this.sCode = sCode;
        return this;
    }

    @Override
    public String getSHelpCode() {
        return this.sHelpCode;
    }

    @Override
    public AtmAccountItem setSHelpCode(String sHelpCode) {
        this.sHelpCode = sHelpCode;
        return this;
    }

    @Override
    public String getSSerial() {
        return this.sSerial;
    }

    @Override
    public AtmAccountItem setSSerial(String sSerial) {
        this.sSerial = sSerial;
        return this;
    }

    @Override
    public String getJConfig() {
        return this.jConfig;
    }

    @Override
    public AtmAccountItem setJConfig(String jConfig) {
        this.jConfig = jConfig;
        return this;
    }

    @Override
    public Long getILeft() {
        return this.iLeft;
    }

    @Override
    public AtmAccountItem setILeft(Long iLeft) {
        this.iLeft = iLeft;
        return this;
    }

    @Override
    public Integer getILevel() {
        return this.iLevel;
    }

    @Override
    public AtmAccountItem setILevel(Integer iLevel) {
        this.iLevel = iLevel;
        return this;
    }

    @Override
    public Long getIRight() {
        return this.iRight;
    }

    @Override
    public AtmAccountItem setIRight(Long iRight) {
        this.iRight = iRight;
        return this;
    }

    @Override
    public String getHCatId() {
        return this.hCatId;
    }

    @Override
    public AtmAccountItem setHCatId(String hCatId) {
        this.hCatId = hCatId;
        return this;
    }

    @Override
    public Long getRCompanyId() {
        return this.rCompanyId;
    }

    @Override
    public AtmAccountItem setRCompanyId(Long rCompanyId) {
        this.rCompanyId = rCompanyId;
        return this;
    }

    @Override
    public String getRParentId() {
        return this.rParentId;
    }

    @Override
    public AtmAccountItem setRParentId(String rParentId) {
        this.rParentId = rParentId;
        return this;
    }

    @Override
    public Boolean getIsActive() {
        return this.isActive;
    }

    @Override
    public AtmAccountItem setIsActive(Boolean isActive) {
        this.isActive = isActive;
        return this;
    }

    @Override
    public String getZSigma() {
        return this.zSigma;
    }

    @Override
    public AtmAccountItem setZSigma(String zSigma) {
        this.zSigma = zSigma;
        return this;
    }

    @Override
    public String getZLanguage() {
        return this.zLanguage;
    }

    @Override
    public AtmAccountItem setZLanguage(String zLanguage) {
        this.zLanguage = zLanguage;
        return this;
    }

    @Override
    public String getZCreateBy() {
        return this.zCreateBy;
    }

    @Override
    public AtmAccountItem setZCreateBy(String zCreateBy) {
        this.zCreateBy = zCreateBy;
        return this;
    }

    @Override
    public LocalDateTime getZCreateTime() {
        return this.zCreateTime;
    }

    @Override
    public AtmAccountItem setZCreateTime(LocalDateTime zCreateTime) {
        this.zCreateTime = zCreateTime;
        return this;
    }

    @Override
    public String getZUpdateBy() {
        return this.zUpdateBy;
    }

    @Override
    public AtmAccountItem setZUpdateBy(String zUpdateBy) {
        this.zUpdateBy = zUpdateBy;
        return this;
    }

    @Override
    public LocalDateTime getZUpdateTime() {
        return this.zUpdateTime;
    }

    @Override
    public AtmAccountItem setZUpdateTime(LocalDateTime zUpdateTime) {
        this.zUpdateTime = zUpdateTime;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("AtmAccountItem (");

        sb.append(pkId);
        sb.append(", ").append(tComment);
        sb.append(", ").append(sName);
        sb.append(", ").append(sCode);
        sb.append(", ").append(sHelpCode);
        sb.append(", ").append(sSerial);
        sb.append(", ").append(jConfig);
        sb.append(", ").append(iLeft);
        sb.append(", ").append(iLevel);
        sb.append(", ").append(iRight);
        sb.append(", ").append(hCatId);
        sb.append(", ").append(rCompanyId);
        sb.append(", ").append(rParentId);
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
    public void from(IAtmAccountItem from) {
        setPkId(from.getPkId());
        setTComment(from.getTComment());
        setSName(from.getSName());
        setSCode(from.getSCode());
        setSHelpCode(from.getSHelpCode());
        setSSerial(from.getSSerial());
        setJConfig(from.getJConfig());
        setILeft(from.getILeft());
        setILevel(from.getILevel());
        setIRight(from.getIRight());
        setHCatId(from.getHCatId());
        setRCompanyId(from.getRCompanyId());
        setRParentId(from.getRParentId());
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
    public <E extends IAtmAccountItem> E into(E into) {
        into.from(this);
        return into;
    }

    public AtmAccountItem(io.vertx.core.json.JsonObject json) {
        fromJson(json);
    }
}
