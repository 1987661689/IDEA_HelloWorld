package com.yzh.bean;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;

public class Customer {
    private String name;
    private int num;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Customer() {
    }

    public Customer(String name, int num) {
        this.name = name;
        this.num = num;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", num=" + num +
                '}';
    }

    //这是单行注释
    /*
    * 这是多行注释
    * */
    public static void main(String[] args) {
        Customer c = new Customer();
        c.setName("yzh");
        c.setNum(1987661689);
        System.out.println(c.toString());
        ArrayList a = new ArrayList();
        String s = "21322";
        System.out.println(s + "hello");
        Date date = new Date();
        try {
            FileInputStream fis=new FileInputStream("E:\\UserFC");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
