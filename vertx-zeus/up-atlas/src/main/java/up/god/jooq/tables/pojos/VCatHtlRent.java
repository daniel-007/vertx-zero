/*
 * This file is generated by jOOQ.
*/
package up.god.jooq.tables.pojos;


import java.time.LocalDateTime;

import javax.annotation.Generated;

import up.god.jooq.tables.interfaces.IVCatHtlRent;


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
public class VCatHtlRent implements IVCatHtlRent {

    private static final long serialVersionUID = 1552972922;

    private Long          aPkId;
    private String        sThing;
    private String        sContact;
    private String        sCall;
    private String        tComment;
    private LocalDateTime zCreateTime;
    private LocalDateTime zUpdateTime;
    private Long          rHotelId;
    private String        sName;
    private String        cSCode;
    private String        cSType;

    public VCatHtlRent() {}

    public VCatHtlRent(VCatHtlRent value) {
        this.aPkId = value.aPkId;
        this.sThing = value.sThing;
        this.sContact = value.sContact;
        this.sCall = value.sCall;
        this.tComment = value.tComment;
        this.zCreateTime = value.zCreateTime;
        this.zUpdateTime = value.zUpdateTime;
        this.rHotelId = value.rHotelId;
        this.sName = value.sName;
        this.cSCode = value.cSCode;
        this.cSType = value.cSType;
    }

    public VCatHtlRent(
        Long          aPkId,
        String        sThing,
        String        sContact,
        String        sCall,
        String        tComment,
        LocalDateTime zCreateTime,
        LocalDateTime zUpdateTime,
        Long          rHotelId,
        String        sName,
        String        cSCode,
        String        cSType
    ) {
        this.aPkId = aPkId;
        this.sThing = sThing;
        this.sContact = sContact;
        this.sCall = sCall;
        this.tComment = tComment;
        this.zCreateTime = zCreateTime;
        this.zUpdateTime = zUpdateTime;
        this.rHotelId = rHotelId;
        this.sName = sName;
        this.cSCode = cSCode;
        this.cSType = cSType;
    }

    @Override
    public Long getAPkId() {
        return this.aPkId;
    }

    @Override
    public VCatHtlRent setAPkId(Long aPkId) {
        this.aPkId = aPkId;
        return this;
    }

    @Override
    public String getSThing() {
        return this.sThing;
    }

    @Override
    public VCatHtlRent setSThing(String sThing) {
        this.sThing = sThing;
        return this;
    }

    @Override
    public String getSContact() {
        return this.sContact;
    }

    @Override
    public VCatHtlRent setSContact(String sContact) {
        this.sContact = sContact;
        return this;
    }

    @Override
    public String getSCall() {
        return this.sCall;
    }

    @Override
    public VCatHtlRent setSCall(String sCall) {
        this.sCall = sCall;
        return this;
    }

    @Override
    public String getTComment() {
        return this.tComment;
    }

    @Override
    public VCatHtlRent setTComment(String tComment) {
        this.tComment = tComment;
        return this;
    }

    @Override
    public LocalDateTime getZCreateTime() {
        return this.zCreateTime;
    }

    @Override
    public VCatHtlRent setZCreateTime(LocalDateTime zCreateTime) {
        this.zCreateTime = zCreateTime;
        return this;
    }

    @Override
    public LocalDateTime getZUpdateTime() {
        return this.zUpdateTime;
    }

    @Override
    public VCatHtlRent setZUpdateTime(LocalDateTime zUpdateTime) {
        this.zUpdateTime = zUpdateTime;
        return this;
    }

    @Override
    public Long getRHotelId() {
        return this.rHotelId;
    }

    @Override
    public VCatHtlRent setRHotelId(Long rHotelId) {
        this.rHotelId = rHotelId;
        return this;
    }

    @Override
    public String getSName() {
        return this.sName;
    }

    @Override
    public VCatHtlRent setSName(String sName) {
        this.sName = sName;
        return this;
    }

    @Override
    public String getCSCode() {
        return this.cSCode;
    }

    @Override
    public VCatHtlRent setCSCode(String cSCode) {
        this.cSCode = cSCode;
        return this;
    }

    @Override
    public String getCSType() {
        return this.cSType;
    }

    @Override
    public VCatHtlRent setCSType(String cSType) {
        this.cSType = cSType;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("VCatHtlRent (");

        sb.append(aPkId);
        sb.append(", ").append(sThing);
        sb.append(", ").append(sContact);
        sb.append(", ").append(sCall);
        sb.append(", ").append(tComment);
        sb.append(", ").append(zCreateTime);
        sb.append(", ").append(zUpdateTime);
        sb.append(", ").append(rHotelId);
        sb.append(", ").append(sName);
        sb.append(", ").append(cSCode);
        sb.append(", ").append(cSType);

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
    public void from(IVCatHtlRent from) {
        setAPkId(from.getAPkId());
        setSThing(from.getSThing());
        setSContact(from.getSContact());
        setSCall(from.getSCall());
        setTComment(from.getTComment());
        setZCreateTime(from.getZCreateTime());
        setZUpdateTime(from.getZUpdateTime());
        setRHotelId(from.getRHotelId());
        setSName(from.getSName());
        setCSCode(from.getCSCode());
        setCSType(from.getCSType());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends IVCatHtlRent> E into(E into) {
        into.from(this);
        return into;
    }

    public VCatHtlRent(io.vertx.core.json.JsonObject json) {
        fromJson(json);
    }
}
