package j16_ArrayList.Task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class _01_arraylist1 {

    /*
        ismi getCount() olan bir method oluşturun.
        Parametre olarak bir String ArayList  ve  bir tane String

        Return tipi int olmalı.

        ArrayList'teki bir değerin kaç kez tekrarlandığını belirtin ve döndürün.
        Örneğin;
        ArrayList = Orange , Kiwi , Peach , Banana , Orange
        String Orange:
        Count = 2 olmalı. (Orange 2 kez yazılmış)
         */

    public static void main(String[] args) {
        ArrayList<String> meyve= new ArrayList<>(List.of("Orange" , "Kiwi" , "Peach" , "Banana" , "Orange"));
        Scanner sc=new Scanner(System.in);
        System.out.println(meyve+"\nlistedeki hangi elemanın tekrar sayısını öğrenmek istiyorsunuz tekrarlanan :");
        String secim= sc.next();
        System.out.println(secim+" tekrarlanma sayısı :"+getCount(meyve, secim));
    }

    private static int getCount(ArrayList<String> meyve, String secim) {
       int count=0;
        for (String str:meyve) {
            if (str.equalsIgnoreCase(secim)){
                count++;
            }
        }
        return count;
    }
}
