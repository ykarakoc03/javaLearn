package j12_ForLopps.L03_DoWhileLoop;

import java.util.Scanner;

public class C02_DoWhileLoop {
    public static void main(String[] args) {
        // girilen sayı 17 den küçükse kazandınız, büyükse kaybettiniz do while loop ile creade ediniz

        Scanner sc = new Scanner(System.in);
        int sayi=0;


        do {
            System.out.println("AGAM nassıng :) bir tamsayı giriyorsun : ");
            sayi = sc.nextInt();

            System.out.println(sayi+" için kazandınız");

            sayi++;
        }while (sayi<=17);
        System.out.println(sayi +" için kaybettiniz  ");






    }


}


