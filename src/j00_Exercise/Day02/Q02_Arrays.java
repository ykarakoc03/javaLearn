package j00_Exercise.Day02;

import java.util.Scanner;

public class Q02_Arrays {

    /*
      Kullanicidan aldigimiz 8 elemanli arrayin icinde
      kac tane 3 e bolunebilen sayi vardir ?(negatif sayilar da dahil olsun)
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("8 elemanli array degeri giriniz");
int count=0;
        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + ". elemani giriniz");
            arr[i] = sc.nextInt();
            if (arr[i]%3==0) count++;
        }
        System.out.println("3 ile bolunen eleman sayisi "+count);
    }
}
