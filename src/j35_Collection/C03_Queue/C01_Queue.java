package j35_Collection.C03_Queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class C01_Queue {
    public static void main(String[] args) {
        /*
        Queue call. interface olduğu için child class olan LinkedList ve PriorityQueue ile obj üretilir.
        Eczane yemekhane ve belirli şart ile aksiyon alan elemanlar için kullanılır.
         Cons seçimine gör queue obj özellikleri belirlenir.
         FİFO-> first in first out: Coll. ilk giren eleman ilk Çıkar.

         */
        Queue<String> q1= new LinkedList<>(Arrays.asList("Cebrail","Sümeyra","Yakup","Muharrem"));
        System.out.println("q1 = " + q1);//q1 = [Cebrail, Sümeyra, Yakup, Muharrem]
        q1.add("Erol");
        System.out.println("q1 = " + q1);//q1 = [Cebrail, Sümeyra, Yakup, Muharrem, Erol]

        Queue<String> q2= new PriorityQueue<>(Arrays.asList("javaCAN","javaSU","javaNAZ","javİYE"));
        System.out.println("q2 = " + q2);//q2 = [javaCAN, javaSU, javaNAZ, javİYE]
        q2.add("java");
        System.out.println("q2 = " + q2);//q2 = [java, javaCAN, javaNAZ, javİYE, javaSU]

        System.out.println("q1.element() = " + q1.element());//q1.element() = Cebrail
        System.out.println("q1.peek() = " + q1.peek());//q1.peek() = Cebrail

        System.out.println("q1.remove() = " + q1.remove());//q1.remove() = Cebrail
        System.out.println("q1.poll() = " + q1.poll());

        //peek()-> copy-paste gibi ilk elemanı return eder ama silmez
        //poll()-> cut-Paste gibi ilk elemanı siler ve return eder
        //element()-> ilk elemanı silmeden return eder
        //remove()-> ilk elemanı siler ve return eder

        // Trick pıll ve remove farkı -> eger queue call boş ise remove NoSuchElementException hataso veriri
        // poll ise sadece null return eder.

        q1.clear();
        System.out.println("q1 = " + q1);//q1 = []
        System.out.println("q1.size() = " + q1.size());//q1.size() = 0
        System.out.println("q1.poll() = " + q1.poll());//q1.poll() = null
        //System.out.println("q1.remove() = " + q1.remove());//RTE

        //offer()-> queue call eleman eklemem için kullam-nılır.
        System.out.println("q2.offer(\"küşleme\") = " + q2.offer("küşleme"));//true

/*
ahan da Trick kösesinde bugun : offer ve add farkı ->  eger queue coll. eleman kısıtlaması yapılmış ise
 add meth Exception fırlatır.offer ise true-false return eder.

*/




    }
}
