package com.dsa.dateAndTimeApi;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Zone {
    public static void main(String[] args) {
        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter format1 =
                DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedCurrentDate = date.format(format1);
        System.out.println("formatted current Date and"+
                " Time : "+formattedCurrentDate);


        ZonedDateTime currentZone = ZonedDateTime.now();
        System.out.println("the current zone is "+
                currentZone.getZone());



        ZoneId tokyo = ZoneId.of("Asia/Tokyo");

        ZonedDateTime tokyoZone =
                currentZone.withZoneSameInstant(tokyo);

        System.out.println("tokyo time zone is " +
                tokyoZone);

        DateTimeFormatter format =
                DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formatedDateTime = tokyoZone.format(format);

        System.out.println("formatted tokyo time zone "+
                formatedDateTime);


    }
}
