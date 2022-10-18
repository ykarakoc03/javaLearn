package j00_Exercise.Day02;

import java.util.Scanner;

public class Q01_Array {
    public static void main(String[] args) {

        /*
         * verilen Arrayde toplamlari istenen degere esit olan sayi ciftlerini //
         * yazdiran bir method yaziniz int[] arr= {5,7,-6,4,2,15,3,8,1}; int
         * istenenToplam=9;
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("istene degeri giriniz");
        int istenenToplam= sc.nextInt();
        int[] arr= {5,7,-6,4,2,15,3,8,1};
esitCiftiGetir(arr,istenenToplam);


    }

    private static void esitCiftiGetir(int[] arr, int istenenToplam) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
               if (arr[i]+arr[j]==istenenToplam) {
                   System.out.println(arr[i]+"+"+arr[j]+"="+istenenToplam);
               }

            }
        }

    }
}
