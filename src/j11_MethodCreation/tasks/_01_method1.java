package j11_MethodCreation.tasks;

import java.util.Random;
import java.util.Scanner;

public class _01_method1 {
    /*
    Ismi randomNum olan bir method oluşturun.
    Parametre olarak int max almalı.
    Bu method, 0 ile max arasında.random bir değer döndürmelidir.
    Random numarayı döndürünüz.
    Note: Eğer bir class oluşturmaya ihtiyaç duyuyorsanız oluşturabilirsiniz.
    Note: Methodun adı istenilenle birebir aynı olmalı (randomNum), aksi taktirde cevap yanlış olur.
     */

    public static void main(String[] args) {
        System.out.println("o ile kaç arasında sayı seçmek istersini: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println("Sizin için seçtigimiz sayi :" + randomNum(num));
    }
    public static int randomNum (int max){
        Random sayiSec = new Random();
        int sonuc = sayiSec.nextInt(max);


        return sonuc;
    }
}
