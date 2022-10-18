package j00_Exercise.Day02;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        System.out.println("Bir sayı giriniz Çıkmak için -q- giriniz  :  ");
        Scanner scan= new Scanner(System.in);
        String str = "";
        while (!str.equals("q")) {

            str= scan.next().trim().toLowerCase();




        }
    }
}
