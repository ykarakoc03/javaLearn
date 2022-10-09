package j12_Lopps.L02_WhileLoop.Tasks;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /*
        task-> girilen iki tamsayı arasındaki tamsayıları print eden code create ediniz.
        for loop & while lopp
         */
        Scanner input = new Scanner(System.in);
        System.out.println("iki tam sayi giriniz :");
        int num1= input.nextInt(), num2= input.nextInt();
        if (num1>num2) {
            int temp =num1;
            num1=num2;
            num2=temp;
        }
        for (int i = num1; i < num2 ; i++) {
            System.out.print(i+", ");

        }


    }
}
