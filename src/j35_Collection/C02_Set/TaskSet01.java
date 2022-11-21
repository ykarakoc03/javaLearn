package j35_Collection.C02_Set;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class TaskSet01 {
/*
    Task
    Parametre olarak bir String HashSet   ve  iki String alan  return type HashSet
   olan  changeSet() isminde bir method oluşturun.
    Eğer HashSet String 1 e sahipse,HashSet'in  String 1 elemanını String 2 ile değiştirin.
    ÖRNEK:
    hashset = "banana" , "strawberry" , "kiwi" , "pineapple"
    String 1 = banana
    String 2 = peach
    CEVAP: "peach" , "strawberry" , "kiwi" , "pineapple"
     */

    public static void main(String[] args) {
        HashSet<String> meyve= new HashSet<>(List.of("banana" , "strawberry" , "kiwi" , "pineapple"));
        Scanner scanner= new Scanner(System.in);
        System.out.println("meyve = " + meyve);
        System.out.println("lütfen değiştirmek istediğiniz meyveyi giriniz :");
        String degisecekMeyve=scanner.nextLine();
        System.out.println("lütfen yeni meyveyi giriniz :");
        String yeniMeyve=scanner.nextLine();
        System.out.println("Listenin değişmiş hali :"+changeSet(meyve, degisecekMeyve, yeniMeyve));
    }

    private static HashSet<String> changeSet(HashSet<String> meyve, String degisecekMeyve, String yeniMeyve) {
        meyve.remove(degisecekMeyve);
        meyve.add(yeniMeyve);

        return meyve;
    }


}
