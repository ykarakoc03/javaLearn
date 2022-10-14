package j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C07_supList {
    public static void main(String[] args) {

        ArrayList<String> listSehir=new ArrayList<>(List.of("Münih","LosAngeles","Londra","stockholm","Angara","pataGonya"));
        //supList(); listenin istenen list parçasını return eder
        System.out.println(listSehir.subList(3, 5));//3,5 index elemanlarını return eder

        ArrayList<String> city=new ArrayList<>(listSehir.subList(2,5));//listSehir'den 2.3.4. index eelamnalrı city liste atandı.
        System.out.println("city = " + city);//city = [Londra, stockholm, Angara]
    }
}
