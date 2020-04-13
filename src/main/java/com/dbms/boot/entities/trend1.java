package com.dbms.boot.entities;

public class trend1 {
    private int year;
    private int price;

    public trend1(int year, int price) {
        this.year = year;
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
