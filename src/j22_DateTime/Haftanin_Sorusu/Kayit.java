package j22_DateTime.Haftanin_Sorusu;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Kayit {
    ArrayList<Kullanici> kullaniciKisiler = new ArrayList<>();

    public ArrayList<Kullanici> kayitAl() {
        Scanner sc = new Scanner(System.in);
        System.out.println("adinizi giriniz");
        String ad = sc.nextLine();
        Kullanici k1 = new Kullanici(ad, LocalDateTime.now());// k1 kullanici adi ve zamani eklendi
        kullaniciKisiler.add(k1);//k1 obj listeye eklendi

        return kullaniciKisiler;
    }
}
