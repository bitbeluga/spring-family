package com.example.demo;

import java.time.LocalDate;
import java.util.Date;

import org.apache.tomcat.jni.Local;

public class DemoOOP {

    public static void main(String[] args) {

        // 所有類都源自Object類

        // System.out.println(new Date());
        // System.out.println(new Date().toString());
        // 考虑到各地对时间格式（2020-02-03、20200203等）的要求不同，所以用类描述时间

        Date deadline = new Date();
        String s = deadline.toString();
        // System.out.println(s);

        // System.out.println(LocalDate.now());
        // System.out.println(LocalDate.of(1994,01,23));
        // LocalDate date = LocalDate.now();
        // plusDays 方法没有更改原有对象，而是在date的基础上建立了新对象
        // LocalDate aThousDaysLater = date.plusDays(1000);
        // System.out.println(date);
        // System.out.println(aThousDaysLater);
        // Employee();

        // Date类用来表示时间点，LocaDate类用来表日历表示法。将时间和日历分开是OOP设计
        // LocalDate.now();
        System.out.println(LocalDate.of(1999, 12, 31));
        // new Employee(s);

        Math.pow(1, 3);
    }


    // private String Employee(String s) {
    // String ss = s;
    // System.out.println(ss);
    // return ss;
    // }

}

class Employee {
    public Employee(String s) {
        String ss = s;
        System.out.println(ss);
        // return ss;
    }
}