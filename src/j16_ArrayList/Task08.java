package j16_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Task08 {

    public static void main(String[] args) {
        //Task-> Girilen sayıların içinde ortlamadan buyuk olanları print eden METHOD creta ediniz

        Scanner sc = new Scanner(System.in);
        System.out.println("istediginiz kadar sayi giriniz, bitirmek icin q basiniz");

        List<String> sayilar = new ArrayList<>();

        while (!sayilar.contains("q")) {
            sayilar.add(sc.nextLine());
        }

        sayilar.remove(sayilar.size() - 1);

        List<Integer> yenisayi = new ArrayList<>();

        for (int i = 0; i < sayilar.size(); i++) {
            yenisayi.add(Integer.parseInt(sayilar.get(i)));
        }
        System.out.println("sayi listeniz :"+yenisayi);

        double ort=ortalamaAl(yenisayi);
        System.out.println("Ortalama :"+ort);

        System.out.println("ortalamanin uzerindeki notlar");
        for (int i = 0; i < yenisayi.size(); i++) {
            if (yenisayi.get(i) > ort)
                System.out.print(yenisayi.get(i) + " ");

        }
    }

    private static double ortalamaAl(List<Integer> sayilar) {

        double topla = 0;
        for (int i = 0; i < sayilar.size(); i++) {
            topla += sayilar.get(i);
        }
        return topla / sayilar.size();
    }
}
