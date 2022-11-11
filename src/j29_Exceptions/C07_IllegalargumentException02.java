package j29_Exceptions;

import java.util.Scanner;

public class C07_IllegalargumentException02 {
    public static void main(String[] args) {
       try {
           System.out.println("try block basindan selam");
           hata();
           System.out.println("try block bsonundan selam");
       }catch (IllegalArgumentException e){
           System.out.println("catch block basindan selam");
           System.out.println(e);
           System.out.println(e.getMessage());
           e.printStackTrace();// Bunu en sona yazar
           System.out.println("catch block sonunda selam");
       }
        System.out.println("agam sorun handle edildi DEWAMKEEE :)");//bu kod çalışmıssa pr sorunsuz kırılmadan run olmuştur


    }//main sonu

    public static void hata(){
        throw  new IllegalArgumentException("Agam nettin yine mi hata :(  ");

    }


}
