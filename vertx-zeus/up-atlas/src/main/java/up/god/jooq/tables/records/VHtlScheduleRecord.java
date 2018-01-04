/*
 * This file is generated by jOOQ.
*/
package up.god.jooq.tables.records;


import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record12;
import org.jooq.Row12;
import org.jooq.impl.TableRecordImpl;

import up.god.jooq.tables.VHtlSchedule;
import up.god.jooq.tables.interfaces.IVHtlSchedule;


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
public class VHtlScheduleRecord extends TableRecordImpl<VHtlScheduleRecord> implements Record12<Long, String, String, Long, Integer, Integer, Long, LocalDateTime, LocalDate, Long, Long, String>, IVHtlSchedule {

    private static final long serialVersionUID = 1643869840;

    /**
     * Setter for <code>DB_HTL.v_htl_schedule.PK_ID</code>. uniqueId,PK_ID
     */
    @Override
    public VHtlScheduleRecord setPkId(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>DB_HTL.v_htl_schedule.PK_ID</code>. uniqueId,PK_ID
     */
    @Override
    public Long getPkId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>DB_HTL.v_htl_schedule.S_SERIAL</code>. serial,S_SERIAL
     */
    @Override
    public VHtlScheduleRecord setSSerial(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>DB_HTL.v_htl_schedule.S_SERIAL</code>. serial,S_SERIAL
     */
    @Override
    public String getSSerial() {
        return (String) get(1);
    }

    /**
     * Setter for <code>DB_HTL.v_htl_schedule.S_ROOM_NUM</code>. roomNumber,S_ROOM_NUM
     */
    @Override
    public VHtlScheduleRecord setSRoomNum(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>DB_HTL.v_htl_schedule.S_ROOM_NUM</code>. roomNumber,S_ROOM_NUM
     */
    @Override
    public String getSRoomNum() {
        return (String) get(2);
    }

    /**
     * Setter for <code>DB_HTL.v_htl_schedule.R_ROOM_ID</code>. uniqueId,PK_ID
     */
    @Override
    public VHtlScheduleRecord setRRoomId(Long value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>DB_HTL.v_htl_schedule.R_ROOM_ID</code>. uniqueId,PK_ID
     */
    @Override
    public Long getRRoomId() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>DB_HTL.v_htl_schedule.I_INOCCUP</code>. inoccup,I_INOCCUP
     */
    @Override
    public VHtlScheduleRecord setIInoccup(Integer value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>DB_HTL.v_htl_schedule.I_INOCCUP</code>. inoccup,I_INOCCUP
     */
    @Override
    public Integer getIInoccup() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>DB_HTL.v_htl_schedule.I_PERSON</code>. person,I_PERSON
     */
    @Override
    public VHtlScheduleRecord setIPerson(Integer value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>DB_HTL.v_htl_schedule.I_PERSON</code>. person,I_PERSON
     */
    @Override
    public Integer getIPerson() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>DB_HTL.v_htl_schedule.R_ROOM_TYPE_ID</code>. roomTypeId,R_ROOM_TYPE_ID
     */
    @Override
    public VHtlScheduleRecord setRRoomTypeId(Long value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>DB_HTL.v_htl_schedule.R_ROOM_TYPE_ID</code>. roomTypeId,R_ROOM_TYPE_ID
     */
    @Override
    public Long getRRoomTypeId() {
        return (Long) get(6);
    }

    /**
     * Setter for <code>DB_HTL.v_htl_schedule.D_ARRIVE_TIME</code>. arriveTime,D_ARRIVE_TIME
     */
    @Override
    public VHtlScheduleRecord setDArriveTime(LocalDateTime value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>DB_HTL.v_htl_schedule.D_ARRIVE_TIME</code>. arriveTime,D_ARRIVE_TIME
     */
    @Override
    public LocalDateTime getDArriveTime() {
        return (LocalDateTime) get(7);
    }

    /**
     * Setter for <code>DB_HTL.v_htl_schedule.D_DAY</code>.
     */
    @Override
    public VHtlScheduleRecord setDDay(LocalDate value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>DB_HTL.v_htl_schedule.D_DAY</code>.
     */
    @Override
    public LocalDate getDDay() {
        return (LocalDate) get(8);
    }

    /**
     * Setter for <code>DB_HTL.v_htl_schedule.R_HOTEL_ID</code>. hotelId,R_HOTEL_ID
     */
    @Override
    public VHtlScheduleRecord setRHotelId(Long value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>DB_HTL.v_htl_schedule.R_HOTEL_ID</code>. hotelId,R_HOTEL_ID
     */
    @Override
    public Long getRHotelId() {
        return (Long) get(9);
    }

    /**
     * Setter for <code>DB_HTL.v_htl_schedule.R_OITEM_ID</code>. oitemId,R_OITEM_ID
     */
    @Override
    public VHtlScheduleRecord setROitemId(Long value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>DB_HTL.v_htl_schedule.R_OITEM_ID</code>. oitemId,R_OITEM_ID
     */
    @Override
    public Long getROitemId() {
        return (Long) get(10);
    }

    /**
     * Setter for <code>DB_HTL.v_htl_schedule.S_OPERATOR</code>. operator,S_OPERATOR
     */
    @Override
    public VHtlScheduleRecord setSOperator(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>DB_HTL.v_htl_schedule.S_OPERATOR</code>. operator,S_OPERATOR
     */
    @Override
    public String getSOperator() {
        return (String) get(11);
    }

    // -------------------------------------------------------------------------
    // Record12 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<Long, String, String, Long, Integer, Integer, Long, LocalDateTime, LocalDate, Long, Long, String> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<Long, String, String, Long, Integer, Integer, Long, LocalDateTime, LocalDate, Long, Long, String> valuesRow() {
        return (Row12) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return VHtlSchedule.V_HTL_SCHEDULE.PK_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return VHtlSchedule.V_HTL_SCHEDULE.S_SERIAL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return VHtlSchedule.V_HTL_SCHEDULE.S_ROOM_NUM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field4() {
        return VHtlSchedule.V_HTL_SCHEDULE.R_ROOM_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return VHtlSchedule.V_HTL_SCHEDULE.I_INOCCUP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return VHtlSchedule.V_HTL_SCHEDULE.I_PERSON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field7() {
        return VHtlSchedule.V_HTL_SCHEDULE.R_ROOM_TYPE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field8() {
        return VHtlSchedule.V_HTL_SCHEDULE.D_ARRIVE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDate> field9() {
        return VHtlSchedule.V_HTL_SCHEDULE.D_DAY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field10() {
        return VHtlSchedule.V_HTL_SCHEDULE.R_HOTEL_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field11() {
        return VHtlSchedule.V_HTL_SCHEDULE.R_OITEM_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return VHtlSchedule.V_HTL_SCHEDULE.S_OPERATOR;
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
        return getSSerial();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getSRoomNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component4() {
        return getRRoomId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getIInoccup();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component6() {
        return getIPerson();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component7() {
        return getRRoomTypeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime component8() {
        return getDArriveTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDate component9() {
        return getDDay();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component10() {
        return getRHotelId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component11() {
        return getROitemId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component12() {
        return getSOperator();
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
        return getSSerial();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getSRoomNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value4() {
        return getRRoomId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getIInoccup();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getIPerson();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value7() {
        return getRRoomTypeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value8() {
        return getDArriveTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDate value9() {
        return getDDay();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value10() {
        return getRHotelId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value11() {
        return getROitemId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getSOperator();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VHtlScheduleRecord value1(Long value) {
        setPkId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VHtlScheduleRecord value2(String value) {
        setSSerial(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VHtlScheduleRecord value3(String value) {
        setSRoomNum(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VHtlScheduleRecord value4(Long value) {
        setRRoomId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VHtlScheduleRecord value5(Integer value) {
        setIInoccup(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VHtlScheduleRecord value6(Integer value) {
        setIPerson(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VHtlScheduleRecord value7(Long value) {
        setRRoomTypeId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VHtlScheduleRecord value8(LocalDateTime value) {
        setDArriveTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VHtlScheduleRecord value9(LocalDate value) {
        setDDay(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VHtlScheduleRecord value10(Long value) {
        setRHotelId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VHtlScheduleRecord value11(Long value) {
        setROitemId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VHtlScheduleRecord value12(String value) {
        setSOperator(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VHtlScheduleRecord values(Long value1, String value2, String value3, Long value4, Integer value5, Integer value6, Long value7, LocalDateTime value8, LocalDate value9, Long value10, Long value11, String value12) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void from(IVHtlSchedule from) {
        setPkId(from.getPkId());
        setSSerial(from.getSSerial());
        setSRoomNum(from.getSRoomNum());
        setRRoomId(from.getRRoomId());
        setIInoccup(from.getIInoccup());
        setIPerson(from.getIPerson());
        setRRoomTypeId(from.getRRoomTypeId());
        setDArriveTime(from.getDArriveTime());
        setDDay(from.getDDay());
        setRHotelId(from.getRHotelId());
        setROitemId(from.getROitemId());
        setSOperator(from.getSOperator());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends IVHtlSchedule> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached VHtlScheduleRecord
     */
    public VHtlScheduleRecord() {
        super(VHtlSchedule.V_HTL_SCHEDULE);
    }

    /**
     * Create a detached, initialised VHtlScheduleRecord
     */
    public VHtlScheduleRecord(Long pkId, String sSerial, String sRoomNum, Long rRoomId, Integer iInoccup, Integer iPerson, Long rRoomTypeId, LocalDateTime dArriveTime, LocalDate dDay, Long rHotelId, Long rOitemId, String sOperator) {
        super(VHtlSchedule.V_HTL_SCHEDULE);

        set(0, pkId);
        set(1, sSerial);
        set(2, sRoomNum);
        set(3, rRoomId);
        set(4, iInoccup);
        set(5, iPerson);
        set(6, rRoomTypeId);
        set(7, dArriveTime);
        set(8, dDay);
        set(9, rHotelId);
        set(10, rOitemId);
        set(11, sOperator);
    }
}
