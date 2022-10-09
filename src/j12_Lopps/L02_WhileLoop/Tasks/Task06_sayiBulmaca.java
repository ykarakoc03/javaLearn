package j12_Lopps.L02_WhileLoop.Tasks;

import java.util.Random;
import java.util.Scanner;

public class Task06_sayiBulmaca {

    public static void main(String[] args) {
        // bilgisayara 1 ile 100 arasinda bir sayi tutturun
        // kullanicidan bu sayiyi tahmin etmesini isteyin
        // girilen her tahminde sayiyi buyut veya kucult diye kullaniciya yol gosterin
        // kullanici sayiyi buldugunda kac tahminde sayiyi buldugunu kullaniciya yazdirin
        Random rd = new Random();
        int sayiTut = rd.nextInt(100);
        Scanner sc = new Scanner(System.in);
        System.out.println("sayi tahmin et :");
        int sayac = 0;
        do {
            sayac++;
            int tahmin = sc.nextInt();
            if (tahmin == sayiTut) {
                System.out.println("tebrikler " + sayac + ". tahmininizde buldunuz");
                break;
            } else if (tahmin > sayiTut) {
                System.out.println("kucult");

            } else if (tahmin < sayiTut) {
                System.out.println("buyut");
            }
        } while (true);


    }

}
