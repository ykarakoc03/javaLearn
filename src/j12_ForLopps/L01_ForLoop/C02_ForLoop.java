package j12_ForLopps.L01_forloop;

import java.util.Scanner;

public class C02_ForLoop {
    public static void main(String[] args) {
        // task -> girilen sayıdan 10 e kadar 4 ün katı tam sayıları print eden code create ediniz

        Scanner sc = new Scanner(System.in);
        System.out.println("bir pozitif tam sayı giriniz");
        int sayi=sc.nextInt();


        if (sayi>100){
            System.out.println("100 den küçük sayı girmelisiniz");
        }else{
            for (int i=sayi; i<100 ; i++) {// 100 degeri döngüyü çalıştırmaz
                if (i%4==0){
                    System.out.print(i+" ");
                }
            }

        }


    }
}
