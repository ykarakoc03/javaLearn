package J99_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class C04_reduce {
    /*
        reduce()-->azaltmak ... bir cok datayi tek bir dataya(max min carp top vs islemlerde) cevirmek icin kullanilir.
        kullanımı yaygındır pratiktir.
        Bir Stream içerisindeki verilerin teker teker işlenmesidir. Teker teker işleme sürecinde, bir önceki adımda elde edilen sonuç
        bir sonraki adıma girdi olarak sunulmaktadır. Bu sayede yığılmlı bir hesaplama süreci elde edilmiş olmaktadır.
        reduce metodu ilk parametrede identity değeri, ikinci parametrede ise BinaryOperator türünden bir obj kullanılır.
        reduce işleminde bir önceki hesaplanmış değer ile sıradaki değer bir işleme tabi tutulmaktadır.
        İşleme başlarken bir önceki değer olmadığı için bu değer identity parametresinde tanımlanmaktadır.

        */
    public static void main(String[] args) {
         List<Integer> sayi = new ArrayList<>(Arrays.asList(24, 38, 49, 33, 7, 3, 42, 66, 75, 45, 46, 55, 35, 25, 67, 16));
        //List<Integer> sayi = new ArrayList<>(Arrays.asList(1, 3, 5, 4, 6, 12, 8));//filter olarak cift  sartı null verecegi için optional class ataması yapar
        //Lambda ->Stream API
        System.out.println("\n   ***   ");
        ciftKareMaxPrint(sayi);//Optional[4356]
        elTopla(sayi);
        ciftElCarpım(sayi);
        enKucuk(sayi);
        yirmidörttenBüyükenKucuk(sayi);

    }//main sonu

    // Task : List'in cift elemanlarin karelerinin en buyugunu print ediniz.
    public static void ciftKareMaxPrint(List<Integer> sayi) {
        //Optional<Integer> maxEleman= sayi.//filter işleimi null değer return etme riskine karsı Optional Class type data casting yapıldı
        //           stream().//list elemanları akısa laındı
        //           filter(C01_LambdaExpression::ciftMi).//akısdaki list elelmnalrı cift fitrelendi
        //           map(t->t*t).//fitrelenen cift akıs elemanları karesi ile update edildi
        //           reduce(Math::max);//cift fitrelelen ve karesi alınan akıs elemanları max elemana göre reduce-> azaltıldı.
        //   System.out.println(maxEleman);
        System.out.println(sayi.
                stream().//list elemanları akısa laındı
                        filter(C01_LambdaExpression::ciftMi).//akısdaki list elelmnalrı cift fitrelendi
                        map(t -> t * t).//fitrelenen cift akıs elemanları karesi ile update edildi
                //reduce(Math::max));
                        reduce(Integer::max));//specific class daha hızlı çalışır


    }
//// Task : List'teki tum elemanlarin toplamini yazdiriniz.

    public static void elTopla(List<Integer> sayi) {
        Optional<Integer> toplam = sayi.stream().reduce(Integer::sum);
        System.out.println(toplam);

        System.out.println("lambta expression : " + sayi.stream().reduce(0, (a, b) -> a + b));//Lambda expression
    /*
    a : ilk degerini her zaman atanan identity değerinden alır
    b: değerini her zaman stream akışından alır.
    a ilk değerden sonraki değerlerini action(işlem body)'den alır
     */

    }

    // Task : List'teki cift elemanlarin carpimini  yazdiriniz.
    public static void ciftElCarpım(List<Integer> sayi) {

        System.out.println("Lambda expression Çarpım sonuç : " +    //bu işlemin sonucu mutlaka integer döneceği için Optional devreye girmez.
                // deger bulunamasa bile kesinlikle null olmaz, girilen sayıyı dödürür verir

                sayi.stream().
                        filter(C01_LambdaExpression::ciftMi).
                        reduce(1, (t, u) -> t * u));

        System.out.println("Mats sınıf le çarpma " +
                sayi.stream().
                        filter(C01_LambdaExpression::ciftMi).
                        reduce(Math::multiplyExact));// MAth clasatan method refere.

    }

    // Task : List'teki elemanlardan en kucugunu 4 farklı yontem ile print ediniz.
    public static void enKucuk(List<Integer> sayi) {
        System.out.println("**** en küçügü bul *******");
        System.out.println(sayi.stream().reduce(Math::min));
        System.out.println(sayi.stream().reduce(Integer::min));
        System.out.println(sayi.stream().reduce(C04_reduce::ByMinBul));
        System.out.println(sayi.stream().reduce(Integer.MAX_VALUE, (a, b) -> a < b ? a : b));

    }

    public static int ByMinBul(int a, int b) {// meth refe için seed(tohul) meth
        return a < b ? a : b;
    }

    // Task : List'teki 24'ten buyuk en kucuk tek sayiyi print ediniz.
    public static void yirmidörttenBüyükenKucuk(List<Integer> sayi) {
        System.out.println("24 ten büyük en küçük sayı: ");
        System.out.println(sayi.stream().filter(t -> t > 24 && t % 2 == 1).reduce(Integer::min));
        // System.out.println(sayi.stream().filter(t -> t > 24 && C01_LambdaExpression::ciftMi)-> CTE : exp. ve meth ref aynı parametrede olamaz
    }


}



