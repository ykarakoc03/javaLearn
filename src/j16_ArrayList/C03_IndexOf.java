package j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C03_IndexOf {
    public static void main(String[] args) {
        //indezof();-> list icinde istenen elemanın indeksini retun eder

        ArrayList<String> listUlke=new ArrayList<>(List.of("Alamanya","Amerikonya","İngilter","isveç"));
        ArrayList<String> listSehir=new ArrayList<>(List.of("Münih","LosAngeles","Londra","stockholm"));

        System.out.println("listSehir.indexOf(\"Londra\") = " + listSehir.indexOf("Londra"));//2
        System.out.println("listSehir.indexOf(\"Londra\") = " + listSehir.indexOf("londra"));//-1 case sansitive küçük büyuk harf duyarlı
        System.out.println("listSehir.indexOf(\"Ankara\") = " + listSehir.indexOf("Ankara"));//-1 List e olmayan eleman indexsi -1 return eder


        listUlke.add("Amerikonya");
        System.out.println(listUlke.indexOf("Amerikonya"));//1 ->birden fazla varsa soldan ilk buldugunu geriri

        System.out.println(listUlke.lastIndexOf("Amerikonya"));// sağdan(sondan) ilk bulunan elemanın indeksini retun eder


    }
}
