package j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C06_Set {
    public static void main(String[] args) {
//set();-> listin istenen indexe istenem elemanını update eder

        ArrayList<String> listSehir=new ArrayList<>(List.of("Münih","LosAngeles","Londra","stockholm"));
        System.out.println(listSehir.set(3, "Angara"));//stockholm-> set edilen degeri print eder

        System.out.println(listSehir);//[Münih, LosAngeles, Londra, Angara] listin set edilmiş hali print eder

        System.out.println(listSehir.set(11, "pataGonya"));// olmayan indez set edilirse Rte verir
    }
}
