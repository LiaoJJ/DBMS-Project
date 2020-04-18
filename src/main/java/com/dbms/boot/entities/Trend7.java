package com.dbms.boot.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/*
这个是转化为 JSON 传到 js 里面去的那个类：
类名可以变, attribute的名字不能变,
year 是年份
data1 和 label1 对应第一种数据, 比如Trend1中的avgprice
data2 和 label2 对应第二种数据, 比如Trend1中的numof
data3 和 label3 对应第三种数据, Trend1中没有第三种数据, 空白即可
4 同理
5 同理
 */
public class Trend7 {
    private int year;
    private int data1;
    private String label1;
    private int data2;
    private String label2;
    private int data3;
    private String label3;
    private int data4;
    private String label4;
    private int data5;
    private String label5;

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

    public Trend7(int year, int data1, String label1, int data2, String label2, int data3, String label3, int data4, String label4, int data5, String label5) {
        this.year = year;
        this.data1 = data1;
        this.label1 = label1;
        this.data2 = data2;
        this.label2 = label2;
        this.data3 = data3;
        this.label3 = label3;
        this.data4 = data4;
        this.label4 = label4;
        this.data5 = data5;
        this.label5 = label5;
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

    public int getData4() {
        return data4;
    }

    public void setData4(int data4) {
        this.data4 = data4;
    }

    public String getLabel4() {
        return label4;
    }

    public void setLabel4(String label4) {
        this.label4 = label4;
    }

    public int getData5() {
        return data5;
    }

    public void setData5(int data5) {
        this.data5 = data5;
    }

    public String getLabel5() {
        return label5;
    }

    public void setLabel5(String label5) {
        this.label5 = label5;
    }
}
