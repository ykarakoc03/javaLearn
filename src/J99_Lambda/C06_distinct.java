package J99_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class C06_distinct {
    public static void main(String[] args) {
        List<String> menu = new ArrayList<String>(Arrays.asList("küşleme", "küşleme", "soğanlı", "soğanlı", "trileçe", "bicibici", "büryan", "melemen", "cacix", "kokerç", "yağlama", "güveç", "arabAşı", "tantuni"));
        buyukHarfSiralaTekrarsiz(menu);
        System.out.println("\n   ********        ");
        karekterSayisiTersSirali(menu);//8 7 6 5
        System.out.println("\n   ********        ");
        listElemankarekterSayisiSirali(menu);
        System.out.println("\n   ********        ");
        elemansSokarekterTersSirali(menu);
        System.out.println("\n   ********        ");
listElemanCiftkarekterSayisiKAreliTersSirali(menu);
    }//main sonu

    // Task : List elemanlarini alafabetik buyuk harf ve  tekrarsiz print ediniz.
    public static void buyukHarfSiralaTekrarsiz(List<String> menu) {
        menu.
                stream().
                map(String::toUpperCase).
                sorted().
                distinct().
                forEach(t -> System.out.print(t + " "));
        //distinct() => Bu method tekrarlı elemanları sadece bir kere akısa sokar.
        // Bu akışın farklı elemanlarından (Object.equals (Object) 'e göre) oluşan bir akış döndürür.
        // Sıralı akışlar için, farklı elemanın seçimi sabittir
        // (yinelenen öğeler için, karşılaşma sırasında ilk görünen öğe korunur.)
        // Sırasız akışlar için, herhangi bir kararlılık garantisi verilmez. Stream return eder.

    }

    // Task : list elelmanlarinin character sayisini ters sirali olarak tekrarsiz print ediniz..
    public static void karekterSayisiTersSirali(List<String> menu) {
        menu.stream().
                map(String::length).//akıştaki string elemanlar karakter sayısına update edildi
                sorted(Comparator.reverseOrder()).//ters sıra oldu
                distinct().//tekrarsız
                forEach(t -> System.out.print(t + " "));


    }

    // Task : List elemanlarini character sayisina gore kckten byk e gore print ediniz..
    public static void listElemankarekterSayisiSirali(List<String> menu) {
        menu.
                stream().
                sorted(Comparator.
                        comparing(String::length)).//akıştaki String elemanların lenght'ine göre doğal sıra
                forEach(t -> System.out.print(t + " "));
    }

    // Task : list elemanlarinin son harfine gore ters sirali print ediniz.
    public static void elemansSokarekterTersSirali(List<String> menu) {
        menu.stream().
                sorted(Comparator.
                        comparing(t -> t.toString().
                                charAt(t.toString().length() - 1))
                        .reversed()).
                forEach(t -> System.out.print(t + " "));
    }

    // Task : listin elemanlarin karakterlerinin cift sayili  karelerini hesaplayan,ve karelerini tekrarsiz buyukten kucuge sirali  print ediniz...
    public static void listElemanCiftkarekterSayisiKAreliTersSirali(List<String> menu) {
        menu.stream().
                map(String::length).
                filter(C01_LambdaExpression::ciftMi).
                map(t -> t * t).sorted(Comparator.reverseOrder()).
                distinct().forEach(t -> System.out.print(t + " "));
    }
}