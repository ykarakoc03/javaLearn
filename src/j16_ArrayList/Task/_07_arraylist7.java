package j16_ArrayList.Task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _07_arraylist7 {

    /*
        common_values() isminde bir method oluşturun.
        Parametre olarak 2 tane Integer ArrayList
        Return tipi integer ArrayList olmalı
         İki arraylist alın ve arraylist'teki tüm ortak değerleri döndürün
        Örneğin;
        ArrayList 1:    3 , 2 , 5 , 6
        ArrayList 2:     5 , 8 , 9
        return  5 olmalı

        Örneğin;
        ArrayList 1: 8,7,9,6,7
        ArrayList 2: 6,7,12,3,1
        return 6 ve 7 olmalı
     */

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(List.of(8, 7, 9, 6, 7));
        ArrayList<Integer> list2 = new ArrayList<>(List.of(6, 7, 12, 3, 1));
        System.out.println(common_values(list1, list2));
    }

    private static ArrayList<Integer> common_values(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> ortakList = new ArrayList<>();
        for (int i : list1) {
            for (int j : list2) {
                if (i == j && !ortakList.contains(i)) ortakList.add(i);
            }
        }

        return ortakList;
    }
}
