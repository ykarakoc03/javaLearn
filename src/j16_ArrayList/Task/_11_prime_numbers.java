package j16_ArrayList.Task;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _11_prime_numbers {

    /*
    negatif olmayan bir n sayısı girin ve bu sayıya kadar olan kaç asal sayı var ise yazdırın.

        Örnek 1:
        n = 20

        cevap: 8      ==   (2,3,5,7,11,13,17,19)  20 ye kadar 8 adet asal sayı vardır.
        Örnek2:
        Input(Girdi): 10
        Output(Çıktı): 4
        Explanation(Açıklama): 10'dan küçük 4 adet asal sayı vardır. (2,3,5,7)
     */

    public static void main(String[] args) {
        List<Integer> asal = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Pozitif tam sayı giriniz");
        int num1 = input.nextInt();
        int count = 0;
        for (int i = 2; i < num1; i++) {
            for (int j = i + 1; j < num1; j++) {
                if (i % j != 0) {
                    asal.add(i);
                    count++;
                }
            }

        }
        System.out.println(num1+ " sayısına kadr "+count+" asla sayı var :"+asal);
    }


}

