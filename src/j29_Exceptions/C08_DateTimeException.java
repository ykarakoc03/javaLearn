package j29_Exceptions;

import java.time.DateTimeException;
import java.time.LocalDate;

public class C08_DateTimeException {
    public static void main(String[] args) {

        //LocalDate date=LocalDate.of(2022,11,33);//RTE ayda 33 gun olmaz

        try {
            LocalDate date=LocalDate.of(2022,11,33);
            System.out.println("agam try block da bu yazıyı okuduysan excp fırlatmadı komut sorunsuz ");
        }catch (DateTimeException e){
            System.out.println("ahan da hataa: "+e.getMessage());
            System.out.println("agam catch block da bu yazıyı okuduysan excp fırlatıldı ve code handle edildi :) ");

        }
        System.out.println("agam sorun handle edildi DEWAMKEEE :)");//bu kod çalışmıssa pr sorunsuz kırılmadan run olmuştur









    }
}
