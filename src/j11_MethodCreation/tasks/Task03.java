package j11_MethodCreation.tasks;

import java.util.Scanner;

public class Task03 {

    public static void main(String[] args) {
        // Saati saniyeye, mil'i kilometreye, kilogrami gram'a
        // ceviren bir method yaziniz.
        Scanner input = new Scanner(System.in);
        System.out.println("**** çevirici programın *****");
        System.out.println("Mil'i km'ye çevirmek için M " +
                "\nKilogramı garama cavirmek için K " +
                "\nSaati saniyeye çevirmek için S");
		char islem= input.next().toUpperCase().charAt(0);
        System.out.println("sayıyı giriniz");
        double num= input.nextDouble();

        if (islem=='M') milCevir(num);
        else if (islem=='K') kgCevir(num);
        else if (islem=='S') saniyeCevir(num);
        else System.out.println("yanlış giriş yaptınız");
    }



    public static void saniyeCevir(double a) {
        System.out.println(a + " saat " + (a * 3600) + " saniyedir.");
    }

    public static void milCevir(double a) {
        System.out.println(a + " mil " + (a * 1.61) + " km'dir.");
    }

    public static void kgCevir(double a) {
        System.out.println(a + " kg " + (a * 1000) + " kgramdır'dir.");
    }

}
