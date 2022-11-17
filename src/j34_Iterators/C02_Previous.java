package j34_Iterators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class C02_Previous {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>(Arrays.asList(24, 38, 65, 9, 11, 7, 27, 23));
        //l1 elemarini tersten print ediniz.
        System.out.println("l1 list ilk hali :" + l1);
/*
tekrarda son elemandan baslayan isler icin pointer en sona goturmeli
Bunun icin pointere sona goturen hasNext() meth calismali
 */
        ListIterator<Integer> it1 = l1.listIterator();
        while (it1.hasNext()) {// bu pointeri bastan sona goturmesi icin yazdik
            it1.next();
        }
        while (it1.hasPrevious()) {//sondan basa  pointeri geriye getiriyor oncesin varmi kontrol eder
            System.out.print(it1.previous() + " ");
        }
        System.out.println();

        List<String> l2 = new ArrayList<>(Arrays.asList("Cagla", "Ugur", "Muharrem", "Cebrail"));
        //l2 elemanlarinin sonuncusuna :-) ekleyip print ediniz.
        System.out.println("Listiterator oncesi l2 : " + l2);
        ListIterator<String> it2 = l2.listIterator();
        while (it2.hasNext()) {

            String s = it2.next();
            if (!it2.hasNext()) {//son elaman-> sonrasında eleman yok
                it2.set(s + " : -) ");
            }
        }

        System.out.println("Listiterator sonras l2 : " + l2);


        /*
      çoooğ önemli ->  hasPrevious() meth için MUTLAKA KESİNLİKLE hasNext() ve next() meth
      calıştırılarak cursor(pointer) en sona getirilmeli.

      ITERATOR VE LISTITERATOR farkları

      1- ITERATOR-> sadece hasNext(), next(), remove() meth çalışır
         LISTITERATOR -> hasNext(), next(), remove(). hasPrevious(), previous(),add(), set() vs methodlar çalışır

      2- LISTITERATOR -> sadece List yapılarda tanımlanır
         ITERATOR-> tum collection(list set Array, map..) için tanımlanır.

      3- ITERATOR-> sadece ileri b->s tekrarlar
        LISTITERATOR -> b<->s ileri ve geri çift yönlü tekrarlar

        ITERATOR-> kapsamı geniş ama aksiyonu az
        LISTITERATOR -> kapsamı dar ama aksiyıonu çok

         */


    }


}