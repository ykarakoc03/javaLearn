package j22_DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class C03_LocalDateTime {
    public static void main(String[] args) {
        // LocalDateTime tarih(yıl ay gün) ve zaman (saat dakika saniye) bilgilerini atar

        LocalDateTime ldt= LocalDateTime.now();
        System.out.println("ldt = " + ldt);//2022-10-25T23:05:39.356512
        LocalDate d=LocalDate.of(2016,2,13);//Tarih ataması yapıldı
        LocalTime t=LocalTime.of(14,45,35);//zaman ataması yapıldı

        LocalDateTime trhZmb=LocalDateTime.of(d,t);
        System.out.println("trhZmb = " + trhZmb);//2016-02-13T14:45:35
LocalDateTime ltd1=LocalDateTime.of(2018, Month.MAY,19,20,30);
        System.out.println("ltd1 = " + ltd1);
        System.out.println("ltd1.getDayOfMonth() = " + ltd1.getDayOfMonth());
        System.out.println("ltd1.getDayOfWeek() = " + ltd1.getDayOfWeek());
        System.out.println("ltd1.getHour() = " + ltd1.getHour());
        System.out.println("trhZmb.plusWeeks(3).minusDays(5).plusHours(13).minusMinutes(72) = " + trhZmb.plusWeeks(3).minusDays(5).plusHours(13).minusMinutes(72));
    }
}
