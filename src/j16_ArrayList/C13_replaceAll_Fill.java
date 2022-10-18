package j16_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class C13_replaceAll_Fill {

    public static void main(String[] args) {

        //replaceAll(); listede belirli bir elemani bir deger ile update yapar
        ArrayList<Integer> listSayi =new ArrayList<>(Arrays.asList(1,24,23,14,19,60,1,55,27,1,38));
        System.out.println("listSayi = " + listSayi);//once [1, 24, 23, 14, 19, 60, 1, 55, 27, 1, 38]

        Collections.replaceAll(listSayi,1,20);// sayi listinde 1 yerine 20 degeri atandi
        System.out.println("listSayi = " + listSayi);// sonra [20, 24, 23, 14, 19, 60, 20, 55, 27, 20, 38]

        //fill(); list etum elemanlari bir degere update eder
        Collections.fill(listSayi,33);
        System.out.println("listSayi = " + listSayi);// fil sonu [33, 33, 33, 33, 33, 33, 33, 33, 33, 33, 33]

    }
}
