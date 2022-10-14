package j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C08_isEmpty_clear {
    public static void main(String[] args) {
        //isEmpty();-> listin boş olmasını kontrol eder true/false return eder
        //clear();-> listin tüm elemanlarını siler
        ArrayList<String> listSehir=new ArrayList<>(List.of("Münih","LosAngeles","Londra","stockholm","Angara","pataGonya"));
        System.out.println("listSehir = " + listSehir);

        System.out.println("listSehir.isEmpty() = " + listSehir.isEmpty());//false listin boş olup olmadığı kontrol edilid

        listSehir.clear();//liste temizlendi

        System.out.println("listSehir = " + listSehir);//temizledikten sonra

        System.out.println("listSehir.isEmpty() = " + listSehir.isEmpty());//true boş olup olmadığı kontrol edildi
    }
}
