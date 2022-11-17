package j35_Collection.C01_LinkedList;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class C01_LinkedList {
    public static void main(String[] args) {
        /*
        LinkedList
        1- LinkedList'de elemanlar "data ve "adress olmak uzere iki kisimdan olusur ve elemanterine "node" olarak tanimlanir
        2- LinkedList'te ilk node data barindirmayan sadece adres bulunduran head node tanimlanmistir
        3- LinkedList'te son node adres kismi null olan sadece data bulunduran tail node tanimlanmistir.
        4- ArrayList searching LinkedList note ekleme ve silmede daha avantajlidir. LinkedLIst eleman bulmada index yapisi olmadigi icin daha yavastir
        5- LinkedList-> tren vagon iliskisi baglantisi gibi dusunulebilir.
        6- Collection obj tanimlanirken cons Class(LinkedList,ArrayList..) olmali Interface(List,Queue ..)olmamamsina dikkat edilmeli
            Ancak obj DataType olarak parent interface tanimlanabilir.
        7-Linkedlist class iki tane parent interface'den(List,Queue) implement edilmistir.

         */

        LinkedList<String> ll1 = new LinkedList<>(Arrays.asList("Ebubekir", "Adem", "Ilker", "Merve", "Gulsum"));
        //LimkedList Print
        System.out.println("ll1 = " + ll1);
        //Linkedlist add().
        ll1.add("Ugur");
        System.out.println("ll1 = " + ll1);

        ll1.add(2, "Abdulaziz");
        System.out.println("ll1 = " + ll1);
        ll1.addFirst("JavaCAN");
        System.out.println("ll1 = " + ll1);
        ll1.addLast("JavaTAR");
        System.out.println("ll1 = " + ll1);//[JavaCAN, Ebubekir, Gülsüm, Abdulaziz, Adem, İlker, Merve, ugur, JavaTAR]
        List<String> ll2 = new LinkedList<>(Arrays.asList("Fatih", "Erol", "Nur"));//DataType interface List olan LinkedList
        ll1.addAll(ll2);
        //ll1.addAll("Agam");//CTE-> paramete Col olmazsa

        System.out.println("ll1 = " + ll1);//[JavaCAN, Ebubekir, Gülsüm, Abdulaziz, Adem, İlker, Merve, ugur, JavaTAR, Fatih, Erol, Nur]
        ll1.addAll(3, ll2);
        System.out.println("ll1 = " + ll1);//[JavaCAN, Ebubekir, Gülsüm, Fatih, Erol, Nur, Abdulaziz, Adem, İlker, Merve, ugur, JavaTAR, Fatih, Erol, Nur]
    }
}
