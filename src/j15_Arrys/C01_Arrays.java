package j15_Arrys;

import java.util.Arrays;

public class C01_Arrays {

    public static void main(String[] args) {
        /*
Array (Dizi): Java'da birden fazla variable store etmek icin kullanilan objelerden biridir
Array olusturulurken 2 seyi declare etmeliyiz:
1- data type (Bir array'in icerisinde sadece ayni data tipinden elemanlar omalıdır.)
2- uzunluk (uzunluk array'in icerisne konul max eleman sayisini belirtir ve bundan fazlasini koymak istersek RTE verir)
array= tepsiye benzer..
Array'de primitive datalar veya non-primitive datalarin referanslari store edilebilir
 isimler array'inin icinde isim degerleri degil, isimlerin referanslari saklanır
 */
        //Array tanımlama...
        int a;// declare edilen ama atanmayan primitive data
        int sayiArr1[];//declare edilen amaatanmayan int type array

        String isimArr[] = {"muharrem", "enise", "cebrail", "nazım", "özge"};// hem tanımlama hem atama
        //String [] isimArr = {"muharrem","enise","cebrail","nazım","özge"};// hem tanımlama hem atama tercih edilmesede böylede olur

        int sayiArr[] = new int[5];//java heap memory'de 5 default->0 olan int array create edildi

        //Array eleman ekleme
        sayiArr[2] = 34;
        sayiArr[0] = 35;
        sayiArr[1] = 34;
        sayiArr[3] = 61;
        sayiArr[0] = 34;// 0 index array elemanı 34 degeri ile update edildi
        // array elemanları uniqe olmak zorunda değildir, tekrarlı array elemanı olabilir.


        //array eleman sayısı boyut degeri...
        System.out.println("sayiArr.length = " + sayiArr.length);//5

        //Array son elemanı
        System.out.println("array son elemanı" + isimArr[isimArr.length - 1]);//özge

        isimArr[isimArr.length - 1] = "QA Özge Hanım";// array son eleman opdate edildi

        //Arrayde olmayan eleman
        // önemli trick  -->  sayiArr[1]=23;//CTE vermez ama olmayan eleman RTE verir -> array run time da oluşur***

        // Array elemanları print etme...
        for (int i = 0; i < isimArr.length; i++) {
            System.out.println(isimArr[i]);
        }
        System.out.println("isimArr =" + isimArr);//isimArr =[Ljava.lang.String;@180bc464 -> referans degerini print eder

        System.out.println(Arrays.toString(isimArr));//isimArr stringe çevirdi->[muharrem, enise, cebrail, nazım, QA Özge Hanım]

        // Task sayiArr elemanlarından değeri tek olanları prin ediniz

        for (int i = 0; i < isimArr.length; i++) {
            if (sayiArr[i] % 2 == 1) {
                System.out.println(sayiArr[i] + " ");
            }
        }

        //task -> sayıArr çift index elemanları print ediniz

        for (int i = 0; i < isimArr.length; i += 2) {
            System.out.println(sayiArr[i] + " ");
        }

        // Task -> isimArr 5 harfli elemanlarından oluşan arrayım elemanlarını print edini<
        String yeniArr [] = new String[isimArr.length];
        for (int i = 0; i < isimArr.length; i++) {
            if (isimArr[i].length()==5) {
                yeniArr [i]=isimArr[i];
            }
        }
        System.out.println(Arrays.toString(yeniArr));
    }
}
