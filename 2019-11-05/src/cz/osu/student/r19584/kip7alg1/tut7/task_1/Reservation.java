package cz.osu.student.r19584.kip7alg1.tut7.task_1;

import java.time.LocalDate;

public class Reservation {
    private Integer id;
    private LocalDate startDay;
    private Integer length;
    private String customer;
    private Room room;
    private boolean paid;

    private static int lastId;

    public Reservation(LocalDate startDay, Integer length, String customer, Room room) {
        this.id = (++lastId);
        this.startDay = startDay;
        this.length = length;
        this.customer = customer;
        this.room = room;
        this.paid = false;
    }

    public LocalDate getEndDate() {
        return startDay.plusDays(length);
    }

    public Integer getId() {
        return id;
    }

    public LocalDate getStartDay() {
        return startDay;
    }

    public Integer getLength() {
        return length;
    }

    public String getCustomer() {
        return customer;
    }

    public Room getRoom() {
        return room;
    }

    public boolean isPaid() {
        return paid;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setStartDay(LocalDate startDay) {
        this.startDay = startDay;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    @Override
    public String toString() {
        return "Reservation{" + "id=" + id + ", startDay=" + startDay + ", length=" + length + ", endDay="
                + getEndDate() + ", customer='" + customer + '\'' + ", room=" + room + ", paid=" + paid + '}';
    }
}
