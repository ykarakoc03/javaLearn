package J99_Lambda;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class C11_stream_iterator {

    public static void main(String[] args) {
        System.out.println("Task 01 Amele code: " + toplamAmele(10));
        System.out.println("   ***   **  ***     ");
        System.out.println("Task 01 Cincix code: " + toplamCincix(10));
        System.out.println("   ***   **  ***     ");
        System.out.println("Task 02 ciftTopla " + toplamCiftayi(10));
        System.out.println("   ***   **  ***     ");
        System.out.println("Task 03 ilk x pozitif çift sayı " + toplamİlkXsayiÇift(10));
        System.out.println("   ***   **  ***     ");
        System.out.println("Task 04 ilk x pozitif tek sayı " + toplamİlkXsayiTek(10));
        System.out.println("   ***   **  ***     ");
        System.out.println("Task 05 ikini ilk x kuvveti ");
    ikininilkXkuvveti(7);
        System.out.println("   ***   **  ***     ");
        System.out.println("task 06 istenen sayını ilk x kuvveti");
                sayınınilkXkuvveti(2,3);
        System.out.println();
        System.out.println("task 07 faktörüyel(4) = " + faktörüyel(4));
        System.out.println("task08 -- > : "+istenenSayiXKuvvet(7, 5));
        System.out.println("task08 -- > : "+istenenSayiXKuvvet(3, 5));//243



    }//mailsonu

    //TASK 01 --> Structured Programming ve Functional Programming ile 1'den x'e kadar tamsayilari toplayan bir program create ediniz.
    //Structered Programming(Amele coding..)
    public static int toplamAmele(int x) {
        int toplam = 0;
        for (int i = 0; i <= x; i++) {
            toplam += i;

        }
        return toplam;
    }

    //Functional Programming
    public static int toplamCincix(int x) {
        return IntStream.// manual akış tanımlandı
                range(1, x + 1).//1 dahil x+1 hariç -> 1,2,3...x int sayılarından aralık tanımlandı
                sum();// akışa giran  1,2,3,...x tamsayıları toplandı
        //range(startInclusive,endExclusive);-> 1'lik artımlı bir adımla startInclusive'den (dahil) endExclusive'e (exclusive)
        // kadar sıralı bir IntStream return eder.
    }

    //TASK 02 --> 1'den x'e kadar cift tamsayilari toplayan bir program create ediniz.
    public static int toplamCiftayi(int x) {
        return IntStream.//manual akıs tanımlandı
                // range(1,x+1).//1 dahil x+1 hariç-> 1,2,3...x int sayılarından aralık tanımlandı
                        rangeClosed(1, x).//1 dahil x dahil-> 1,2,3...x int sayılarından aralık tanımlandı
                        filter(C01_LambdaExpression::ciftMi).//akısdaki tamsayıların çift olanları akısa alındı
                        sum();//akısa giren 1,2,3...x tam sayıları toplandı
        //rangeClosed(startInclusive,endInclusive);-> 1'lik artımlı bir adımla startInclusive'den (dahil) endInclusive'e (dahil) kadar  sıralı bir IntStream return eder.
    }

    //TASK 03 --> Ilk x pozitif cift sayiyi toplayan program  create ediniz.
    public static int toplamİlkXsayiÇift(int x) {

        return IntStream.iterate(2, t -> t + 2).//2'den başlayıp 2 arttırılan tekrar işlemin tanımlandı->2,4,6,8...
                limit(x).//akıştaki ilk x elemanı akışa alır
                sum();// akışın ilk x elemanı toplandı
//iterate(seed, repeat action) --> seed'den başlayarak repeat action'a göre  sonsuza kadar elemanları akısa alır.
    }

//TASK 04 --> Ilk X pozitif tek tamsayiyi toplayan programi  create ediniz.

    public static int toplamİlkXsayiTek(int x) {

        return IntStream.iterate(1, t -> t + 2).//2'den başlayıp 2 arttırılan tekrar işlemin tanımlandı->2,4,6,8...
                limit(x).//akıştaki ilk x elemanı akışa alır
                sum();// akışın ilk x elemanı toplandı

    }
//TASK 05 --> 2'nin ilk x kuvvetini ekrana yazdiran programi  create ediniz.

    public static void ikininilkXkuvveti(int x) {

       IntStream.iterate(2, t -> t*2).// 2 den başlayıp 2 ile çarpılarak tekrar işlemi tanımlandı->2,4,8
               limit(x).
               forEach(t-> System.out.print(t+ " "));
    }


//TASK 06 --> Istenilen bir sayinin ilk x kuvvetini ekrana yazdiran programi  create ediniz.
public static void sayınınilkXkuvveti(int istenenSayi, int x) {
        IntStream.iterate(istenenSayi,t->t*istenenSayi).limit(x).forEach(t-> System.out.print(t+" "));

}

//TASK 07 --> Istenilen bir sayinin faktoriyelini hesaplayan programi  create ediniz.
public static OptionalInt faktörüyel(int x) {
   return IntStream.rangeClosed(1,x).reduce((t,u)->t*u);

}

//TASK 08 --> Istenilen bir sayinin  x. kuvvetini ekrana yazdiran programi  create ediniz.
public static OptionalInt istenenSayiXKuvvet(int istenenSayi, int x){
    return  IntStream.
            iterate(istenenSayi,t->t*istenenSayi).//istenenSayi'den başlayıp istenenSayi ile çarpılarak tekrar işlemi tanımlandı
                    limit(x).//akısdaki ilk x eleman akısa alındı.
                    skip(x-1).//akısdaki x den önceki elelmanlar atlandı klanlar akısa alındı
                    findFirst();//akısdaki ilk eleman :x. elelman alındı

}
}
