package j12_ForLopps.L01_ForLoop.Task01;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        
  /*
        girilen iki sayı arasındaki çift sayıları yanyana  print eden code create ediniz..
         */
        Scanner sc= new Scanner(System.in);
        System.out.println(" sayı1 giriniz : ");
        int sayı1=sc.nextInt();

        System.out.println(" sayı2 giriniz : ");
        int sayı2=sc.nextInt();

        if (sayı1 < sayı2) {
            for (int i = sayı1; i <sayı2 ; i++) {

                if (i%2==0) {//döngü içindeki sayıların çift kontrolü
                    System.out.print(i +" ");
                }
            }



        }else System.out.println("hatalı giriş yaptınız");


    }

}
