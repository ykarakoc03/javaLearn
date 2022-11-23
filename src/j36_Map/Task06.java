package j36_Map;

import java.util.HashMap;
import java.util.Scanner;

public class Task06 {
/*
map1() isminde bir method oluşturun.
Parametresi   bir Integer -String map  ve bir int
return tipi String
Tamsayı değerlerini (int) döndürün.
ÖRNEK:
Map:
                1 ,  "Lion"
                2 ,  "Tiger"
                3 ,  "Elephant"
                4 ,  "Cat"
                5  , "Dog"
Integer 3
Cevap Elephant olmalı.
 */
public static void main(String[] args) {

    HashMap<Integer, String> animals=new HashMap<>();
    animals.put(1,"Lion");
    animals.put(2,"Tiger");
    animals.put(3,"Elephant");
    animals.put(4,"Cat");
    animals.put(5,"Dog");

    Scanner scanner=new Scanner(System.in);
    System.out.println(  "istedihiniz deger için bir sayı giriniz");
    int sayi=scanner.nextInt();
    System.out.println(map1(animals, sayi));


}

    private static String map1(HashMap<Integer, String> animals, int a) {
    return animals.getOrDefault(a,"aradıgınız  hayvan bulunamadı");
    }


}
