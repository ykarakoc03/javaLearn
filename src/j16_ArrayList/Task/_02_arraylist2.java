package j16_ArrayList.Task;

import java.util.ArrayList;
import java.util.List;

public class _02_arraylist2 {

      /*
        getSum() isminde bir method oluşturun.
        Parametresi ArrayList olmalı
        Return tipi int olmalı.
        ArrayList teki tüm sayıları birbiri ile toplayın.
        return olarak toplam sonucu döndürün.
        Örneğin;
        Arraylist = 1,2,3,4,5
        return 15 olmalı
         */

    public static void main(String[] args) {
        List<Integer> num=new ArrayList<>(List.of(1,2,3,4,5));
        System.out.println(num+" listenin toplamı :"+getSum(num));
    }

    private static int getSum(List<Integer> num) {
       int toplam =0;
        for (int i:num) {
            toplam +=i;
        }
        return toplam;
    }
}
