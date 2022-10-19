package j16_ArrayList.Task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task12_Manav {


    public static void main(String[] args) {
        /* TASK :
         * Basit bir 5 ürünlü manav alisveris programi yaziniz.
         *
         * 1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
         * 2. Adim : Baska bir urun almak isteyip istemedigini sor.
         * 			 istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
         * 			 Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
         * 3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
         * 4. Adim : Alisveris bitince toplam odemesi gereken tutari goster.
         *
         * */

        List<String> urunlist = new ArrayList<>(List.of("elma","armut","domates","biber","üzüm"));
        List<Integer> fiyatlist = new ArrayList<>(List.of(15,20,15,30,15));
        Scanner dat = new Scanner(System.in);

        int toplamfiyat = 0;
        int kilo =0;
        String secim="";

        while (true) {
            System.out.println(urunlist + "almak istediğiniz ürünü seçiniz?=");
            secim = dat.next().toLowerCase();

            if (secim.equals("q")){
                System.out.println("iyi günler dileriz, yine bekleriz.");
                break;}
            else {
                System.out.println("kaç kilo? =");
                kilo = dat.nextInt();

                System.out.println(secim + "fiyatı= " + fiyatlist.get(urunlist.indexOf(secim)) * kilo);

                toplamfiyat += fiyatlist.get(urunlist.indexOf(secim)) * kilo;

            }
        }
        System.out.println("toplam ödenmesi gereken miktar fiyat = " + toplamfiyat);
    }












    }






