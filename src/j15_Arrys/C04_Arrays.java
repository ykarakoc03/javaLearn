package j15_Arrys;

import java.util.Arrays;

public class C04_Arrays {
    public static void main(String[] args) {
        // Array eşitliği kontrolu... equals()-> methodu index ve value kontrolüyapar ve true/false return eder

        int sayi1[]={39,3,72,63,84};
        int sayi2[]={84,72,63,3,39};

        System.out.println("sayı1 ve sayi2 eşit mi :" + Arrays.equals(sayi1, sayi2));//false

        Arrays.sort(sayi1);//[3,39,63,72,84]
        Arrays.sort(sayi2);//[3,39,63,72,84]
        System.out.println("sayı1 ve sayi2 eşit mi :" + Arrays.equals(sayi1, sayi2));//true


        //Array'i String'e cevirme... toString(arr) -> verilen arr'i string data type cevirir


        String str=Arrays.toString(sayi1);
        System.out.println("str= "+ str);//str= [3, 39, 63, 72, 84]Trick-> arr'in tüm karakterleri String olarak tanımlandı köşeli parantez ve boşluklar dahil
        System.out.println(str.substring(6));//, 63, 72, 84]
    }
}
