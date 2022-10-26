package j22_DateTime;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class C05_LocalDate {
    public static void main(String[] args) {
        //herhangi bir ulke-sehir->local tarih ve zaman bilgisi tutar

        LocalDate trhZone=LocalDate.now(ZoneId.of("America/New_York"));//America/NevYork local'inin anlık tarih bilgisi tanımlandı
        LocalDate trhZone1=LocalDate.now(ZoneId.of("Japan"));//Japan local'inin anlık tarih bilgisi tanımlandı

        System.out.println("trhZone = " + trhZone);//2022-10-26
        System.out.println("trhZone1 = " + trhZone1);// 2022-10-27

        ZonedDateTime zdt1=ZonedDateTime.now(ZoneId.of("America/New_York"));
        //  ZonedDateTime zdt3=ZonedDateTime.now(ZoneId.of("America"));//RTE-> yerel saat dilimi de tanımlanmalı
        ZonedDateTime zdt2=ZonedDateTime.now(ZoneId.of("Japan"));

        System.out.println("zdt1 = " + zdt1);
        System.out.println("zdt2 = " + zdt2);
        // System.out.println("zdt3 = " + zdt3);





    }




}
