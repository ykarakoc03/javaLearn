package j12_Lopps.L02_WhileLoop.Tasks;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
/*
Task-> girilen sayıların toplamı 333 gectiğinde girilen sayı adedini ve toplamını prşnt eden code create ediniz.
 */
        Scanner sc = new Scanner(System.in);
        int toplam = 0;
        int sayac = 0;

        do {
            System.out.println("sayi giriniz");
            toplam += sc.nextInt();
            sayac++;
        } while (toplam < 333);
        System.out.println("girilen sayi adeti :"+sayac+", \ntoplam :"+toplam);


    }
}
