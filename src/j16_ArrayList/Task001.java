package j16_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task001 {
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
        List<String> gunler = new ArrayList<>(List.of("Pazartesi", "Sali", "Carsamba", "Persembe", "Cuma", "Cumartesi", "Pazar"));
        List<Double> gunlukKazanc = new ArrayList<>();
        System.out.println("gunluk kazacinizi giriniz :");
        Scanner sc = new Scanner(System.in);

        int sayac = 0;
        while (sayac < 7) {
            System.out.println(gunler.get(sayac) + " gunku kazanc :");
            gunlukKazanc.add(sc.nextDouble());
            sayac++;
        }
        System.out.println("kazanc listesi :" + gunlukKazanc);
        System.out.println("haftalik ortalama kazanciniz :" + getOrtalamaKazanc(gunlukKazanc));
        System.out.println("Ortalamanin Ustunde Kazanc Günleri :" + getOrtalamaninUstundeKazancGünleri(gunlukKazanc, gunler));
        System.out.println("Ortalamanin Altinda Kazanc Günleri :" + getOrtalamaninAltindaKazancGünleri(gunlukKazanc, gunler));

    }

    private static String getOrtalamaninUstundeKazancGünleri(List<Double> gunlukKazanc, List<String> gunler) {
        String gun = "";
        for (int i = 0; i < 7; i++) {
            if (gunlukKazanc.get(i) > getOrtalamaKazanc(gunlukKazanc)) {
                gun += gunler.get(i) + " ";
            }
        }
        return gun;
    }

    private static String getOrtalamaninAltindaKazancGünleri(List<Double> gunlukKazanc, List<String> gunler) {
        String gun = "";
        for (int i = 0; i < 7; i++) {
            if (gunlukKazanc.get(i) < getOrtalamaKazanc(gunlukKazanc)) {
                gun += gunler.get(i) + " ";
            }
        }
        return gun;
    }
    private static double getOrtalamaKazanc(List<Double> gunlukKazanc) {
        double toplam = 0;
        for (double i : gunlukKazanc) {
            toplam += i;
        }
        return toplam / 7;
    }
}
