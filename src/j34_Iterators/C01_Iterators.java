package j34_Iterators;

import java.util.*;

public class C01_Iterators {
    public static void main(String[] args) {
        List<String> l1 = new ArrayList<>(Arrays.asList("Nur", "Gamze", "Erol", "Bekir"));
        System.out.println("l1 List ilk hali : " + l1);


        //l1 elemanlarini for loop ile print ediniz

        for (int i = 0; i < l1.size(); i++) {
            System.out.print(l1.get(i) + " ");
        }

        System.out.println();
        System.out.println("    *****       ");


        //l1 elemanlarini foreach ile print ediniz

        for (String k : l1) {
            System.out.print(k + " ");
        }

        System.out.println();
        System.out.println("    *****       ");
        // l1 herbir elemani :-) for loop ile update ediniz
        for (int i = 0; i < l1.size(); i++) {
            l1.set(i, l1.get(i) + ":-)");
            System.out.print(l1.get(i) + " ");
        }

        // l1 herbir elemani :-) foreach ile update ediniz

        System.out.println();
        System.out.println("    *****   foreach    ");

        for (String k : l1) {
            k = k + ":-(";
            System.out.print(k + " ");
        }
        System.out.println();
        System.out.println("list son hali " + l1);

   /*
        index desteklemeyn yapılarda tekrarlayan  aksiyon için for-each lopp update yapamaybilir yukarıdaki task'de oldugu gibi
        Bu durumda java ıterator intarface'den tanımlanacak variable ile takrarlayan aksiyonlar index olmadan yapılır.
         */

        System.out.println();
        System.out.println("   *** Iterators ***   ");

        Iterator<String> it1 = l1.iterator();//Iterator intface'den it1 variable tanımlandı .Atama olarak l1 elemanları atandı
        while (it1.hasNext()) {
            //hasNext()->it1 elamanları için pointer old yerde elekman varsa true yoksa false verir ve pointer bir sonrakı elelman önüne koyulur
            // next()-> list'in pointer önündeki  elemnını return eder
            System.out.print(it1.next() + " ");//Nur :-)  Gamze :-)  Erol :-)  Bekir :-)
        }
        System.out.println();
        System.out.println("   *** Iterators ***   ");

        //l2 elemanlari iterator ile silip print ediniz
        List<String> l2 = new ArrayList<>(Arrays.asList("Baran", "Gulsum", "Akif", "Nazim"));
        System.out.println("iterator oncesi l2" + l2);
        Iterator<String> it2 = l2.iterator();
        while (it2.hasNext()) {
            it2.next();// tekraradaki pointer onundeki elemani getirir
            it2.remove();//next in getirdigi elemani siler
        }
        System.out.println("iterator remove sonrasi l2 " + l2);

        System.out.println();
        System.out.println("   *** ListIterators ***   ");


        List<String> l3 = new ArrayList<>(Arrays.asList("Baran", "Gulsum", "Akif", "Nazim"));
        //l3 elemanlrina iterator ile :-) set edip print ediniz
        System.out.println("iterator set oncesi l3" + l3);
        ListIterator<String> it3 = l3.listIterator();
        while (it3.hasNext()) {
            ;// tekraradaki pointer onundeki elemani getirir
            it3.set(it3.next() + ":-)");//next in getirdigi elemani ekler
        }
        System.out.println("iterator set sonrasi l3 " + l3);


        System.out.println();
        System.out.println("   *** ListIterators ***   ");

        // l3 elemanlarini ilk harfi buyuk kln 3 harfi***karakteri ve l4 listesine ekleyip print ediniz
        List<String> l4 = new ArrayList<>(Arrays.asList("Serhat", "Yakup", "Mustafa", "Nazli"));
        System.out.println("iterator set ve add oncesi l3" + l3);
        ListIterator<String> l3unitertoru = l3.listIterator();// elemanlarini l3 ten aliyor
        ListIterator<String> l4unitertoru = l4.listIterator();
        while (l3unitertoru.hasNext()) {
            ;// tekraradaki pointer onundeki elemani getirir
            l3unitertoru.set(l3unitertoru.next().toUpperCase().charAt(0) + "***");//next() ile getirdigi elemanin ilk harfini buyuk alir ve 3 harf*** yazar

            l4unitertoru.hasNext();
            l3unitertoru.add(l4unitertoru.next());// tekrardaki update edilen l3 e l4 eklendi
        }

        System.out.println("iterator set  ve add sonrasi l3 " + l3);


    }
}