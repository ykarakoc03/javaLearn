package j13_Break_Continue;

import java.util.Scanner;

public class C04_PinControl {
    public static void main(String[] args) {

        // Task -> string tada type bir string datasını 3 giriş hakkında kontrol edn bir code create ediniz


        Scanner sc = new Scanner(System.in);
        String dogruPin = "javaCAN";
        System.out.println("pin giriniz");
        for (int i = 1; i < 4; i++) {
            System.out.println("pin giriniz");
            String pin = sc.nextLine();
            if (pin == dogruPin) {
                System.out.println("pin doğru");
                break;
            } else System.out.println(i + ". yanlış giriş yaptınız");
        }
        System.out.println("3 kere yanlış girdiniz pin bloke oldu");

// hocanın yaptıgı yöntem:
     /*   Scanner sc = new Scanner(System.in);


        String dgruPin = "javaCAN";


        int girisHakki = 3;
        while (true) {
            System.out.println("AGAm pin'ini giresen :");
            String agaPin = sc.nextLine();
            if (agaPin.equals(dgruPin)) {
                System.out.println("agam bugun ballısın gayet başarılı :) ");
                break;
            } else {
                System.out.println("agam bugun nasipsizsin bi daha dene");
                girisHakki--;
                System.out.println("agam kalan canın : " + girisHakki);
                if (girisHakki == 0) {
                    System.out.println("agam canın kalmadı bidahkine bekleme yapma dewamkeee :(");
                    break;

*/









    }
}
