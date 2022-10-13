package j15_Arrys;

import java.util.Arrays;

public class C06_MdArrays {
    public static void main(String[] args) {

/*
      Çok Boyutlu Diziler
Java'da Çok Boyutlu Diziler varsayılan bir veri tipi olarak bulunmazlar ve matris olarak adlandırılırlar.
 Dizilerin 2 boyutlu halleri şeklinde tanımlanırlar. Matrisler satır ve sütun şeklinde tablo verisi
 formatındaki verileri tutmak için kullanılır. Diziler liste halinde veriler için uygunken,
 matrisler tablo şeklindeki veriler için uygundur. Oluşturulan tabloda bir değere ulaşmak istersek
 satır ve sütun sayısını girmemiz yeterli olacaktır.
* TRICK :)İki boyutlu dizilerde tek boyutlu diziler gibi indis değeri 0'dan başlar.
Dizide tutulacak veri tipleri aynı olmak zorundadır farklı veri tiplerini aynı matriste tutamayız.

       * 1- Ic Icice olusturulan  array'lerde   disardaki ana array'e outer(kat) array
       *  icerdeki  array'lere  inner(daire) array denir
       * 2- TRICK->  icerdeki array'lerin boyutlari birbirinden farkli ise
       *  Array'i ancak tum elemenlari atanarak declare edilmeli
       * 3- Multi dimensional array'de bir elemanin indexi icin
       *  en distaki array haric, elemania kadar ic ice olan tum arraylerin indexlerini yazmak gerekir
       */

// Md array tanımlama
        int arr1[][] = new int[3][5];//3 katlı 5 er daireli boş bir apartman->3 satırlı, 5 sutunlu

        //Bir sitede her birinde 10 dairelik 8 katlı 6 apartman var. nasıl array olarak tanımlanır --> 3 boyutlu
        //TRICK Arrayı uzunlukları ile tanımlamak için inner uzunlukları eşit olmalı
        int site[][][] = new int[6][8][10];

        // 24 kişilik 3 sınıf ve 21 kişilik 5 sınıfı olan okul nasıl array olarak tanımlanır
        int sinir24[][] = new int[3][24];
        int sinir21[][] = new int[5][21];

//MdArray eleman ekleme...
        arr1[2][4]=35;//2.kat 4.daire değeri 35 atandı
        arr1[0][3]=34;//0. kat 5. daire değeri 34 atandı
        System.out.println(arr1[0][3]);

        //elemanları girerek Array tanımlama
        int arr [][]={{1,2,3},//0.kat
                      {10,20},//1.kat
                      {101}};//2.kat
        //101 eleman [2][0]
        //MdArrat eleman print etme
        System.out.println(arr[1]);//[I@30c7da1e referans degerini basar array (dizin) şeklinde istene deger dogrudan yazılma toString ile yazılır
        System.out.println(Arrays.toString(arr[1]));//[10, 20]--> 1. katı komple yazdırır
        System.out.println(arr[1][0]);//10 --> atanan degeri verir bu Array değil. atanmış bir değerdir.

// Multidimensional array'leri yazdirmak icin toString methodu kullanilamz
//  toString methodu outer methodu Stringe cevirir
// outer arrayin icinde inner arrayler oldugundan toString methodunda inner array'lerin
// referans degerlerini yazdirilir

//MultiDimensional Array'lerde istenen bir eleman nasil yazdirilir.

        System.out.println(Arrays.toString(arr));//[[I@5b464ce8, [I@30c7da1e, [I@57829d67] her katın referansını verdi
        System.out.println(Arrays.deepToString(arr));//[[1, 2, 3], [10, 20], [101]] birden fazla array oldugun  için.derinlemesine yapı,katlı matrix



    }
}
