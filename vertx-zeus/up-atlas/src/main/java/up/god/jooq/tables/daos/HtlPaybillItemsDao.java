/*
 * This file is generated by jOOQ.
*/
package up.god.jooq.tables.daos;


import io.github.jklingsporn.vertx.jooq.future.VertxDAO;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;

import up.god.jooq.tables.HtlPaybillItems;
import up.god.jooq.tables.records.HtlPaybillItemsRecord;


import java.util.concurrent.CompletableFuture;
import io.github.jklingsporn.vertx.jooq.future.util.FutureTool;
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
public class HtlPaybillItemsDao extends DAOImpl<HtlPaybillItemsRecord, up.god.jooq.tables.pojos.HtlPaybillItems, String> implements VertxDAO<up.god.jooq.tables.records.HtlPaybillItemsRecord,up.god.jooq.tables.pojos.HtlPaybillItems,java.lang.String> {

    /**
     * Create a new HtlPaybillItemsDao without any configuration
     */
    public HtlPaybillItemsDao() {
        super(HtlPaybillItems.HTL_PAYBILL_ITEMS, up.god.jooq.tables.pojos.HtlPaybillItems.class);
    }

    /**
     * Create a new HtlPaybillItemsDao with an attached configuration
     */
    public HtlPaybillItemsDao(Configuration configuration) {
        super(HtlPaybillItems.HTL_PAYBILL_ITEMS, up.god.jooq.tables.pojos.HtlPaybillItems.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getId(up.god.jooq.tables.pojos.HtlPaybillItems object) {
        return object.getPkId();
    }

    /**
     * Fetch records that have <code>PK_ID IN (values)</code>
     */
    public List<up.god.jooq.tables.pojos.HtlPaybillItems> fetchByPkId(String... values) {
        return fetch(HtlPaybillItems.HTL_PAYBILL_ITEMS.PK_ID, values);
    }

    /**
     * Fetch a unique record that has <code>PK_ID = value</code>
     */
    public up.god.jooq.tables.pojos.HtlPaybillItems fetchOneByPkId(String value) {
        return fetchOne(HtlPaybillItems.HTL_PAYBILL_ITEMS.PK_ID, value);
    }

    /**
     * Fetch records that have <code>D_AMOUNT_ACTUAL IN (values)</code>
     */
    public List<up.god.jooq.tables.pojos.HtlPaybillItems> fetchByDAmountActual(BigDecimal... values) {
        return fetch(HtlPaybillItems.HTL_PAYBILL_ITEMS.D_AMOUNT_ACTUAL, values);
    }

    /**
     * Fetch records that have <code>D_AMOUNT_TOTAL IN (values)</code>
     */
    public List<up.god.jooq.tables.pojos.HtlPaybillItems> fetchByDAmountTotal(BigDecimal... values) {
        return fetch(HtlPaybillItems.HTL_PAYBILL_ITEMS.D_AMOUNT_TOTAL, values);
    }

    /**
     * Fetch records that have <code>D_FINISHED_DATE IN (values)</code>
     */
    public List<up.god.jooq.tables.pojos.HtlPaybillItems> fetchByDFinishedDate(LocalDateTime... values) {
        return fetch(HtlPaybillItems.HTL_PAYBILL_ITEMS.D_FINISHED_DATE, values);
    }

    /**
     * Fetch records that have <code>D_OPERATE_DATE IN (values)</code>
     */
    public List<up.god.jooq.tables.pojos.HtlPaybillItems> fetchByDOperateDate(LocalDateTime... values) {
        return fetch(HtlPaybillItems.HTL_PAYBILL_ITEMS.D_OPERATE_DATE, values);
    }

    /**
     * Fetch records that have <code>D_PRICE IN (values)</code>
     */
    public List<up.god.jooq.tables.pojos.HtlPaybillItems> fetchByDPrice(BigDecimal... values) {
        return fetch(HtlPaybillItems.HTL_PAYBILL_ITEMS.D_PRICE, values);
    }

    /**
     * Fetch records that have <code>T_COMMENT IN (values)</code>
     */
    public List<up.god.jooq.tables.pojos.HtlPaybillItems> fetchByTComment(String... values) {
        return fetch(HtlPaybillItems.HTL_PAYBILL_ITEMS.T_COMMENT, values);
    }

    /**
     * Fetch records that have <code>S_CODE IN (values)</code>
     */
    public List<up.god.jooq.tables.pojos.HtlPaybillItems> fetchBySCode(String... values) {
        return fetch(HtlPaybillItems.HTL_PAYBILL_ITEMS.S_CODE, values);
    }

    /**
     * Fetch records that have <code>S_BRIEF IN (values)</code>
     */
    public List<up.god.jooq.tables.pojos.HtlPaybillItems> fetchBySBrief(String... values) {
        return fetch(HtlPaybillItems.HTL_PAYBILL_ITEMS.S_BRIEF, values);
    }

    /**
     * Fetch records that have <code>S_EMPLOYEE_NO IN (values)</code>
     */
    public List<up.god.jooq.tables.pojos.HtlPaybillItems> fetchBySEmployeeNo(String... values) {
        return fetch(HtlPaybillItems.HTL_PAYBILL_ITEMS.S_EMPLOYEE_NO, values);
    }

    /**
     * Fetch records that have <code>S_MANUAL_NO IN (values)</code>
     */
    public List<up.god.jooq.tables.pojos.HtlPaybillItems> fetchBySManualNo(String... values) {
        return fetch(HtlPaybillItems.HTL_PAYBILL_ITEMS.S_MANUAL_NO, values);
    }

    /**
     * Fetch records that have <code>S_SERIAL IN (values)</code>
     */
    public List<up.god.jooq.tables.pojos.HtlPaybillItems> fetchBySSerial(String... values) {
        return fetch(HtlPaybillItems.HTL_PAYBILL_ITEMS.S_SERIAL, values);
    }

    /**
     * Fetch records that have <code>S_SHIFT IN (values)</code>
     */
    public List<up.god.jooq.tables.pojos.HtlPaybillItems> fetchBySShift(String... values) {
        return fetch(HtlPaybillItems.HTL_PAYBILL_ITEMS.S_SHIFT, values);
    }

    /**
     * Fetch records that have <code>S_TRANSFER IN (values)</code>
     */
    public List<up.god.jooq.tables.pojos.HtlPaybillItems> fetchBySTransfer(String... values) {
        return fetch(HtlPaybillItems.HTL_PAYBILL_ITEMS.S_TRANSFER, values);
    }

    /**
     * Fetch records that have <code>J_CONFIG IN (values)</code>
     */
    public List<up.god.jooq.tables.pojos.HtlPaybillItems> fetchByJConfig(String... values) {
        return fetch(HtlPaybillItems.HTL_PAYBILL_ITEMS.J_CONFIG, values);
    }

    /**
     * Fetch records that have <code>I_LEFT IN (values)</code>
     */
    public List<up.god.jooq.tables.pojos.HtlPaybillItems> fetchByILeft(Long... values) {
        return fetch(HtlPaybillItems.HTL_PAYBILL_ITEMS.I_LEFT, values);
    }

    /**
     * Fetch records that have <code>I_LEVEL IN (values)</code>
     */
    public List<up.god.jooq.tables.pojos.HtlPaybillItems> fetchByILevel(Integer... values) {
        return fetch(HtlPaybillItems.HTL_PAYBILL_ITEMS.I_LEVEL, values);
    }

    /**
     * Fetch records that have <code>I_QUANTITY IN (values)</code>
     */
    public List<up.god.jooq.tables.pojos.HtlPaybillItems> fetchByIQuantity(Integer... values) {
        return fetch(HtlPaybillItems.HTL_PAYBILL_ITEMS.I_QUANTITY, values);
    }

    /**
     * Fetch records that have <code>I_RIGHT IN (values)</code>
     */
    public List<up.god.jooq.tables.pojos.HtlPaybillItems> fetchByIRight(Long... values) {
        return fetch(HtlPaybillItems.HTL_PAYBILL_ITEMS.I_RIGHT, values);
    }

    /**
     * Fetch records that have <code>I_SEQUENCE IN (values)</code>
     */
    public List<up.god.jooq.tables.pojos.HtlPaybillItems> fetchByISequence(Integer... values) {
        return fetch(HtlPaybillItems.HTL_PAYBILL_ITEMS.I_SEQUENCE, values);
    }

    /**
     * Fetch records that have <code>RLT_BILL_TYPE IN (values)</code>
     */
    public List<up.god.jooq.tables.pojos.HtlPaybillItems> fetchByRltBillType(Long... values) {
        return fetch(HtlPaybillItems.HTL_PAYBILL_ITEMS.RLT_BILL_TYPE, values);
    }

    /**
     * Fetch records that have <code>RLT_VALID IN (values)</code>
     */
    public List<up.god.jooq.tables.pojos.HtlPaybillItems> fetchByRltValid(Long... values) {
        return fetch(HtlPaybillItems.HTL_PAYBILL_ITEMS.RLT_VALID, values);
    }

    /**
     * Fetch records that have <code>R_PARENT_ID IN (values)</code>
     */
    public List<up.god.jooq.tables.pojos.HtlPaybillItems> fetchByRParentId(String... values) {
        return fetch(HtlPaybillItems.HTL_PAYBILL_ITEMS.R_PARENT_ID, values);
    }

    /**
     * Fetch records that have <code>R_PAYBILL_ID IN (values)</code>
     */
    public List<up.god.jooq.tables.pojos.HtlPaybillItems> fetchByRPaybillId(String... values) {
        return fetch(HtlPaybillItems.HTL_PAYBILL_ITEMS.R_PAYBILL_ID, values);
    }

    /**
     * Fetch records that have <code>R_PAYTERM_ID IN (values)</code>
     */
    public List<up.god.jooq.tables.pojos.HtlPaybillItems> fetchByRPaytermId(String... values) {
        return fetch(HtlPaybillItems.HTL_PAYBILL_ITEMS.R_PAYTERM_ID, values);
    }

    /**
     * Fetch records that have <code>IS_FINISHED IN (values)</code>
     */
    public List<up.god.jooq.tables.pojos.HtlPaybillItems> fetchByIsFinished(Boolean... values) {
        return fetch(HtlPaybillItems.HTL_PAYBILL_ITEMS.IS_FINISHED, values);
    }

    /**
     * Fetch records that have <code>IS_INCOME IN (values)</code>
     */
    public List<up.god.jooq.tables.pojos.HtlPaybillItems> fetchByIsIncome(Boolean... values) {
        return fetch(HtlPaybillItems.HTL_PAYBILL_ITEMS.IS_INCOME, values);
    }

    /**
     * Fetch records that have <code>IS_ACTIVE IN (values)</code>
     */
    public List<up.god.jooq.tables.pojos.HtlPaybillItems> fetchByIsActive(Boolean... values) {
        return fetch(HtlPaybillItems.HTL_PAYBILL_ITEMS.IS_ACTIVE, values);
    }

    /**
     * Fetch records that have <code>Z_SIGMA IN (values)</code>
     */
    public List<up.god.jooq.tables.pojos.HtlPaybillItems> fetchByZSigma(String... values) {
        return fetch(HtlPaybillItems.HTL_PAYBILL_ITEMS.Z_SIGMA, values);
    }

    /**
     * Fetch records that have <code>Z_LANGUAGE IN (values)</code>
     */
    public List<up.god.jooq.tables.pojos.HtlPaybillItems> fetchByZLanguage(String... values) {
        return fetch(HtlPaybillItems.HTL_PAYBILL_ITEMS.Z_LANGUAGE, values);
    }

    /**
     * Fetch records that have <code>Z_CREATE_BY IN (values)</code>
     */
    public List<up.god.jooq.tables.pojos.HtlPaybillItems> fetchByZCreateBy(String... values) {
        return fetch(HtlPaybillItems.HTL_PAYBILL_ITEMS.Z_CREATE_BY, values);
    }

    /**
     * Fetch records that have <code>Z_CREATE_TIME IN (values)</code>
     */
    public List<up.god.jooq.tables.pojos.HtlPaybillItems> fetchByZCreateTime(LocalDateTime... values) {
        return fetch(HtlPaybillItems.HTL_PAYBILL_ITEMS.Z_CREATE_TIME, values);
    }

    /**
     * Fetch records that have <code>Z_UPDATE_BY IN (values)</code>
     */
    public List<up.god.jooq.tables.pojos.HtlPaybillItems> fetchByZUpdateBy(String... values) {
        return fetch(HtlPaybillItems.HTL_PAYBILL_ITEMS.Z_UPDATE_BY, values);
    }

    /**
     * Fetch records that have <code>Z_UPDATE_TIME IN (values)</code>
     */
    public List<up.god.jooq.tables.pojos.HtlPaybillItems> fetchByZUpdateTime(LocalDateTime... values) {
        return fetch(HtlPaybillItems.HTL_PAYBILL_ITEMS.Z_UPDATE_TIME, values);
    }

    /**
     * Fetch records that have <code>PK_ID IN (values)</code> asynchronously
     */
    public CompletableFuture<List<up.god.jooq.tables.pojos.HtlPaybillItems>> fetchByPkIdAsync(List<String> values) {
        return fetchAsync(HtlPaybillItems.HTL_PAYBILL_ITEMS.PK_ID,values);
    }

    /**
     * Fetch a unique record that has <code>PK_ID = value</code> asynchronously
     */
    public CompletableFuture<up.god.jooq.tables.pojos.HtlPaybillItems> fetchOneByPkIdAsync(String value) {
        return FutureTool.executeBlocking(h->h.complete(fetchOneByPkId(value)),vertx());
    }

    /**
     * Fetch records that have <code>D_AMOUNT_ACTUAL IN (values)</code> asynchronously
     */
    public CompletableFuture<List<up.god.jooq.tables.pojos.HtlPaybillItems>> fetchByDAmountActualAsync(List<BigDecimal> values) {
        return fetchAsync(HtlPaybillItems.HTL_PAYBILL_ITEMS.D_AMOUNT_ACTUAL,values);
    }

    /**
     * Fetch records that have <code>D_AMOUNT_TOTAL IN (values)</code> asynchronously
     */
    public CompletableFuture<List<up.god.jooq.tables.pojos.HtlPaybillItems>> fetchByDAmountTotalAsync(List<BigDecimal> values) {
        return fetchAsync(HtlPaybillItems.HTL_PAYBILL_ITEMS.D_AMOUNT_TOTAL,values);
    }

    /**
     * Fetch records that have <code>D_FINISHED_DATE IN (values)</code> asynchronously
     */
    public CompletableFuture<List<up.god.jooq.tables.pojos.HtlPaybillItems>> fetchByDFinishedDateAsync(List<LocalDateTime> values) {
        return fetchAsync(HtlPaybillItems.HTL_PAYBILL_ITEMS.D_FINISHED_DATE,values);
    }

    /**
     * Fetch records that have <code>D_OPERATE_DATE IN (values)</code> asynchronously
     */
    public CompletableFuture<List<up.god.jooq.tables.pojos.HtlPaybillItems>> fetchByDOperateDateAsync(List<LocalDateTime> values) {
        return fetchAsync(HtlPaybillItems.HTL_PAYBILL_ITEMS.D_OPERATE_DATE,values);
    }

    /**
     * Fetch records that have <code>D_PRICE IN (values)</code> asynchronously
     */
    public CompletableFuture<List<up.god.jooq.tables.pojos.HtlPaybillItems>> fetchByDPriceAsync(List<BigDecimal> values) {
        return fetchAsync(HtlPaybillItems.HTL_PAYBILL_ITEMS.D_PRICE,values);
    }

    /**
     * Fetch records that have <code>T_COMMENT IN (values)</code> asynchronously
     */
    public CompletableFuture<List<up.god.jooq.tables.pojos.HtlPaybillItems>> fetchByTCommentAsync(List<String> values) {
        return fetchAsync(HtlPaybillItems.HTL_PAYBILL_ITEMS.T_COMMENT,values);
    }

    /**
     * Fetch records that have <code>S_CODE IN (values)</code> asynchronously
     */
    public CompletableFuture<List<up.god.jooq.tables.pojos.HtlPaybillItems>> fetchBySCodeAsync(List<String> values) {
        return fetchAsync(HtlPaybillItems.HTL_PAYBILL_ITEMS.S_CODE,values);
    }

    /**
     * Fetch records that have <code>S_BRIEF IN (values)</code> asynchronously
     */
    public CompletableFuture<List<up.god.jooq.tables.pojos.HtlPaybillItems>> fetchBySBriefAsync(List<String> values) {
        return fetchAsync(HtlPaybillItems.HTL_PAYBILL_ITEMS.S_BRIEF,values);
    }

    /**
     * Fetch records that have <code>S_EMPLOYEE_NO IN (values)</code> asynchronously
     */
    public CompletableFuture<List<up.god.jooq.tables.pojos.HtlPaybillItems>> fetchBySEmployeeNoAsync(List<String> values) {
        return fetchAsync(HtlPaybillItems.HTL_PAYBILL_ITEMS.S_EMPLOYEE_NO,values);
    }

    /**
     * Fetch records that have <code>S_MANUAL_NO IN (values)</code> asynchronously
     */
    public CompletableFuture<List<up.god.jooq.tables.pojos.HtlPaybillItems>> fetchBySManualNoAsync(List<String> values) {
        return fetchAsync(HtlPaybillItems.HTL_PAYBILL_ITEMS.S_MANUAL_NO,values);
    }

    /**
     * Fetch records that have <code>S_SERIAL IN (values)</code> asynchronously
     */
    public CompletableFuture<List<up.god.jooq.tables.pojos.HtlPaybillItems>> fetchBySSerialAsync(List<String> values) {
        return fetchAsync(HtlPaybillItems.HTL_PAYBILL_ITEMS.S_SERIAL,values);
    }

    /**
     * Fetch records that have <code>S_SHIFT IN (values)</code> asynchronously
     */
    public CompletableFuture<List<up.god.jooq.tables.pojos.HtlPaybillItems>> fetchBySShiftAsync(List<String> values) {
        return fetchAsync(HtlPaybillItems.HTL_PAYBILL_ITEMS.S_SHIFT,values);
    }

    /**
     * Fetch records that have <code>S_TRANSFER IN (values)</code> asynchronously
     */
    public CompletableFuture<List<up.god.jooq.tables.pojos.HtlPaybillItems>> fetchBySTransferAsync(List<String> values) {
        return fetchAsync(HtlPaybillItems.HTL_PAYBILL_ITEMS.S_TRANSFER,values);
    }

    /**
     * Fetch records that have <code>J_CONFIG IN (values)</code> asynchronously
     */
    public CompletableFuture<List<up.god.jooq.tables.pojos.HtlPaybillItems>> fetchByJConfigAsync(List<String> values) {
        return fetchAsync(HtlPaybillItems.HTL_PAYBILL_ITEMS.J_CONFIG,values);
    }

    /**
     * Fetch records that have <code>I_LEFT IN (values)</code> asynchronously
     */
    public CompletableFuture<List<up.god.jooq.tables.pojos.HtlPaybillItems>> fetchByILeftAsync(List<Long> values) {
        return fetchAsync(HtlPaybillItems.HTL_PAYBILL_ITEMS.I_LEFT,values);
    }

    /**
     * Fetch records that have <code>I_LEVEL IN (values)</code> asynchronously
     */
    public CompletableFuture<List<up.god.jooq.tables.pojos.HtlPaybillItems>> fetchByILevelAsync(List<Integer> values) {
        return fetchAsync(HtlPaybillItems.HTL_PAYBILL_ITEMS.I_LEVEL,values);
    }

    /**
     * Fetch records that have <code>I_QUANTITY IN (values)</code> asynchronously
     */
    public CompletableFuture<List<up.god.jooq.tables.pojos.HtlPaybillItems>> fetchByIQuantityAsync(List<Integer> values) {
        return fetchAsync(HtlPaybillItems.HTL_PAYBILL_ITEMS.I_QUANTITY,values);
    }

    /**
     * Fetch records that have <code>I_RIGHT IN (values)</code> asynchronously
     */
    public CompletableFuture<List<up.god.jooq.tables.pojos.HtlPaybillItems>> fetchByIRightAsync(List<Long> values) {
        return fetchAsync(HtlPaybillItems.HTL_PAYBILL_ITEMS.I_RIGHT,values);
    }

    /**
     * Fetch records that have <code>I_SEQUENCE IN (values)</code> asynchronously
     */
    public CompletableFuture<List<up.god.jooq.tables.pojos.HtlPaybillItems>> fetchByISequenceAsync(List<Integer> values) {
        return fetchAsync(HtlPaybillItems.HTL_PAYBILL_ITEMS.I_SEQUENCE,values);
    }

    /**
     * Fetch records that have <code>RLT_BILL_TYPE IN (values)</code> asynchronously
     */
    public CompletableFuture<List<up.god.jooq.tables.pojos.HtlPaybillItems>> fetchByRltBillTypeAsync(List<Long> values) {
        return fetchAsync(HtlPaybillItems.HTL_PAYBILL_ITEMS.RLT_BILL_TYPE,values);
    }

    /**
     * Fetch records that have <code>RLT_VALID IN (values)</code> asynchronously
     */
    public CompletableFuture<List<up.god.jooq.tables.pojos.HtlPaybillItems>> fetchByRltValidAsync(List<Long> values) {
        return fetchAsync(HtlPaybillItems.HTL_PAYBILL_ITEMS.RLT_VALID,values);
    }

    /**
     * Fetch records that have <code>R_PARENT_ID IN (values)</code> asynchronously
     */
    public CompletableFuture<List<up.god.jooq.tables.pojos.HtlPaybillItems>> fetchByRParentIdAsync(List<String> values) {
        return fetchAsync(HtlPaybillItems.HTL_PAYBILL_ITEMS.R_PARENT_ID,values);
    }

    /**
     * Fetch records that have <code>R_PAYBILL_ID IN (values)</code> asynchronously
     */
    public CompletableFuture<List<up.god.jooq.tables.pojos.HtlPaybillItems>> fetchByRPaybillIdAsync(List<String> values) {
        return fetchAsync(HtlPaybillItems.HTL_PAYBILL_ITEMS.R_PAYBILL_ID,values);
    }

    /**
     * Fetch records that have <code>R_PAYTERM_ID IN (values)</code> asynchronously
     */
    public CompletableFuture<List<up.god.jooq.tables.pojos.HtlPaybillItems>> fetchByRPaytermIdAsync(List<String> values) {
        return fetchAsync(HtlPaybillItems.HTL_PAYBILL_ITEMS.R_PAYTERM_ID,values);
    }

    /**
     * Fetch records that have <code>IS_FINISHED IN (values)</code> asynchronously
     */
    public CompletableFuture<List<up.god.jooq.tables.pojos.HtlPaybillItems>> fetchByIsFinishedAsync(List<Boolean> values) {
        return fetchAsync(HtlPaybillItems.HTL_PAYBILL_ITEMS.IS_FINISHED,values);
    }

    /**
     * Fetch records that have <code>IS_INCOME IN (values)</code> asynchronously
     */
    public CompletableFuture<List<up.god.jooq.tables.pojos.HtlPaybillItems>> fetchByIsIncomeAsync(List<Boolean> values) {
        return fetchAsync(HtlPaybillItems.HTL_PAYBILL_ITEMS.IS_INCOME,values);
    }

    /**
     * Fetch records that have <code>IS_ACTIVE IN (values)</code> asynchronously
     */
    public CompletableFuture<List<up.god.jooq.tables.pojos.HtlPaybillItems>> fetchByIsActiveAsync(List<Boolean> values) {
        return fetchAsync(HtlPaybillItems.HTL_PAYBILL_ITEMS.IS_ACTIVE,values);
    }

    /**
     * Fetch records that have <code>Z_SIGMA IN (values)</code> asynchronously
     */
    public CompletableFuture<List<up.god.jooq.tables.pojos.HtlPaybillItems>> fetchByZSigmaAsync(List<String> values) {
        return fetchAsync(HtlPaybillItems.HTL_PAYBILL_ITEMS.Z_SIGMA,values);
    }

    /**
     * Fetch records that have <code>Z_LANGUAGE IN (values)</code> asynchronously
     */
    public CompletableFuture<List<up.god.jooq.tables.pojos.HtlPaybillItems>> fetchByZLanguageAsync(List<String> values) {
        return fetchAsync(HtlPaybillItems.HTL_PAYBILL_ITEMS.Z_LANGUAGE,values);
    }

    /**
     * Fetch records that have <code>Z_CREATE_BY IN (values)</code> asynchronously
     */
    public CompletableFuture<List<up.god.jooq.tables.pojos.HtlPaybillItems>> fetchByZCreateByAsync(List<String> values) {
        return fetchAsync(HtlPaybillItems.HTL_PAYBILL_ITEMS.Z_CREATE_BY,values);
    }

    /**
     * Fetch records that have <code>Z_CREATE_TIME IN (values)</code> asynchronously
     */
    public CompletableFuture<List<up.god.jooq.tables.pojos.HtlPaybillItems>> fetchByZCreateTimeAsync(List<LocalDateTime> values) {
        return fetchAsync(HtlPaybillItems.HTL_PAYBILL_ITEMS.Z_CREATE_TIME,values);
    }

    /**
     * Fetch records that have <code>Z_UPDATE_BY IN (values)</code> asynchronously
     */
    public CompletableFuture<List<up.god.jooq.tables.pojos.HtlPaybillItems>> fetchByZUpdateByAsync(List<String> values) {
        return fetchAsync(HtlPaybillItems.HTL_PAYBILL_ITEMS.Z_UPDATE_BY,values);
    }

    /**
     * Fetch records that have <code>Z_UPDATE_TIME IN (values)</code> asynchronously
     */
    public CompletableFuture<List<up.god.jooq.tables.pojos.HtlPaybillItems>> fetchByZUpdateTimeAsync(List<LocalDateTime> values) {
        return fetchAsync(HtlPaybillItems.HTL_PAYBILL_ITEMS.Z_UPDATE_TIME,values);
    }

    private io.vertx.core.Vertx vertx;

    @Override
    public void setVertx(io.vertx.core.Vertx vertx) {
        this.vertx = vertx;
    }

    @Override
    public io.vertx.core.Vertx vertx() {
        return this.vertx;
    }

}
