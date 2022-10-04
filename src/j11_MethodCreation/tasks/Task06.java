package j11_MethodCreation.tasks;

import java.util.Scanner;

public class Task06 {
   static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
		/*
		 Kullanıcıya paralelkenar, dikdörtgen ve üçgen kelimelerinden birini 
		 ve iki sayı seçmesini söyleyin. 
         Hangi şekli seçerse, o şeklin alanını ve çevresini ekrana yazdıran programı yazınız.
		 */
        islem();
    }

    public static void islem() {
        System.out.println("paralel kenar için P \ndikdörtgen için D \nüçgen için Ü \nişlemlerden birini seçiniz");
        char islem = sc.next().toUpperCase().charAt(0);
        System.out.println("iki kenar giriniz");
        double a = sc.nextDouble(), b = sc.nextDouble();
        if (islem == 'D') {
            dikdörtgen(a, b);
        } else if (islem == 'Ü') {
            ücgen(a, b);
        } else if (islem == 'P') {
            paralelKenar(a, b);
        } else {
            System.out.println("yanlış giriş yaptınız");
            islem();
        }
    }

    public static void ücgen(double a, double b) {
        System.out.println("üçgenin çevresi : :" + (a + b + Math.sqrt(a * a + b * b)));
        System.out.println("üçgenin alanı :" + (a + b + (Math.sqrt(a * a + b * b))) / 2);
    }

    public static void dikdörtgen(double a, double b) {
        System.out.println("dikdörtgenin çevresi : :" + 2 * (a + b));
        System.out.println("dikdörtgenin alanı : :" + (a * b));
    }

    public static void paralelKenar(double a, double b) {
        System.out.println("Paralel kenarın çevresi : :" + 2 * (a + b));
        System.out.println("Paralel kenarın alanı için yüksakli giriniz :");

        double h = sc.nextDouble();
        System.out.println("Paralel kenarın alanı :" + h * b);
    }


}
