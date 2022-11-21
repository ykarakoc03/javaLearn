package j35_Collection.C02_Set;

import java.util.*;

public class TaskSet02 {
    /*
        Task->
       return tipi linkedhashset olan removing() isminde bir method oluşturun.
        Parametre olarak bir LinkedHashset ve iki String ten oluşmalı.
        Eğer Stringler LinkedHashset 'in içinde varsa, silinmeli.

        Örneğin,
        linkedhashset : Germany , France , USA , Canada , Mexico , Brazil
        String 1= Germany
        String 2 = USA
         Germany ve USA 'i sil.
        Set'i return et.
         */
    public static void main(String[] args) {

        LinkedHashSet<String> ülke = new LinkedHashSet<>(List.of("Germany", "France", "USA", "Canada", "Mexico", "Brazil"));
        Scanner scanner = new Scanner(System.in);
        System.out.println("ülke = " + ülke);
        System.out.println("lütfen silmek istediğiniz ülkeleri giriniz :");
        List<String> silinecekÜlkeler = new ArrayList<>(Arrays.asList((scanner.nextLine().split(" "))));

        System.out.println(removing(ülke, silinecekÜlkeler));
    }
//Hatalı Kontrol et
    private static LinkedHashSet<String> removing(LinkedHashSet<String> ülke, List<String> silinecekÜlkeler) {
        for (String silinecek : silinecekÜlkeler) {
            for (String lhs : ülke) {
                if (silinecek.equalsIgnoreCase(lhs)) {
                    ülke.remove(lhs);
                }
            }
        }
        return ülke;
    }


}
