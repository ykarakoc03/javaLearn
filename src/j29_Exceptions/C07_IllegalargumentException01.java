package j29_Exceptions;

import java.util.Scanner;

public class C07_IllegalargumentException01 {

    public static void main(String[] args) {
        /*
        Trick->

        "throw" - throws" farkları
        1- "throws" -> main method kapanıs parantezi ile method body acılıs parantezi arasına yazılır.
           "throw" -> method body içinde tanımlanır.
        2- "throws" -> keywordden sonra birden fazla exception tanımlanabilir
           "throw" -> keywordden sonra sadece bir tane exception tanımlanır
        3- "throws" -> keywordden sonra sadece exception class name yazılır
            "throw" ->  keywordden sonra exception obj tanımlanır
        4- "throws" -> keyword method ilk satırda sadece bir kez tanımlanır
            "throw" -> keyword istenildiği kadar method body de tanımlanabilir.
                 */




        //IllegalargumentException-> kullanilmasini istenmeyen degerlerde program hata vermesi isteniyorsa bu excep firlatilir
        //ornek : yas datasi icin negatif deger girildiginde programin kirilmadan run olmasi ama girilen deger icin excep firlatmasi icin kullanilir

        Scanner sc =new Scanner(System.in);
        System.out.println("yasinizi giriniz");
        int age =sc.nextInt();

        try {
            if (age<0){
                throw new IllegalArgumentException();//throw keyword ile Excep. obj olusturularark hata tanimlanir ve firlatilir
                //boylece sartimiza uymayan deger icin de catch block a dusurerek daha pratik code yazildi
            }else System.out.println("agam yasin hayirli olsun");
            System.out.println("agam try block da bu yazıyı okuduysan excp fırlatmadı komut sorunsuz ");
        }catch (IllegalArgumentException e){
            System.out.println("milattan once mi kaldin. yasinizi dogru giriniz :)");
            System.out.println("agam catch block da bu yazıyı okuduysan excp fırlatıldı ve code handle edildi :) ");

        }
        System.out.println("agam sorun handle edildi DEWAMKEEE :)");//bu kod çalışmıssa pr sorunsuz kırılmadan run olmuştur

    }
}
