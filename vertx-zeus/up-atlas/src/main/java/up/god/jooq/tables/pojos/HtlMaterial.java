/*
 * This file is generated by jOOQ.
*/
package up.god.jooq.tables.pojos;


import java.time.LocalDateTime;

import javax.annotation.Generated;

import up.god.jooq.tables.interfaces.IHtlMaterial;


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
public class HtlMaterial implements IHtlMaterial {

    private static final long serialVersionUID = 1699875558;

    private Long          pkId;
    private Long          lMaxBalance;
    private Long          lMinBalance;
    private Long          lQualityaperiod;
    private Long          lQualitygperiod;
    private String        vCostId;
    private String        vIncomeId;
    private String        vPaytermId;
    private String        sName;
    private String        sCode;
    private String        sHelpCode;
    private String        sPic;
    private String        sProductCat;
    private String        sProductCode;
    private String        sRepository;
    private String        sType;
    private String        sUnit;
    private String        jConfig;
    private String        rCategoryId;
    private Long          rHotelId;
    private Boolean       isProduct;
    private Boolean       isActive;
    private String        zSigma;
    private String        zLanguage;
    private String        zCreateBy;
    private LocalDateTime zCreateTime;
    private String        zUpdateBy;
    private LocalDateTime zUpdateTime;

    public HtlMaterial() {}

    public HtlMaterial(HtlMaterial value) {
        this.pkId = value.pkId;
        this.lMaxBalance = value.lMaxBalance;
        this.lMinBalance = value.lMinBalance;
        this.lQualityaperiod = value.lQualityaperiod;
        this.lQualitygperiod = value.lQualitygperiod;
        this.vCostId = value.vCostId;
        this.vIncomeId = value.vIncomeId;
        this.vPaytermId = value.vPaytermId;
        this.sName = value.sName;
        this.sCode = value.sCode;
        this.sHelpCode = value.sHelpCode;
        this.sPic = value.sPic;
        this.sProductCat = value.sProductCat;
        this.sProductCode = value.sProductCode;
        this.sRepository = value.sRepository;
        this.sType = value.sType;
        this.sUnit = value.sUnit;
        this.jConfig = value.jConfig;
        this.rCategoryId = value.rCategoryId;
        this.rHotelId = value.rHotelId;
        this.isProduct = value.isProduct;
        this.isActive = value.isActive;
        this.zSigma = value.zSigma;
        this.zLanguage = value.zLanguage;
        this.zCreateBy = value.zCreateBy;
        this.zCreateTime = value.zCreateTime;
        this.zUpdateBy = value.zUpdateBy;
        this.zUpdateTime = value.zUpdateTime;
    }

