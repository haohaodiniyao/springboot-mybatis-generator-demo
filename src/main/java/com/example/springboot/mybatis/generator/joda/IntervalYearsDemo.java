package com.example.springboot.mybatis.generator.joda;

import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.Interval;
import org.joda.time.Years;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class IntervalYearsDemo {
    public static void main(String[] args){
//        DateTimeFormatter formatter1 = DateTimeFormat.forPattern("yyyy-MM-dd");
//        DateTime d1 = DateTime.parse("2018-01-01",formatter1);
//        DateTime d2 = DateTime.parse("2008-02-01",formatter1);
//        System.out.println(Years.yearsIn(new Interval(d2,d1)).getYears());


        DateTimeFormatter formatter1 = DateTimeFormat.forPattern("yyyy-MM-dd");
        DateTime d1 = DateTime.parse("2018-05-02",formatter1);
        DateTime d2 = DateTime.parse("2018-05-01",formatter1);
        System.out.println(Days.daysIn(new Interval(d2,d1)).getDays());
    }
}
