package j15_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task05 {


    public static void main(String[] args) {
        // Task-> girilen int değeri tersten print eden code create ediniz.

        Scanner sc = new Scanner(System.in);
        System.out.println("tersden yazdiracagimiz int deger giriniz");
        String num = sc.next();
        String yeni[] = num.split("");
        for (int i = yeni.length - 1; i >= 0; i--) {
            System.out.print(yeni[i]);
        }
    }

}
