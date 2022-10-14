package j13_Break_Continue.Task;

import java.util.Scanner;

public class T01_ToplamZiplamaMesafesiSay {

     /* HAFTANIN TASK'iiii :-)
    Bir top belirli yükseklikten atılmaktadır.
    Atıldıktan sonra, atıldığı yüksekliğin 3/4 u kadar yerden yukarı doğru zıplamaktadır
    Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
    Bu ana kadar aldigi toplam yolu ve yere vurma sayısını bulan do while code blogu create ediniz.

    */
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("topu atmak istediginiz yüksekliği giriniz :");
        double yükseklik= sc.nextDouble();
         int zıplamaSay=0;
         double yol=yükseklik;
         do {
             if (yükseklik<1){
                 System.out.println("yüksekli 1 metrenin altında durmaktadır");
                 break;
             } else {
                 yükseklik=yükseklik*0.75;
                 yol+=yükseklik*2;
                 zıplamaSay++;
             }

         }while (true);
         System.out.println("zıplama sayısı :"+zıplamaSay);
         System.out.println("toplam yol :"+yol);


     }
}
