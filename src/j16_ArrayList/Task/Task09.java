package j16_ArrayList.Task;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task09 {

    public static void main(String[] args) {
    /* TASK :
   Bir integer list oluşturunuz ve bu list’deki tum sayıların karesinin
   toplamını bulan code create ediniz.
    */
        List<Integer> list = new ArrayList<>(List.of(3, 2));
        int toplam = 0;
        for (int i : list) {
            toplam += Math.pow(i,2);
        }
        System.out.println("toplam = " + toplam);
    }
}

