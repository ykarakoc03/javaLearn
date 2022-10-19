package j16_ArrayList.Task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class _04_arraylist4 {

    /*
        İsmi changeInArraylist() olan bir method oluşturun.
        Parametre olarak String ArrayList, String s1, String s2
           Arraylist'te s1'i s2 olarak değiştirin

        Return String arrayList

        Örneğin;
        Arraylist  "yellow" , "red" , "blue" , "red" , "blue"
        s1 = blue
        s2 = yellow
        Tüm blue 'ları yellow'a dönüştürün.
        cevap: "yellow" , "red" , "yellow" , "red" , "yellow"
     */

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList<String> liste = new ArrayList<>(List.of("yellow" , "red" , "blue" , "red" , "blue"));

        System.out.println(liste+"değiştirmek istediğiniz elemanı yazınız");
        String eski= sc.next();
        System.out.println("yeni elemanı yazın");
        String yeni= sc.next();
        System.out.println("yeni liste :"+changeInArraylist(liste, eski, yeni));
    }

    private static ArrayList<String> changeInArraylist(ArrayList<String> liste, String eski, String yeni) {
        for (int i=0; i<liste.size();i++) {
            if (liste.get(i).equalsIgnoreCase(eski)){
                liste.set(i,yeni);
            }
        }

        return liste;
    }
}
