package j12_Lopps.L02_WhileLoop.Tasks;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        // task ->  Girilen bir sayıya kadar  tek olanlarını print eden code create ediniz.
        Scanner oku = new Scanner(System.in);
        System.out.println("bir sayi giriniz :");
        int num1 = oku.nextInt();
        for (int i = 0; i < num1; i++) {
            if (i%2!=0)
            System.out.print(i+ " ");
        }


    }
}
