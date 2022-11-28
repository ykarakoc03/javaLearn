package J99_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C07_match {
    //anyMatch() --> enaz bir eleman sarti saglarsa true aksi durumda false return eder
    //allMatch() --> tum  elemanlar sarti saglarsa true en az bir eleman sarti saglamazsa false return eder.
    //noneMatch()--> hic bir sarti SAGLAMAZSA true en az bir eleman sarti SAGLARSA false return eder.
    public static void main(String[] args) {

        List<String> menu = new ArrayList<String>(Arrays.asList("küşleme", "küşleme", "soğanlı", "soğanlı", "trileçe", "bicibici", "büryan", "welemen", "cacix", "kokerç", "yağlama", "güveç", "arabAşı", "tantuni"));
        elemanlarınHarfSayisiYedidenAz(menu);
        System.out.println("\n   ********        ");
        elemanlarınWileBAşlaması(menu);
        System.out.println("\n   ********        ");
        elemanlarınEnAzBiriXileBitmesi(menu);


    }//main sonu

    // Task : List elelmmalarinin karakter sayisini 7 ve 7 'den az olma durumunu kontrol ediniz.
    public static void elemanlarınHarfSayisiYedidenAz(List<String> menu) {

        boolean kontrol = menu.stream().allMatch(t -> t.length() <= 7);
        if (kontrol) {
            System.out.println("menüdekiler 7 ve daha az harften oluşuyor");

        } else System.out.println("menüdekiler 7  harften fazla karekterden oluşuyor");
    }
// Task : List elelmanlarinin "W" ile baslamasını kontrol ediniz.

    public static void elemanlarınWileBAşlaması(List<String> menu) {

        System.out.println(menu.
                stream().
                noneMatch(t -> t.toUpperCase().startsWith("W"))//akıştaki hiçbir eleman w ile başlamaz kontrol yapıldı
                ? "w ile başlayan yemek olur mu:( " //şart true ise
                : "wenemen ne menem bişey ");//şart false
    }

// Task : List elelmanlarinin "x" ile biten en az bir elemanı kontrol ediniz.

    public static void elemanlarınEnAzBiriXileBitmesi(List<String> menu) {

        System.out.println(menu.
                stream().
                anyMatch(t -> t.toUpperCase().endsWith("X"))?//en az bir elemanın x ile bitmesi
                "agam senden bi cacix olmazzz":"x ile biten yemek mi olur");

    }
}
