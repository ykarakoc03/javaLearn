package j35_Collection.C01_LinkedList;


import java.util.Arrays;
import java.util.LinkedList;

public class C03_LinkedList {
    public static void main(String[] args) {
        LinkedList<String> ll1 = new LinkedList<>(Arrays.asList("JavaCAN","Ebubekir", "Adem", "Ilker","Ebubekir", "Merve","JavaCAN", "Gulsum"));
        System.out.println("ll1 = " + ll1);//ll1 = [JavaCAN, Ebubekir, Adem, Ilker, Ebubekir, Merve, JavaCAN, Gulsum]
        //Linkedlist remove()...ilk node silinir ve silinen node return edilir.
        System.out.println("ll1.remove() = " + ll1.remove());//JavaCAN
        System.out.println("ll1 = " + ll1);//ll1 = [Ebubekir, Adem, Ilker, Ebubekir, Merve, JavaCAN, Gulsum]

        System.out.println("ll1.remove(3) = " + ll1.remove(3));//ll1.remove(3) = Ebubekir **->silinen
        System.out.println("ll1 = " + ll1);//ll1 = [Ebubekir, Adem, Ilker, Merve, JavaCAN, Gulsum]

        System.out.println("ll1.remove(\"Merve\") = " + ll1.remove("Merve"));//ll1.remove("Merve") = true **olan true versi
        System.out.println("ll1.remove(\"JavaTAR\") = " + ll1.remove("JavaTAR"));//ll1.remove("JavaTAR") = false  **olmayan eleman false verdi
        System.out.println("ll1 = " + ll1);//ll1 = [Ebubekir, Adem, Ilker, JavaCAN, Gulsum]

        System.out.println("ll1.removeFirstOccurrence(\"Ebubekir\") = " + ll1.removeFirstOccurrence("Ebubekir"));//ll1.removeFirstOccurrence("Ebubekir") = true **ilk gordugu ebubekiri sildi
        System.out.println("ll1 = " + ll1);//ll1 = [Adem, Ilker, JavaCAN, Gulsum]

        System.out.println("ll1.element() = " + ll1.element());//ll1.element() = Adem  **ilk node retur eder

        LinkedList<String> ll2 = new LinkedList<>(Arrays.asList("JavaCAN","Ebubekir", "Adem", "Ilker","Ebubekir", "Merve","JavaCAN", "Gulsum"));
        LinkedList<String> ll3 = new LinkedList<>(Arrays.asList("Hasan","Harun", "Haluk", "Hasmayan"));

        ll2.addAll(ll3);
        System.out.println("ll2 = " + ll2);//ll2 = [JavaCAN, Ebubekir, Adem, Ilker, Ebubekir, Merve, JavaCAN, Gulsum, Hasan, Harun, Haluk, Hasmayan]
        System.out.println("ll2.removeAll(ll3) = " + ll2.removeAll(ll3));//ll2.removeAll(ll3) = true
        System.out.println("ll2 = " + ll2);//ll2 = [JavaCAN, Ebubekir, Adem, Ilker, Ebubekir, Merve, JavaCAN, Gulsum]

        System.out.println("    ***************              ");
        System.out.println("ll2.get(2) = " + ll2.get(2));//ll2.get(2) = Adem
        System.out.println("ll2.getFirst() = " + ll2.getFirst());//ll2.getFirst() = JavaCAN
        System.out.println("ll3.getLast() = " + ll3.getLast());//ll3.getLast() = Hasmayan

    }
}
