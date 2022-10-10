package j12_Lopps.L02_WhileLoop.Tasks;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        /*
    task -> 0 (sıfır) girilene kadar girilen tum sayıların adedini ve toplamını print eden code create edinz.
    */
        Scanner oku = new Scanner(System.in);
        int num;
        int count = 0;
        int total=0;
        do {
            System.out.println(" sayi giriniz ");
            num = oku.nextInt();
            count++;
            total += num;
        } while (num != 0);
        System.out.println(count+ " adet girdiginiz sayi toplami :"+ total);

    }
}
