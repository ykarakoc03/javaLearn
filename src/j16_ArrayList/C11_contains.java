package j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C11_contains {
    public static void main(String[] args) {

        //Contains(); listdekiistenen elemanın varlıgın kontrol eder
        ArrayList<String> listSehir = new ArrayList<>(List.of("Münih", "LosAngeles", "Londra", "Stockholm"));
        System.out.println("listSehir.contains(\"Angara\") = " + listSehir.contains("Angara"));//false
        System.out.println("listSehir.contains(\"Münih\") = " + listSehir.contains("Münih"));//true


    }
}
