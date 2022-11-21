package j35_Collection.C03_Queue;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class C02_Deque {
    public static void main(String[] args) {
        /*
        Deque:Double Ended-> Queue'larda FİFO Deque'ıerde hem FİFO hem LİFO geçerlidir
         */

        Deque<String> dq1=new LinkedList<>(Arrays.asList("Küşleme","önkol","Böbrek yatagı","ezme","haydari"));
        System.out.println("dq1 = " + dq1);//dq1 = [Küşleme, önkol, Böbrek yatagı, ezme, haydari]
        dq1.add("humus");
        System.out.println("dq1 = " + dq1);//dq1 = [Küşleme, önkol, Böbrek yatagı, ezme, haydari, humus]

        System.out.println("dq1.getFirst() = " + dq1.getFirst());//dq1.getFirst() = Küşleme
        System.out.println("dq1 = " + dq1);//dq1 = [Küşleme, önkol, Böbrek yatagı, ezme, haydari, humus]

        System.out.println("dq1.getLast() = " + dq1.getLast());//dq1.getLast() = humus
        System.out.println("dq1 = " + dq1);//dq1 = [Küşleme, önkol, Böbrek yatagı, ezme, haydari, humus]

        System.out.println("dq1.peekFirst() = " + dq1.peekFirst());//dq1.peekFirst() = Küşleme
        System.out.println("dq1 = " + dq1);//dq1 = [Küşleme, önkol, Böbrek yatagı, ezme, haydari, humus]

        System.out.println("dq1.peekLast() = " + dq1.peekLast());//dq1.peekLast() = humus
        System.out.println("dq1 = " + dq1);//dq1 = [Küşleme, önkol, Böbrek yatagı, ezme, haydari, humus]

/*
Trick : getFirst() meth deque call. boş ise NoSuchElementException firlatır
peekFirst() meth. deque boş ise null return eder

 */
        dq1.clear();
        System.out.println("dq1 = " + dq1);//[]
        System.out.println("dq1.peekFirst() = " + dq1.peekFirst());//null
        //System.out.println("dq1.getFirst() = " + dq1.getFirst());// cte

        Deque<String> dq2=new LinkedList<>(Arrays.asList("havuç dilimi","güllaç","su muhallebisi","trileçe","kazan dibi"));
        System.out.println("dq2.pollFirst() = " + dq2.pollFirst());//dq2.pollFirst() = havuç dilimi** eger liste boş olsaytı null
        System.out.println("dq2.pollLast() = " + dq2.pollLast());//dq2.pollLast() = kazan dibi** eger liste boş olsaytı null
        System.out.println("dq2.removeFirst() = " + dq2.removeFirst());//dq2.removeFirst() = güllaç ** eger liste boş olsaytı CTE
        System.out.println("dq2.removeLast() = " + dq2.removeLast());//dq2.removeLast() = trileçe ** eger liste boş olsaytı CTE
        System.out.println( "code kontrolll");



    }


}
