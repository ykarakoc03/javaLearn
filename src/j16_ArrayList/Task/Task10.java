package j16_ArrayList.Task;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task10 {

    public static void main(String[] args) {
        /* TASK :
         * Verilen arraydeki tekrar eden sayilari, ilki haric silip, tekrarsiz
         * sayilardan olusan bir array haline getiren bir code create ediniz.
         *
         * INPUT : {1,2,2,3,1,4,2,5,6,8,7,5,9,1}
         * OUTPUT : [1,2,3,4,5,6,7,8,9]
         */

        int arr[]= {1,2,2,3,1,4,2,5,6,8,7,5,9,1};
        System.out.println(Arrays.toString(arr));
        List<Integer> tekrarsız=new ArrayList<>();
        for (int i:arr) {
            if (!tekrarsız.contains(i)) tekrarsız.add(i);
        }
        Collections.sort(tekrarsız);
        System.out.println("tekrarsız = " +tekrarsız);


    }

}
