package j11_MethodCreation.tasks;

import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {
		/*
		 Kullanıcıya paralelkenar, dikdörtgen ve üçgen kelimelerinden birini 
		 ve iki sayı seçmesini söyleyin. 
         Hangi şekli seçerse, o şeklin alanını ve çevresini ekrana yazdıran programı yazınız.
		 */
        Scanner sc = new Scanner(System.in);
        System.out.println("paralel kenar için P \ndikdörtgen için D \nüçgen için Ü \nişlemlerden birini seçiniz");
        String islem = sc.next().toUpperCase();
        System.out.println("iki kenar giriniz");
        double a, b = sc.nextDouble();
üçgen (a,b)

    }

    private static void üçgen(double a, double b) {
        System.out.println("üçgenin çevresi : :" + 2 * (a + b));
    }

    private static void dikdörtgen(double a, double b) {
        System.out.println("dikdörtgenin çevresi : :" + 2 * (a + b));
        System.out.println("dikdörtgenin alanı : :" +(a * b));
    }

    public static void paralelKenar(double a, double b) {
        System.out.println("Paralel kenarın çevresi : :" + 2 * (a + b));
        System.out.println("Paralel kenarın alanı için yüksakli giriniz :");
        Scanner sc = new Scanner(System.in);
        double h= sc.nextDouble();
        System.out.println("Paralel kenarın alanı :" + h * b);
    }


    }
}
