package com.zalando.zalando.Model.Entities;

import java.util.Date;

public class Order {
    private int orderID;
    private Date date;
    private int totalDue;
    private int fkCustomerID;

    public Order() {
    }

    public Order(int orderID, Date date, int totalDue, int fkCustomerID) {
        this.orderID = orderID;
        this.date = date;
        this.totalDue = totalDue;
        this.fkCustomerID = fkCustomerID;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getTotalDue() {
        return totalDue;
    }

    public void setTotalDue(int totalDue) {
        this.totalDue = totalDue;
    }

    public int getFkCustomerID() {
        return fkCustomerID;
    }

    public void setFkCustomerID(int fkCustomerID) {
        this.fkCustomerID = fkCustomerID;
    }
}