package com.dbms.boot.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//@JsonIgnoreProperties(value = {"handler","hibernateLazyInitializer","fieldHandler"})
public class Trend7 {
    private int year;
    private int data1;
    private String label1;
    private int data2;
    private String label2;
    private int data3;
    private String label3;

    public Trend7() {
    }

    public Trend7(int year, int data1, String label1, int data2, String label2) {
        this.year = year;
        this.data1 = data1;
        this.label1 = label1;
        this.data2 = data2;
        this.label2 = label2;
    }

    public Trend7(int year, int data1, String label1, int data2, String label2, int data3, String label3) {
        this.year = year;
        this.data1 = data1;
        this.label1 = label1;
        this.data2 = data2;
        this.label2 = label2;
        this.data3 = data3;
        this.label3 = label3;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getData1() {
        return data1;
    }

    public void setData1(int data1) {
        this.data1 = data1;
    }

    public String getLabel1() {
        return label1;
    }

    public void setLabel1(String label1) {
        this.label1 = label1;
    }

    public int getData2() {
        return data2;
    }

    public void setData2(int data2) {
        this.data2 = data2;
    }

    public String getLabel2() {
        return label2;
    }

    public void setLabel2(String label2) {
        this.label2 = label2;
    }

    public int getData3() {
        return data3;
    }

    public void setData3(int data3) {
        this.data3 = data3;
    }

    public String getLabel3() {
        return label3;
    }

    public void setLabel3(String label3) {
        this.label3 = label3;
    }
}
