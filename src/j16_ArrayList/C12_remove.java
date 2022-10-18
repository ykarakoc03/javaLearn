package j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C12_remove {
    public static void main(String[] args) {
//remove(); list ten istene elemanı siler

        ArrayList<String> listSehir = new ArrayList<>(List.of("Münih", "LosAngeles", "Londra", "Stockholm"));
        System.out.println("listSehir.remove(\"Angara\") = " + listSehir.remove("Angara"));//false Silemesim yok
        System.out.println("listSehir.remove(\"Londra\") = " + listSehir.remove("Londra"));//true (sildim)
        System.out.println("listSehir.remove(1) = " + listSehir.remove(1));// LosAngeles sildigini verir
        //System.out.println("listSehir.remove(11) = " + listSehir.remove(1));// olmayanindeks verilirs rte verir
listSehir.add("Münih");
listSehir.add("Angara");
listSehir.add("Münih");
        System.out.println("listSehir = " + listSehir);
        System.out.println("listSehir.remove(\"Münih\") = " + listSehir.remove("Münih"));//tekrarlı eleman varsa ilk indezstekini siler diğerlerine dokunmaz
        System.out.println("listSehir = " + listSehir);//listSehir = [Stockholm, Münih, Angara, Münih]


        ArrayList<String> listUlke = new ArrayList<>(List.of("Alamanya","Amerigonya","ingiltere","isvec"));

        listSehir.addAll(listUlke);//sehirList'e ulkeList eklendi
        System.out.println("listSehir = " + listSehir);//ulkeList eklenemiş hali->[Stockholm, Münih, Angara, Münih, Alamanya, Amerigonya, ingiltere, isvec]

        listSehir.removeAll(listUlke);//sehirList'tten ulkeList çıkarıldı
        System.out.println("listSehir = " + listSehir);//ulkeList çıkarılmış hali->[Stockholm, Münih, Angara, Münih]

    }
}
