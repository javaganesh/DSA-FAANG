package com.dsa.dateAndTimeApi;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateAndTimeCuurentDate {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println("the current date is "+
                date);
        //currentTime
        LocalTime now = LocalTime.now();
        System.out.println("currentTime:"+now);

        LocalDateTime  dateAndtime = LocalDateTime.now();
        System.out.println("dateAndTime:"+dateAndtime);


        DateTimeFormatter format =
                DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formatedDateTime = dateAndtime.format(format);

        System.out.println("in formatted manner "+
                formatedDateTime);

        /*System.out.println("=====================================================================================");
        System.out.println(dateAndtime.getDayOfMonth());
        System.out.println(dateAndtime.getDayOfWeek());
        System.out.println(dateAndtime.getHour());
        System.out.println(dateAndtime.getDayOfYear());
        System.out.println(dateAndtime.getMinute());
        System.out.println(dateAndtime.getMonth());
        System.out.println(dateAndtime.getNano());
        System.out.println(dateAndtime.getSecond());
        System.out.println(dateAndtime.getChronology().dateNow());
        System.out.println("============************===========================================================");
        LocalDate date2 = LocalDate.of(1950,1,26);
        System.out.println("the republic day :"+date2);
        */
        System.out.println("=====================================================================");
        LocalDateTime specificDate= dateAndtime.withDayOfMonth(24).withYear(2025);
        System.out.println("specific date with "+
                "current time : "+specificDate);


    }
}
