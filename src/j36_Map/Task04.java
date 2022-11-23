package j36_Map;

import java.util.*;

public class Task04 {

    ///			KELİME ANALİZİ

    /*
     * Girilen bir metinde kelimelerin kaç kere geçtiğini bulan program yazınız.
     *
     * 1. Adım : ( Kelime = Kaç Kere Geçiyor ) Şeklinde veri tutmak için HashMap oluşturun.
     * 2. Adım : Girilen metni split methodu ile parçalayalım.
     * 			 ilk önce "." ya göre parçalayıp cümleleri elde edelim
     * 			 daha sonra " " boşluğa göre parçalayıp kelimeleri elde edelim
     * 3. Adım : Tüm kelimeleri kontrol etmek için for döngüsü kullanalım ve tüm kelimeleri oluşturduğumuz hashMap'e aktaralım.
     * 			 Eğer hashmap'te yoksa ekleyelim ve sayısına 1 yazalım.
     * 		 	 Eğer hashmap'te zaten varsa, sayısını bir artıralım.
     * 3. Adım : Tüm kelimeler kontrol edildikten çıktı verelim. Ve tüm kelimeleri tekrar sayısıyla birlikte gösterelim.
     *
     * İpucu : "." özel karakter olduğu için "\\." şeklinde split ediniz.
     * */


    public static void main(String[] args) {

        HashMap<String, Integer> say = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("bir metin giriniz: ");
        String text = scanner.nextLine();
        String[] cümle = text.split("\\.");
        System.out.println(Arrays.toString(cümle));
        for (String str : cümle) {
            ArrayList<String> kelime = new ArrayList<>(Arrays.asList(str.trim().split(" ")));
            for (String klm : kelime) {
                if (say.containsKey(klm)) say.put(klm, say.get(klm) + 1);
                else say.put(klm, 1);
            }
        }
        System.out.println(say);


    }


}
