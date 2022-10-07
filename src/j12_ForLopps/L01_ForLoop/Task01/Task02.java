package j12_ForLopps.L01_ForLoop.Task01;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {

 /*
        girilen ifadenin polindrome olmasını kontrol eden method create ediniz...
        plindrome:her iki yönde okundugunda eşit olan ifadeler

         */
        Scanner sc = new Scanner(System.in);
        System.out.print("bir metin  giriniz : ");
        String str = sc.nextLine();

        polindrome(str);//String parametreli method call



    }
    private static void polindrome(String str) {
        String  tersStr="";//bos bir String kutu kulah
        for (int i=str.length()-1;i>=0; i--){
        tersStr +=str.charAt(i);
        }
        System.out.println("girilen ifadenin tersi : " + tersStr);
        if (str.equalsIgnoreCase(tersStr)){
            System.out.println("girilen ifade POLİNDROME ");
        }else System.out.println("girilen ifade polindrome değil");


    }




}
