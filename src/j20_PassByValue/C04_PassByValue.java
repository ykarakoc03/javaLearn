package j20_PassByValue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04_PassByValue {

        static double etiketFiyatı;//güneş
        static double indirimOranı;//güneş
        public static void main(String[] args) {

        /*
        eger bir method2Da yapılan değişiklik kalıcı olsun istenirse
        1.değişklik  yapılan variable'lar static olarak tanımlanır.
         */
        etiketFiyatı = 100;
        System.out.println("indirim öncesi etiketFiyatı = " + etiketFiyatı);//100
        indirimOranı = 0.1;

        indir();//method call
        indirimOranı = 0.1;

        indir();
        indirimOranı = 0.1;

        indir();
        System.out.println("indirim sonrası etiketFiyatı = " + etiketFiyatı);// 72.9
        }
        public static void indir() {
            etiketFiyatı *= (1 - indirimOranı);//etiketfiyatı indirimli hale getirlidi
            System.out.println("etiketFiyatı = " + etiketFiyatı);

        }

}
