package J99_Lambda;

import java.util.*;
import java.util.stream.Stream;

public class C08_limit {
    public static void main(String[] args) {
        //limit(a) akısdan cıkan elemanları a parametresine gore ilk a elamanı alır.
        List<String> menu = new ArrayList<String>(Arrays.asList("küşleme", "küşleme", "soğanlı", "soğanlı", "trileçe", "bicibici", "büryan", "welemen", "cacix", "kokerç", "yağlama", "güveç", "arabAşı", "tantuni"));
karakterSayısıEnBüyükOlan(menu);
        System.out.println("\n   ********        ");




    }//main sonu

// Task : Karakter sayisi en buyuk elemani yazdiriniz.

    public static void karakterSayısıEnBüyükOlan(List<String> menu) {
        Stream<String> enBüyükKarekter= menu.
                stream().
                sorted(Comparator.comparing(String::length).reversed()).
                limit(1);//akıştaki ilk 1 elemanı alındı, ilk 3'ünü deseydi 3 yazacaktık
        System.out.println(enBüyükKarekter);//böyle referans degerini yazdırır
        //enBüyükKarekter.toArray()->arraya cevrildi    //alış olduğu için toString de olmaz, #birden çok elemanları# list,array,Queue..vs atanmalı

        System.out.println(Arrays.toString(enBüyükKarekter.toArray()));//Arrayları Arrays.toString ile yazdırıyoruz

        System.out.println("   *****   *****   ***** ");
        Object[] enbykKrktrarr = menu.
                stream().
                sorted(Comparator.comparing(String::length).reversed()).
                limit(1).//akısdaki ilk 1 eleman alındı
                        toArray();//akısdaki elemanlar array'a atandı

        System.out.println(Arrays.toString(enbykKrktrarr));

        Optional<String> enBykKarktr2 = menu.
                stream().
                sorted(Comparator.comparing(String::length).reversed()).
                findFirst();//akısdaki ilk 1 eleman alındı











    }




}
