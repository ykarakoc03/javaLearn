package j22_DateTime.Haftanin_Sorusu;

import java.time.LocalDateTime;

public class Kullanici {
    String name;// objede deger alacak inst.
    LocalDateTime kayitZamani;// objede deger alacak

    public Kullanici(String name, LocalDateTime kayitZamani) {
        this.name = name;
        this.kayitZamani = kayitZamani;
    }
}
