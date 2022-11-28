package J99_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class C09_skip {
    //skip(n) => atlama demek. Akışın ilk n elemanını attıktan sonra bu akışın kalan elemanlarından oluşan bir akış return eder.
    // akıs n den daha az eleman içeriyorsa  skip(n) neth dan sonra boş akıs return eder.skip(n) ara işlemdir.
    public static void main(String[] args) {

        List<String> menu = new ArrayList<String>(Arrays.asList("küşleme", "küşleme", "soğanlı", "soğanlı", "trileçe", "bicibici", "büryan", "welemen", "cacix", "kokerç", "yağlama", "güveç", "arabAşı", "tantuni"));
sonHarfineGöreilkİkiElemanHaricGetir(menu);
        System.out.println("\n   ********        ");




    }
    // Task : list elemanlarini son harfine göre siralayıp ilk iki eleman hariç kalan elemanlari print ediniz.
    public static void sonHarfineGöreilkİkiElemanHaricGetir(List<String> menu){
        System.out.println(Arrays.asList(
        menu.
                stream().
                sorted(Comparator.comparing(t->t.charAt(t.length()-1))).//akış elemaları son karekterlerine göre sıralandı
                skip(2).// akıştaki ilk iki eleman akıştan atıldı
                toArray()//akıs elemanları bir arraya atıldı
        ));

    }













}
