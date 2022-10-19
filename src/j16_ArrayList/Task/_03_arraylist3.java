package j16_ArrayList.Task;

import java.util.ArrayList;
import java.util.List;

public class _03_arraylist3 {

    /*
        getLength() isminde bir method oluşturun.
        Parametre olarak String ArrayList
        Return tipi Integer ArrayList
        ArrayList içindeki her bir Stringin uzunluğunu bulunuz.

        Tüm elementlerin uzunluğunu döndürün

        Örneğin;
        ArrayList  :  "New jersey" ,"New york" , "Ohio" , "Florida" , "Boston"
        Tüm Stringlerin uzunluklarını yazdırın;
        cevap: 10 ,  8 , 4 , 7 , 6 olmalı
     */

    public static void main(String[] args) {
        ArrayList<String> sehir = new ArrayList<>(List.of("New jersey", "New york", "Ohio", "Florida", "Boston"));
        System.out.println(sehir + " listesindeki herbir elemanın uzunlugu :" + getLength(sehir));
    }

    private static ArrayList<Integer> getLength(ArrayList<String> sehir) {
        ArrayList<Integer> uzunluk = new ArrayList<>();
        for (String str : sehir) {
            uzunluk.add(str.length());
        }
        return uzunluk;
    }
}