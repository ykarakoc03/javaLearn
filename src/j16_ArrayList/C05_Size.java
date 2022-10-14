package j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C05_Size {
    public static void main(String[] args) {
        //size(); Liste eleman sayısını return eder
        ArrayList<String> listSehir=new ArrayList<>(List.of("Münih","LosAngeles","Londra","stockholm"));
        System.out.println(listSehir.size());//4


    }
}
