package j36_Map;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class Task08 {
 /*
    ismi update() olan bir method oluşturun.
    Parametreleri , Integer -String HashMap,  int ve String olmalı. (3ayrı parametre)
    return tipi  Integer - String HashMap
    Eğer HashMap, int olan parametreyi içeriyorsa,
    int değerinde var olan String'i güncelleyin.
    Örnek :
     Hash map:
    1, "New jersey"
    2, "New York"
    3, "London"
    4, "Paris"

    int = 3
    String = Miami
    cevap aşağıdaki gibi olmalı:
    1, "New jersey"
    2, "New York"
    3, "Miami"
    4, "Paris"
     */

    public static void main(String[] args) {
        HashMap<Integer, String> sehir=new HashMap<>();
        sehir.put(1,"New jersey");
        sehir.put(2, "New York");
        sehir.put(3, "London");
        sehir.put( 4, "Paris");

        Scanner scanner=new Scanner(System.in);
        System.out.println(  "istedihiniz deger için bir sayı giriniz");
        int sayi=scanner.nextInt();
        System.out.println(  "şehir giriniz ");
        String str=scanner.next();


        System.out.println(update(sehir, sayi, str));


    }
    public static HashMap<Integer, String> update(HashMap<Integer, String> sehir, int sayi, String str){
        if(sehir.containsKey(sayi)) {
            sehir.put(sayi, str);
        }
        return sehir;
    }
}
