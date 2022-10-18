package j15_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        //Task-> girilen 7 elemanlı bir int  arrayın tek elemanlarını print eden code create ediniz.

        Scanner sc=new Scanner(System.in);
        System.out.println("7 elemanli integer array giriniz");
        int numArr[]=new int[7];
        for (int i=0; i<numArr.length;i++) {
            System.out.println((i+1) + ".sayiyi giriniz :");
        numArr[i]=sc.nextInt();
        }
        System.out.println("eleman sayisi :" + Arrays.toString(numArr));
        for (int i:numArr
             ) {
            if (i%2!=0) System.out.print("tek sayilar"+i+",");
        }
    }
}
