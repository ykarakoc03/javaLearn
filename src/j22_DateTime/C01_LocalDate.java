package j22_DateTime;
import java.time.LocalDate;
import java.time.Month;

public class C01_LocalDate {
    public static void main(String[] args) {

        LocalDate bugün= LocalDate.now();
        System.out.println("bugün = " + bugün);//2022-10-25
        System.out.println("bugün.getYear() = " + bugün.getYear());//2022
        System.out.println("bugün.getMonthValue() = " + bugün.getMonthValue());//10
        System.out.println("bugün.getMonth() = " + bugün.getMonth());//OCTOBER
        System.out.println("bugün.getDayOfYear() = " + bugün.getDayOfYear());//298
        System.out.println("bugün.getDayOfMonth() = " + bugün.getDayOfMonth());//25
        System.out.println("bugün.getDayOfWeek() = " + bugün.getDayOfWeek());//TUESDAY

LocalDate date1=LocalDate.of(1923,10,29);
LocalDate date2=LocalDate.of(1923, Month.OCTOBER,29);

//verilen bir tarihin öncesi ve sonrasına girme

        System.out.println("date1.plusDays(12) = " + date1.plusDays(12));//1923-11-10
        System.out.println("date2.plusMonths(3) = " + date2.plusMonths(3));//1924-01-29
        System.out.println("bugün.plusWeeks(6) = " + bugün.plusWeeks(6));//2022-12-06
        System.out.println("bugün.minusMonths(5) = " + bugün.minusMonths(5));//2022-05-25
        System.out.println("bugün.plusDays(43).minusMonths(2).plusWeeks(3).minusYears(2) = " + bugün.plusDays(43).minusMonths(2).plusWeeks(3).minusYears(2));//2020-10-28


    }

}
