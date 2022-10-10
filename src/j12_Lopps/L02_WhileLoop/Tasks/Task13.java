package j12_Lopps.L02_WhileLoop.Tasks;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        /*
        task -> x karakteri girilene kadar "javaCAN" x karakteri girildiğinde "jAVATAR" print eden code create ediniz.
        do-while lopp
         */
        Scanner oku = new Scanner(System.in);
        char ch;

        do {
            System.out.println("bir karakter giriniz :");
            ch = oku.next().toLowerCase().charAt(0);
            if (ch!='x') {
                System.out.println("javaCAN");
            }
        } while (ch != 'x');
        System.out.println("jAVATAR");

    }
}
