package j11_MethodCreation;

import java.util.Scanner;

public class Task04AtmMethod {

    /*
        Bakıye (başlangıç bakıyesi 1000 tl) öğrenme, para yatırma ve cekme, çıkış işlemlerinin yapıldıgı bir
         ATM app. code create ediniz
         */

    static Scanner sc = new Scanner(System.in);
    static int bakiye = 1000;


    public static void secim() {
        System.out.println("Menü \nBakiye öğrenme -> 1\nPara yatırma -> 2\nPara Çeke -> 3\nÇıkış -> 4\nGiriniz : ");
        System.out.println("agam ne yapacaksan sec :");
        int secim = sc.nextInt();
        switch (secim) {
            case 1:
                bakiyeSorma();
                break;
            case 2:
                paraYatirma();
                break;
            case 3:
                paraCekme();
                break;
            case 4:
                cikisYap();
                break;
            default:
                System.out.println("agam daha seçim yapamirsen bide para istirsen");
        }
    }

    private static void cikisYap() {
        System.out.println("agam  çıkışın yapıldı selametle");
    }

    public static void bakiyeSorma() {
        System.out.println("agam bakıyen :" + bakiye);
        karar();

    }

    private static void karar() {
        System.out.println("agam işleme \ndevam etmekiçin -> 1\nÇıkış ->0");
        int karar = sc.nextInt();
        if (karar == 1) {
            secim();
        } else if (karar==0) {
            cikisYap();
        }else{
            System.out.println("yanlış giriş yaptınız");
            karar();
        }
    }



    public static void paraYatirma() {
        System.out.print("agam ne hadar yatıcaksın :");
        int yatırılanMiktar = sc.nextInt();
        bakiye += yatırılanMiktar;
        System.out.println("agam bakıyenin güncelhali :" + bakiye);
        //bakiyeSorma();//bu da alternatif olabilirdi
        karar();

    }


    public static void paraCekme() {
        System.out.println("agam ne kadar cekecen : ");
        int cekilenMiktar = sc.nextInt();
        if (cekilenMiktar > bakiye) {
            System.out.println("agam niddin olmayan parayımı cekecen :(");
            System.out.println("ahan da bakıyen  " + bakiye);
            karar();
        } else {
            bakiye -= cekilenMiktar;
            System.out.println("agam bakıyenin güncalhali :" + bakiye);
            karar();
        }
    }


}
