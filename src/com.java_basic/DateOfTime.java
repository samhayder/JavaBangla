package com.java_basic;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateOfTime {
    public static void main(String[] args) {

        //Date
        Date date = new Date();
        //Date Format
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/YYYY");
        String currentDate = dateFormat.format(date);

        System.out.println("Current Date: " + currentDate);

        //Time
        LocalTime time = LocalTime.now();
        //Time Format
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("hh:mm:ss");
        String currentTime = dateTimeFormatter.format(time);

        System.out.println("Current Time: " +currentTime);

        System.out.println("Current Time of Date: " + currentTime + "\t" + currentDate);


    }
}
