package j16_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C14_listConvertArray {
    public static void main(String[] args) {
//List'i Arraya cevirme ->toArray(0;
        // 1.yontem->toArray(); parametre olarak String[0] olarak yapilir.

        ArrayList<String> listUlke=new ArrayList<>(List.of("Alamanya","Amerikonya","İngilter","isveç"));
        String arrUlke []=listUlke.toArray(new String[0]);//ulke listi elemanlari arrulke olarak atandi

        System.out.println("listUlke = " + listUlke);//listUlke = [Alamanya, Amerikonya, İngilter, isveç]
        System.out.println("arrays olarak: "+Arrays.toString(arrUlke));//arrays olarak: [Alamanya, Amerikonya, İngilter, isveç]

        //2.yontem-> olusturulan array'in data type objectolarak atanir
        //Trick-> Object class javada tum class'larin parent(atasi:Hz. Adem)
        //Object Class javada parenti olmayan tek Classdir
        // string Integer Calslar object class child i oldugu icin istene durumlarda
        Object arrUlkeler []=listUlke.toArray();//Object classi ile
        System.out.println("object klasi ile" +Arrays.toString(arrUlkeler));//object klasi ile[Alamanya, Amerikonya, İngilter, isveç]


    }


}