    public HtlMaterial(
        Long          pkId,
        Long          lMaxBalance,
        Long          lMinBalance,
        Long          lQualityaperiod,
        Long          lQualitygperiod,
        String        vCostId,
        String        vIncomeId,
        String        vPaytermId,
        String        sName,
        String        sCode,
        String        sHelpCode,
        String        sPic,
        String        sProductCat,
        String        sProductCode,
        String        sRepository,
        String        sType,
        String        sUnit,
        String        jConfig,
        String        rCategoryId,
        Long          rHotelId,
        Boolean       isProduct,
        Boolean       isActive,
        String        zSigma,
        String        zLanguage,
        String        zCreateBy,
        LocalDateTime zCreateTime,
        String        zUpdateBy,
        LocalDateTime zUpdateTime
    ) {
        this.pkId = pkId;
        this.lMaxBalance = lMaxBalance;
        this.lMinBalance = lMinBalance;
        this.lQualityaperiod = lQualityaperiod;
        this.lQualitygperiod = lQualitygperiod;
        this.vCostId = vCostId;
        this.vIncomeId = vIncomeId;
        this.vPaytermId = vPaytermId;
        this.sName = sName;
        this.sCode = sCode;
        this.sHelpCode = sHelpCode;
        this.sPic = sPic;
        this.sProductCat = sProductCat;
        this.sProductCode = sProductCode;
        this.sRepository = sRepository;
        this.sType = sType;
        this.sUnit = sUnit;
        this.jConfig = jConfig;
        this.rCategoryId = rCategoryId;
        this.rHotelId = rHotelId;
        this.isProduct = isProduct;
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
    public HtlMaterial setPkId(Long pkId) {
        this.pkId = pkId;
        return this;
    }

    @Override
    public Long getLMaxBalance() {
        return this.lMaxBalance;
    }

    @Override
    public HtlMaterial setLMaxBalance(Long lMaxBalance) {
        this.lMaxBalance = lMaxBalance;
        return this;
    }

    @Override
    public Long getLMinBalance() {
        return this.lMinBalance;
    }

    @Override
    public HtlMaterial setLMinBalance(Long lMinBalance) {
        this.lMinBalance = lMinBalance;
        return this;
    }

    @Override
    public Long getLQualityaperiod() {
        return this.lQualityaperiod;
    }

    @Override
    public HtlMaterial setLQualityaperiod(Long lQualityaperiod) {
        this.lQualityaperiod = lQualityaperiod;
        return this;
    }

    @Override
    public Long getLQualitygperiod() {
        return this.lQualitygperiod;
    }

    @Override
    public HtlMaterial setLQualitygperiod(Long lQualitygperiod) {
        this.lQualitygperiod = lQualitygperiod;
        return this;
    }

    @Override
    public String getVCostId() {
        return this.vCostId;
    }

    @Override
    public HtlMaterial setVCostId(String vCostId) {
        this.vCostId = vCostId;
        return this;
    }

    @Override
    public String getVIncomeId() {
        return this.vIncomeId;
    }

    @Override
    public HtlMaterial setVIncomeId(String vIncomeId) {
        this.vIncomeId = vIncomeId;
        return this;
    }

    @Override
    public String getVPaytermId() {
        return this.vPaytermId;
    }

    @Override
    public HtlMaterial setVPaytermId(String vPaytermId) {
        this.vPaytermId = vPaytermId;
        return this;
    }

    @Override
    public String getSName() {
        return this.sName;
    }

    @Override
    public HtlMaterial setSName(String sName) {
        this.sName = sName;
        return this;
    }

    @Override
    public String getSCode() {
        return this.sCode;
    }

    @Override
    public HtlMaterial setSCode(String sCode) {
        this.sCode = sCode;
        return this;
    }

    @Override
    public String getSHelpCode() {
        return this.sHelpCode;
    }

    @Override
    public HtlMaterial setSHelpCode(String sHelpCode) {
        this.sHelpCode = sHelpCode;
        return this;
    }

    @Override
    public String getSPic() {
        return this.sPic;
    }

    @Override
    public HtlMaterial setSPic(String sPic) {
        this.sPic = sPic;
        return this;
    }

    @Override
    public String getSProductCat() {
        return this.sProductCat;
    }

    @Override
    public HtlMaterial setSProductCat(String sProductCat) {
        this.sProductCat = sProductCat;
        return this;
    }

    @Override
    public String getSProductCode() {
        return this.sProductCode;
    }

    @Override
    public HtlMaterial setSProductCode(String sProductCode) {
        this.sProductCode = sProductCode;
        return this;
    }

    @Override
    public String getSRepository() {
        return this.sRepository;
    }

    @Override
    public HtlMaterial setSRepository(String sRepository) {
        this.sRepository = sRepository;
        return this;
    }

    @Override
    public String getSType() {
        return this.sType;
    }

    @Override
    public HtlMaterial setSType(String sType) {
        this.sType = sType;
        return this;
    }

    @Override
    public String getSUnit() {
        return this.sUnit;
    }

    @Override
    public HtlMaterial setSUnit(String sUnit) {
        this.sUnit = sUnit;
        return this;
    }

    @Override
    public String getJConfig() {
        return this.jConfig;
    }

    @Override
    public HtlMaterial setJConfig(String jConfig) {
        this.jConfig = jConfig;
        return this;
    }

    @Override
    public String getRCategoryId() {
        return this.rCategoryId;
    }

    @Override
    public HtlMaterial setRCategoryId(String rCategoryId) {
        this.rCategoryId = rCategoryId;
        return this;
    }

    @Override
    public Long getRHotelId() {
        return this.rHotelId;
    }

    @Override
    public HtlMaterial setRHotelId(Long rHotelId) {
        this.rHotelId = rHotelId;
        return this;
    }

    @Override
    public Boolean getIsProduct() {
        return this.isProduct;
    }

    @Override
    public HtlMaterial setIsProduct(Boolean isProduct) {
        this.isProduct = isProduct;
        return this;
    }

    @Override
    public Boolean getIsActive() {
        return this.isActive;
    }

    @Override
    public HtlMaterial setIsActive(Boolean isActive) {
        this.isActive = isActive;
        return this;
    }

    @Override
    public String getZSigma() {
        return this.zSigma;
    }

    @Override
    public HtlMaterial setZSigma(String zSigma) {
        this.zSigma = zSigma;
        return this;
    }

    @Override
    public String getZLanguage() {
        return this.zLanguage;
    }

    @Override
    public HtlMaterial setZLanguage(String zLanguage) {
        this.zLanguage = zLanguage;
        return this;
    }

    @Override
    public String getZCreateBy() {
        return this.zCreateBy;
    }

    @Override
    public HtlMaterial setZCreateBy(String zCreateBy) {
        this.zCreateBy = zCreateBy;
        return this;
    }

    @Override
    public LocalDateTime getZCreateTime() {
        return this.zCreateTime;
    }

    @Override
    public HtlMaterial setZCreateTime(LocalDateTime zCreateTime) {
        this.zCreateTime = zCreateTime;
        return this;
    }

    @Override
    public String getZUpdateBy() {
        return this.zUpdateBy;
    }

    @Override
    public HtlMaterial setZUpdateBy(String zUpdateBy) {
        this.zUpdateBy = zUpdateBy;
        return this;
    }

    @Override
    public LocalDateTime getZUpdateTime() {
        return this.zUpdateTime;
    }

    @Override
    public HtlMaterial setZUpdateTime(LocalDateTime zUpdateTime) {
        this.zUpdateTime = zUpdateTime;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("HtlMaterial (");

        sb.append(pkId);
        sb.append(", ").append(lMaxBalance);
        sb.append(", ").append(lMinBalance);
        sb.append(", ").append(lQualityaperiod);
        sb.append(", ").append(lQualitygperiod);
        sb.append(", ").append(vCostId);
        sb.append(", ").append(vIncomeId);
        sb.append(", ").append(vPaytermId);
        sb.append(", ").append(sName);
        sb.append(", ").append(sCode);
        sb.append(", ").append(sHelpCode);
        sb.append(", ").append(sPic);
        sb.append(", ").append(sProductCat);
        sb.append(", ").append(sProductCode);
        sb.append(", ").append(sRepository);
        sb.append(", ").append(sType);
        sb.append(", ").append(sUnit);
        sb.append(", ").append(jConfig);
        sb.append(", ").append(rCategoryId);
        sb.append(", ").append(rHotelId);
        sb.append(", ").append(isProduct);
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
    public void from(IHtlMaterial from) {
        setPkId(from.getPkId());
        setLMaxBalance(from.getLMaxBalance());
        setLMinBalance(from.getLMinBalance());
        setLQualityaperiod(from.getLQualityaperiod());
        setLQualitygperiod(from.getLQualitygperiod());
        setVCostId(from.getVCostId());
        setVIncomeId(from.getVIncomeId());
        setVPaytermId(from.getVPaytermId());
        setSName(from.getSName());
        setSCode(from.getSCode());
        setSHelpCode(from.getSHelpCode());
        setSPic(from.getSPic());
        setSProductCat(from.getSProductCat());
        setSProductCode(from.getSProductCode());
        setSRepository(from.getSRepository());
        setSType(from.getSType());
        setSUnit(from.getSUnit());
        setJConfig(from.getJConfig());
        setRCategoryId(from.getRCategoryId());
        setRHotelId(from.getRHotelId());
        setIsProduct(from.getIsProduct());
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
    public <E extends IHtlMaterial> E into(E into) {
        into.from(this);
        return into;
    }

    public HtlMaterial(io.vertx.core.json.JsonObject json) {
        fromJson(json);
    }
}
