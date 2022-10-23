package j16_ArrayList.Task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _06_arraylist6 {

    /*
    hillNum() isminde bir method oluşturun.
    Parametre olarak Integer ArrayList
    Return tipi int,
    Eğer sayı, önceki sayıdan küçük ve bir sonraki sayıdan büyük ise, o sayıyı yazdırın.
    Örneğin;
    ArrayList  5,4,6,2,1
    2, 6'dan küçük ve 1 den büyüktür.
    Return 2 olmalı.
     */

    public static void main(String[] args) {

        ArrayList<Integer> liste = new ArrayList<>(List.of(5,4,6,2,1));
        System.out.println(hillNum(liste));


    }

    private static int hillNum(ArrayList<Integer> liste) {
        for (int i = 1; i < liste.size(); i++) {
            if (liste.get(i)< liste.get(i-1) &&liste.get(i)>liste.get(i+1)){
                return liste.get(i);
            }
        }

        return 0;
    }
}
