package j15_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        //Task-> kullanıcdan alınan değerlerle bir int array elemanlarını bukukten kucuge   print eden code create ediniz.
        Scanner sc= new Scanner(System.in);
        System.out.println("kaç elemanlı Array istiyorsunuz");
        int indexSay= sc.nextInt();
int sayiArr []=new int[indexSay];
        for (int i = 0; i < indexSay; i++) {
            System.out.println(i+ ". Arrayı giriniz :");
            sayiArr [i]= sc.nextInt();

        }
        System.out.println("oluşan liste giriş sırasına göre :"+Arrays.toString(sayiArr));
Arrays.sort(sayiArr);
        System.out.println("küçükten büyüge :"+Arrays.toString(sayiArr));
        for (int i = sayiArr.length-1; i >=0; i--) {
            System.out.println(sayiArr[i]+" ");
        }

    }
}
