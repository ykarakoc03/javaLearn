package j29_Exceptions;

import java.util.Scanner;

public class Task01 {
    /*
Task -> Girilen password'un 6 karakterden az 10 karakterden fala olmamasını kontrol eden code create ediniz
 */
    public static void main(String[] args) {


        Scanner scanner= new Scanner(System.in);
        System.out.println("password giriniz");

        String password = scanner.next();

        try {
            if (password.length()<6){
                throw new IllegalArgumentException(" 6 karekterden az girdiniz");
            }else if (password.length()>10){
                throw new IllegalArgumentException(" 10 karekterdenfazla girdiniz");
            }else System.out.println("password gecerli "+password);
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
            System.out.println("hata yakalandiii");


        }
        System.out.println("agam sorun handle edildi DEWAMKEEE :)");//bu kod çalışmıssa pr sorunsuz kırılmadan run olmuştur

    }
}
