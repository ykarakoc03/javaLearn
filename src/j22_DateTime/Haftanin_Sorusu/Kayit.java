package j22_DateTime.Haftanin_Sorusu;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;
public class Kayit {

    ArrayList<Kullanici> kullanıcıKisiler = new ArrayList<>();//kullanıcı class'dan olusturlacak obj tutulacagı bos list

    //Task 2. step
    public ArrayList<Kullanici> kayıtAl() {//kullanıcı Class'dan onj uretmek için cons.'a gereken name ve kayıtzamanı
        // bilgilerini olusturrp olusan obj'i list'e ekler
        Scanner sc = new Scanner(System.in);
        System.out.print("agam adını giresen : ");
        String ad = sc.nextLine();//Kullanıcı obj için name alındı
        Kullanici k1 = new Kullanici(ad, LocalDateTime.now());//k1 obj name kullanıcıdan kayıtZamanı LocalDateTime.now() alacak parametre olarak
        kullanıcıKisiler.add(k1);//olusturlan k1 obj liste eklendi

        return kullanıcıKisiler;//kullanıcıKisiler list'i method cıktısı return olarak tanımlandı
    }

    //Task 3. step
    public void sansliKullanici(ArrayList<Kullanici> kllObj) {//kulanıcı list'indeki obj'lerin kayıtZamanını 10 sn
        //az olup olmamasına göre sanslı kullanıcı print edecek
        for (Kullanici k : kllObj) {//Kullanıcı Class'dan kayıtAl() method ile uretilip kullanıcıKişi list'ine eklene
            //  objler döngüye alın
            if (k.kayıtZamanı.getSecond() <= 10) {//döngüye herbir kullanıc obj kayıtzamanı datasındaki saniye verisi
                // 10'dan kucuk olma sartı
                System.out.println(k.name + " agam sanslı kişisin 5 kilo BAL kazandın :) sisteme giriş zamanın :  " + k.kayıtZamanı);
            } else
                System.out.println(k.name + " agam sanslı kişisin degilsen :( BAL'ı NAH'sıl kazanacaksın Kovan yağmalandı   sisteme giriş zamanın :  " + k.kayıtZamanı);
        }

    }

    public void listele(ArrayList<Kullanici> kllObj) {
        System.out.println(kllObj);//obj 'leri Kuulanıcı Class'daki toString print eder
    }
}

