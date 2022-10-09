package j12_Lopps.L02_WhileLoop.Tasks;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        // task-> girilen  5 sayının  en büyüğünü print den code create eediniz
        Scanner oku = new Scanner(System.in);
        System.out.println("5 sayi giriniz ");
        int num1 = oku.nextInt();
        int num2 = oku.nextInt();
        int num3 = oku.nextInt();
        int num4 = oku.nextInt();
        int num5 = oku.nextInt();
        int temp=0;
        int[] list = {num1, num2, num3, num4, num5};
        for (int a = 0; a < list.length; a++) {
            for (int k = 0; k < list.length; k++) {
                if (list[a] < list[k]) break;
                else if (list[a] >= list[k]) {
                    temp = list[a];
                }
            }
        }
        System.out.println("en buyuk sayi :" +temp);


    }
}
