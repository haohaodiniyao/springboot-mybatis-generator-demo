package com.example.springboot.mybatis.generator.joda;

import com.google.common.collect.Lists;
import com.google.common.collect.Ordering;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.util.Date;
import java.util.List;

public class GuavaOrderingDemo {
    public static  void main(String[] args){
        List<Date> dateList = Lists.newArrayList();
        //joda日期格式化
        DateTimeFormatter formatter1 = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss");
        DateTimeFormatter formatter2 = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm");
        DateTimeFormatter formatter3 = DateTimeFormat.forPattern("yyyy-MM-dd HH");
        DateTimeFormatter formatter4 = DateTimeFormat.forPattern("yyyy-MM-dd");
        dateList.add(DateTime.parse("2018-05-05 12:05:00",formatter1).toDate());
        dateList.add(DateTime.parse("2018-05-05 12:03:00",formatter1).toDate());
        dateList.add(DateTime.parse("2018-05-05 12:04",formatter2).toDate());
        dateList.add(DateTime.parse("2018-05-05 12",formatter3).toDate());
        dateList.add(DateTime.parse("2018-05-05",formatter4).toDate());
        Ordering<Date> dateOrdering = Ordering.natural();
        List<Date> dateListCopy = dateOrdering.sortedCopy(dateList);
        for(Date date:dateListCopy){
            System.out.println(new DateTime(date).toString(formatter1));
        }
    }
}
