package j12_Lopps.L02_WhileLoop.Tasks;

import java.util.Scanner;

public class Task12 {

    public static void main(String[] args) {
		/*
		 task->girilen bir metinde harf rakam ve özel karakter sayısını print eden code create ediniz.
		do-While loop
		 */
        Scanner oku = new Scanner(System.in);
        System.out.println("bir metin giriniz :");
        String text = oku.nextLine().trim();
        int uzunluk = 0;
        int harfSay = 0;
        int rakamSay = 0;
        int karakterSay = 0;
        do {
            if (text.charAt(uzunluk) >= 'A' && text.charAt(uzunluk) <= 'z') {
                harfSay++;
            } else if (text.charAt(uzunluk) >= '0' && text.charAt(uzunluk) <= '9') {
                rakamSay++;
            } else karakterSay++;
            uzunluk++;

        } while (uzunluk < text.length());
        System.out.println("Harf sayisi :" + harfSay + "\nRakam sayisi :" + rakamSay + "\nozel karakter sayisi :" + karakterSay);
    }

}
