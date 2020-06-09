package cn.alipapa.seat.dao;

import java.util.Date;

public class Reservations {
    private int user_id;
    private int seat_id;
    private Date start;
    private Date end;
    private Date enter_time;
    private Date leave_time;
    private Date reservation_data;

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getSeat_id() {
        return seat_id;
    }

    public void setSeat_id(int seat_id) {
        this.seat_id = seat_id;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public Date getEnter_time() {
        return enter_time;
    }

    public void setEnter_time(Date enter_time) {
        this.enter_time = enter_time;
    }

    public Date getLeave_time() {
        return leave_time;
    }

    public void setLeave_time(Date leave_time) {
        this.leave_time = leave_time;
    }

    public Date getReservation_data() {
        return reservation_data;
    }

    public void setReservation_data(Date reservation_data) {
        this.reservation_data = reservation_data;
    }
}