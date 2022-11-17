package j34_Iterators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Task01 {
    public static void main(String[] args) {
        /*
        task1 -> Verilen bir integer listin tek  elemanrının karesini tersten iteartor  print eden code create ediniz>
         */

        List<Integer> l1 = new ArrayList<>(Arrays.asList(24, 38, 65, 9, 11, 7, 27, 23));

        System.out.println("l1 list ilk hali :" + l1);
        ListIterator<Integer> it1 = l1.listIterator();

        while (it1.hasNext()) {
            it1.next();
        }

        while (it1.hasPrevious()) {
            int num = it1.previous();
            if (!(num % 2 == 0)) {
                System.out.print(num * num + " ");
            }
        }

    }


}

