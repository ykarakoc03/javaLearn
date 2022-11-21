package j35_Collection.C02_Set;

import java.util.*;

public class Task01 {
    public static void main(String[] args) {
/*
 Deger ataması yapılan Array'i arraylist'e ceviren method create ediniz
 main içersinde meth return ettiği arryList'i hashSet, linkedHashSet ve TreeSett'e atayınız.
 */


        String arr[]={"Muharrem","Umit","Sinan","Nihan"};

        arrayListeCevir(arr);
        HashSet<String> hs= new HashSet<>(arrayListeCevir(arr));
        LinkedHashSet<String> lhs = new LinkedHashSet<>(arrayListeCevir(arr));
        TreeSet<String> ts =new TreeSet<>(arrayListeCevir(arr));

        System.out.println("hash (Hurraa) set = " + hs);//hash (Hurraa) set = [Muharrem, Sinan, Nihan, Umit]
        System.out.println("linkedHashset erken gelen girer = " + lhs);//linkedHashset erken gelen girer = [Muharrem, Umit, Sinan, Nihan]
        System.out.println("TreeSet alfabetik sıra set = " + ts);//TreeSet alfabetik sıra set = [Muharrem, Nihan, Sinan, Umit]
    }//main sonu

    private static ArrayList<String> arrayListeCevir(String[] arr) {
        ArrayList<String> arLst= new ArrayList<>(List.of(arr));
        return arLst;
    }
}
