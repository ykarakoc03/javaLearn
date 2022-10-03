package j11_MethodCreation.tasks;

import java.util.Scanner;

public class Task09 {

    public static void main(String[] args) {

    /*
    Saati saniyeye çeviren  method create ediniz

    Test Data:
    howManySeconds(2);
    Beklenen çıktı:
     7200
    */
        Scanner sc = new Scanner(System.in);
        System.out.println("saat giriniz");
        int saat = sc.nextInt();
        System.out.println("Girdiginiz saat " + saniyeCevir(saat) + " saniyedir");


    }

    private static int saniyeCevir(int saat) {
        return saat*3600;
    }


}
