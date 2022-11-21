package j35_Collection.C02_Set;

import java.util.HashSet;
import java.util.TreeSet;

public class Task02 {
    public static void main(String[] args) {
        //hashSet ve treeSet tanımlayıp run surelerini karşılaştırınız...
        //Trick run süresi icinde System.currentTimeMillis() meth call ediniz.
        long tsBasla = System.currentTimeMillis();//Treeset baslama zamanı
        TreeSet<String> ts = new TreeSet<>();
        ts.add("Salim");
        ts.add("Koray");
        ts.add("Haluk");
        ts.add("Hasan");
        ts.add("Huseyin");
        ts.add("Yakup");
        ts.add("Ramazan");
        long tsBitir = System.currentTimeMillis();//Treeset bitiş zamanı
        System.out.println("TreeSet run süresi : " + (tsBitir - tsBasla));//Treeset run süresi zamanı

        System.out.println("     *************************         ");
        long hsBasla = System.currentTimeMillis();
        HashSet<String> hs = new HashSet<>();
        hs.add("ebik");
        hs.add("gabık");
        hs.add("falan");
        hs.add("filan");
        hs.add("milan");
        hs.add("bakan");
        hs.add("agam");
        hs.add("takan");
        long hsBitir = System.currentTimeMillis();
        System.out.println("HashSet run süresi : " + (hsBitir - hsBasla));
    }


}
