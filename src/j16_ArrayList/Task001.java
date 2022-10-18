package j16_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task001 {
    static List<String> gunler = new ArrayList<>(List.of("Pazartesi", "Sali", "Carsamba", "Persembe", "Cuma", "Cumartesi", "Pazar"));
    static List<Double> gunlukKazanc = new ArrayList<>();
    public static void main(String[] args) {
        /* TASK :
         * Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program yazınız.
         * Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir method yazınız.
         * Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını gösteren bir method yazınız.
         * Ayrıca bakkalın hangi günler ortalamanın altında kazandığını gösteren bir method yazınız.
         *
         * 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
         * 2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
         * 3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.
         * 4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
         * 5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun.
         * 			 for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
         * 			 ortalama kazançtan yüksekse o günleri return yap.
         * 6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun.
         * 			 for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
         * 			 ortalama kazançtan aşağıysa o günleri return yap.
         * */

        System.out.println("gunluk kazacinizi giriniz :");
        Scanner sc = new Scanner(System.in);

        int sayac = 0;
        while (sayac < 7) {
            System.out.println(gunler.get(sayac) + " gunku kazanc :");
            gunlukKazanc.add(sc.nextDouble());
            sayac++;
        }
        System.out.println("kazanc listesi :" + gunlukKazanc);
        System.out.println("haftalik ortalama kazanciniz :" + getOrtalamaKazanc());
        System.out.println("Ortalamanin Ustunde Kazanc Günleri :" + getOrtalamaninUstundeKazancGünleri());
        System.out.println("Ortalamanin Altinda Kazanc Günleri :" + getOrtalamaninAltindaKazancGünleri());

    }
    private static double getOrtalamaKazanc() {
        double toplam = 0;
        for (double i : gunlukKazanc) {
            toplam += i;
        }
        return toplam / 7;
    }
    private static String getOrtalamaninUstundeKazancGünleri() {
        String gun = "";
        for (int i = 0; i < 7; i++) {
            if (gunlukKazanc.get(i) > getOrtalamaKazanc()) {
                gun += gunler.get(i) + " ";
            }
        }
        return gun;
    }

    private static String getOrtalamaninAltindaKazancGünleri() {
        String gun = "";
        for (int i = 0; i < 7; i++) {
            if (gunlukKazanc.get(i) < getOrtalamaKazanc()) {
                gun += gunler.get(i) + " ";
            }
        }
        return gun;
    }

}
