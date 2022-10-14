package j16_ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class C02_nCopies {
    public static void main(String[] args) {

        ArrayList<String> listUlke=new ArrayList<>(List.of("Alamanya","Amerikonya","İngilter","isveç"));
        ArrayList<String> listSehir=new ArrayList<>(List.of("Münih","LosAngeles","Londra","stockholm"));

        //nCopies (int, obj);-> int elemanlı bir objeden oluşan list ataması yapıyor
        ArrayList<String> yeniList = new ArrayList<>(Collections.nCopies(3,"javaCAN"));
        System.out.println("nCopies methodu ile :" +yeniList);

        //addAll();-> bir liste diğer listi oldugu gibi ekler
        listUlke.addAll(listSehir);//listÜlkenin sonuna list şehir tamamen eklendi
        System.out.println("addAll methodu :"+listUlke);

        listSehir.addAll(3,listUlke);//3. indexten itibaren ülke listi şehir liste tamamen eklendi
        System.out.println("listsehire 3. indexten sonra ekleme yapıldı :"+listSehir);

        //task-> 1 den 10 kadar sayıları bir list e atayıp  print eden code
        List<Integer> sayi = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
           sayi.add(i);
        }
        System.out.println(sayi);
    }
}
