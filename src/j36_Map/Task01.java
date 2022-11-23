package j36_Map;

import java.util.HashMap;
import java.util.Map;

public class Task01 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Amazon", 296);
        map.put("Ebay", 301);
        map.put("Saturn", 326);
        map.put("MediaMarkt", 340);
        map.put("Apple Store", 320);
// task -> urun fiyatları toplamını hesaplayan code create ediniz..

        int toplam = 0;
        for (Map.Entry<String, Integer> a : map.entrySet()) {
            toplam += a.getValue();
        }
        System.out.println("Toplam fiyat :" + toplam);


        //2. yöntem

        int toplam2 = 0;
        for (Integer w : map.values()) {
            toplam2 += w;
        }
        System.out.println("Toplam2 fiyat :" + toplam2);






    }


}
