package j15_Arrays;

import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        // Task -> Kullanıcıdan alacağınız 5 adet sayıyı , girişi sırasına göre tersten print eden code create ediniz
        Scanner sc=new Scanner(System.in);
        System.out.println("5 adet integer sayi giriniz");
        int numArr[]=new int[5];
        for (int i=0; i<numArr.length;i++) {
            System.out.println((i+1) + ".sayiyi giriniz :");
            numArr[i]=sc.nextInt();
        }
        System.out.println("giris sirasina gore tersi :");
        for (int i =numArr.length-1; i >=0 ; i--) {
            System.out.print(numArr[i]+",");
        }

    }
}
