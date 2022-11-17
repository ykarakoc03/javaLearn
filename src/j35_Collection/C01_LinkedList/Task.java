package j35_Collection.C01_LinkedList;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
/*
Task->
Node değerleri "yakup","javaCAN","javaTAR","Teykinay" olan bşe linkedLst create ediniz.
Girilen bir String değeri linkedListte varlığını kmontrol edip varss slilp "Agam elelman halledildi"
yoksa "Agam aradığınız kişiye ulaşılamadı" print eden code create edinzi

 */
        LinkedList<String> ll1=new LinkedList<>(Arrays.asList("yakup","javaCAN","javaTAR","Teykinay"));
        Scanner sc=new Scanner(System.in);
        System.out.println("bir isim giriniz");
        String isim=sc.next();

        if (ll1.remove(isim)){//true->istenen node var ve siler
            System.out.println("isim silindi");
            System.out.println("isim silindikten sonra"+ll1);
        } else System.out.println("ardiginiz isim bulunamadi");


    }
}
