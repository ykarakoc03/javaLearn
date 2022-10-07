package j12_ForLopps.L01_ForLoop.Task01;

import java.util.Scanner;

public class Task03_Faktoriyel {
    public static void main(String[] args) {

 /*
        girilen ifadenin polindrome olmasını kontrol eden method create ediniz...
        plindrome:her iki yönde okundugunda eşit olan ifadeler

         */
        Scanner sc = new Scanner(System.in);
        System.out.print("bir pozitif sayi giriniz : ");
        int sayi = sc.nextInt();

        faktöriyel(sayi);


    }

    private static void faktöriyel(int sayi) {
        int faktoriyel = 1;

        for (int i = 1; i < sayi; i++) {
            faktoriyel *= i;
        }
        System.out.println("faktöriyel : " + faktoriyel);


    }
}