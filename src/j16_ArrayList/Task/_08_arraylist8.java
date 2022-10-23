package j16_ArrayList.Task;

import java.util.*;

public class _08_arraylist8 {

    /*
        secondMax()  isminde bir method oluşturun.
        Parametre olarak integer ArrayList.
        Return tipi int olmalı.
        ArrayList'teki en yüksek (maximum) 2. değeri bulun ve onu döndürün
        ÖRN;
        ArrayList   --  5,3,4,6,7
        CEVAP : 6
     */

    public static void main(String[] args) {
ArrayList<Integer> liste=new ArrayList<>(List.of(5,3,4,6,7));
        System.out.println(secondMax(liste));

    }

    private static int secondMax(ArrayList<Integer> liste) {
        Collections.reverse(liste);
    return liste.get(1);
    }
}

