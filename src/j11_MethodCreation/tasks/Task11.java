package j11_MethodCreation.tasks;

import java.util.Scanner;

public class Task11 {

    public static void main(String[] args) {

    /*
    Kullanıcının yazdığı metni, 'hacker'ların konuşma diline çevirip return eden bir method(method ismi hackerDili) yazınız.

    Hackerlar bazı harfleri sayılara çevirerek yazışabiliyorlar. Genellikle çevirdikleri harfler şu şekilde:
    s -> 5
    a -> 4
    e -> 3
    i -> 1
    o -> 0

    Test data
    hackerDili("javayı severim")
    j4v4yı 53v3r1m

    İpucu harfleri değiştirin ve ekrana yazdırın.
    */
        Scanner sc = new Scanner(System.in);
        System.out.println("Bir metin giriniz :");
        String metin = sc.nextLine().toLowerCase();

        hackerDili(metin);

    }


    public static void hackerDili(String a) {
        char[] karakter = {'o', 'i', 'e', 'a', 's'};
        char[] num = {'0', '1', '3', '4', '5'};

        for (int i = 0; i < a.length(); i++) {
            for (int k = 0; k < karakter.length; k++) {
                if (a.charAt(i) == karakter[k]) {
                    a = a.replace(a.charAt(i), num[k]);
                }
            }

        }System.out.println( "bak " +a);

    }

}