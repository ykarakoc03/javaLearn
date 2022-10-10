package j13_Break_Continue;

import java.util.Scanner;

public class C03_AsalKontrol {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println(" tam sayi giriniz :");
        int num1= input.nextInt();

        boolean asalMı=true;
        for (int i = 2; i <num1 ; i++) {
            if (num1%i==0) {
                asalMı=false;
                break;
            }
        }
        if (asalMı&num1!=1) {
            System.out.println("girdiginiz sayı Asal");
        }else System.out.println("girdiginiz sayı Asal");




    }
}
