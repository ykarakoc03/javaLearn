package J99_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class C05_sorted {
    public static void main(String[] args) {
        List<Integer> sayi = new ArrayList<>(Arrays.asList(24, 38, 49, 33, 7, 3, 42, 66, 75, 45, 46, 55, 35, 25, 67, 16));
        //List<Integer> sayi = new ArrayList<>(Arrays.asList(1, 3, 5, 4, 6, 12, 8));//filter olarak cift  sartı null verecegi için optional class ataması yapar
        ciftKareKbPrint(sayi);
        System.out.println("\n   ********        ");
        tekKatreTersSıra(sayi);
        System.out.println("\n   ********        ");
    }//main sonu


    public static void ciftKareKbPrint(List<Integer> sayi) {
        sayi.
                stream().// kist elemanları akışa alındı
                filter(C01_LambdaExpression::ciftMi).// çift elemana göre filtrelendi
                map(t -> t * t).//çift elemanların karesi alındı
                sorted().//elemanları dogal sıraladı
                forEach(C01_LambdaExpression::yazdir);//print
        //sorted() => Doğal düzene göre sıralanmış, bu akışın elemanlarında oluşan bir akış döndürür.
        //Sorted() methodu tekrarlı kullanılırsa en son kullanılan aktif olur.

    }

    // Task : list'in tek  elemanlarinin kareleri ni buykten kucuge  print ediniz.
    public static void tekKatreTersSıra(List<Integer> sayi) {
        sayi.
                stream().
                filter(t -> t % 2 == 1).
                map(t -> t * t).
                sorted(Comparator.reverseOrder()).//Comparator.reverseOrder() meth. call edildi
                forEach(C01_LambdaExpression::yazdir);
             //reverseOrder() => Comparator Class'ının bir methodudur. Doğal sıralamanın tersini (büyükten küçüğe) uygulayan
             // bir Comparator (karşılaştırıcı) return eder.

    }
}
