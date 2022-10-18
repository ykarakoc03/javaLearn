package j15_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task13 {

    public static void main(String[] args) {
        /* TASK :
         Kullanicidan aldigimiz 8 elemanli arrayin icinde
        3 e bolunebilen sayi adedini print eden java code create ediniz (negatif sayilar da dahil olsun)

         */
        Scanner sc=new Scanner(System.in);
        System.out.println("8 elemanli integer array giriniz");
        int numArr[]=new int[8];
        for (int i=0; i<numArr.length;i++) {
            System.out.println((i+1) + ".sayiyi giriniz :");
            numArr[i]=sc.nextInt();
        }
        System.out.println("gidiginiz sayilar :" + Arrays.toString(numArr));
        int say=0;
        for (int i = 0; i < numArr.length; i++) {
            if (numArr[i]%3==0&&numArr[i]!=0) say++;

        }
        System.out.println("girilen sayilarda 3 e tam bolunebilen sayi adeti :" + say);

    }

}
