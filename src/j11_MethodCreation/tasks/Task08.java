package j11_MethodCreation.tasks;

import java.time.LocalDate;
import java.util.Scanner;

public class Task08 {

    public static void main(String[] args) {

    /*
    Kullanıcı tarafından girilen bir yılın  artık yıl olup
    olmadığını kontrol eden method create ediniz

    Test Data:
    2017

    Beklenen Çıktı:
    false
    */
        Scanner sc = new Scanner(System.in);
        System.out.println("yıl giriniz");
        int yil = sc.nextInt();
        System.out.println("girdiginiz yıl artıkYıl mı? " + artikYil(yil));


    }

    public static boolean artikYil(int yil) {
        boolean result = false;
        if (yil % 4 == 0 )
            if ( yil % 100 == 0)
               if (yil%400==0) result = true;
                else result = false;
            else result = true;
        return result = false;
    }
}
