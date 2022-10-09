package j12_Lopps.L02_WhileLoop;

import java.util.Scanner;

public class C01_WhileLoop {

    public static void main(String[] args) {
 /*
        başlangıç ve bitiş değerleri net(bilinen değerler) olan tekrarlarda foor loop
        ama adım sayısı belli olmayıp bir şarta(duruma) bağlı olan tekrarlarda while lopp kullanılmalı
         */
        // task01-> 11 den 20'ye kadar olan tamasayıları print eden code create ediniz...
        System.out.println("   *** for çözüm ***   ");
        for (int i = 11; i < 21; i++) {
            System.out.print(i + " ");
        }
        System.out.println("   *** while çözüm ***   ");

        int basla = 11;//while başlangıc degeri
        while (basla < 21) {//basla 21 den kucuk oldugu surece (iken) body action uygula
            System.out.print(basla + " ");
            basla++;//while dongü değişim komutu basla+=1;
        }

// task-2 ->7 kere javaCAN print eden code create ediniz....
        System.out.println("****    task 2    ***");
        int b = 1;
        while (b < 8) {
            System.out.println(b + ". javaCAN");
            b++;
        }
//task3-> iki basamaklı tek sayıları yan yana print eden code create ediniz
        System.out.println("****    task 3    ***");
        int c = 11;
        while (c < 100) {
           // System.out.print(b + " ");
            //b += 2;
            if (c%2==1) System.out.print(c+" ");
            c++;
        }

//task04 -> girilen metni tersten while ile yazdıralım
        System.out.println("****    task 4    ***");
        Scanner sc = new Scanner(System.in);
        System.out.println("metin giriniz");
        String str = sc.nextLine();
        int metinUzunluk=str.length()-1;
        while (metinUzunluk>=0){//metnin son karakteri 0 a eşit ve büyük iken
            System.out.print(str.charAt(metinUzunluk));
            metinUzunluk--;
        }
// Task05 -> girilen tam sayıyıların toplamını print eden code create ediniz

        System.out.println("bir tamsayıgiriniz");
        int sayi = sc.nextInt();
        int toplam =0;
        while (sayi>0){
            toplam+= sayi;
            sayi--;
        }
        System.out.println("toplam sayı :" + toplam);

        // task06-> girilen tamsayın faktoriyelini print eden code create ediniz...
        System.out.println("   *** task06 ***   ");

        int faktoriyel = 1;

        while (sayi > 0) {// sayı 1 olana dek body de ne varsa yap
            faktoriyel *= sayi;// her döngüde sayıyı toplama ekle
            sayi--;// her döngüde sayıyı 1 azalt ki dünta döndükçe dönmesin.!!
        }
        System.out.println("agam girdigin sayılar faktoriyeli : " + faktoriyel);





    }
}
