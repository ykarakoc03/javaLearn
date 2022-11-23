package j36_Map;

import java.util.HashMap;
import java.util.Map;

public class Task02 {

    /*
    Task ->
     Key:isim ,email,adres,telefon
     Key2lere ait valueeleri depolayan bir kartvizit  map ve isim Key'e kartvizit map'i value tanımlayan farklı bir map tanımlayıp
     print eden code create ediniz
     */
    public static void main(String[] args) {

        HashMap<String, String> yakup = new HashMap<>();
        yakup.put("isim", "Yakup KARAKOÇ");
        yakup.put("email", "y.karakoc03@gmail.com");
        yakup.put("adres", "Afyon");
        yakup.put("telefon", "0555666223");
        System.out.println("yakup = " + yakup);

        HashMap<String, String> huseyin = new HashMap<>();
        huseyin.put("isim", "Hüseyin");
        huseyin.put("email", "huseyinn.sarp@gmail.com");
        huseyin.put("adres", "Kocaeli");
        huseyin.put("telefon", "05556652545");

        HashMap<String, HashMap<String, String>> kartvizit = new HashMap<>();
        kartvizit.put("YakupMap", yakup);
        kartvizit.put("HüseyinMap", huseyin);
        System.out.println(kartvizit.get("YakupMap").get("isim"));
        System.out.println(kartvizit.get("HüseyinMap").get("isim"));
        System.out.println(kartvizit.get("HüseyinMap").get("email"));
        System.out.println(kartvizit.get("HüseyinMap").get("adres"));
        System.out.println(kartvizit.get("HüseyinMap").get("telefon"));
        System.out.println("kartvizit.get(\"YakupMap\") = " + kartvizit.get("YakupMap"));

        Map<Integer,Task02_Kartvizit> krt=new HashMap<>();
        Task02_Kartvizit k1=new Task02_Kartvizit("Enise","enise@tester.com","google company","1905");
        krt.put(k1.id, k1);
        System.out.println("krt = " + krt);
        System.out.println("krt.get(k1.id) = " + krt.get(k1.id));//k1.id key values:isim='Enise', email='enise@tester.com', adres='google company', telefon='1905'
        System.out.println("krt.get(k1.id) = " + krt.get(101));//101 key values:isim='Enise', email='enise@tester.com', adres='google company', telefon='1905'








    }
}


//semihMap.get(isim) = Semih Nerde
//        semihMap.get(telefon) = 0 532 230000
//        ismailKartvizit.get(isim) = İsmail Demir
//        ismailKartvizit.get(telefon) = 0 546 450000
//        semih in telefonu = 0 532 230000
//        ismail in bilgileri = {telefon=0 546 450000, adres=Amsterdam/Hollanda, email=ismail@gmail.com, isim=İsmail Demir}
//        kartvizitler = {ismail={telefon=0 546 450000, adres=Amsterdam/Hollanda, email=ismail@gmail.com, isim=İsmail Demir}, semih={telefon=0 532 230000, adres=Frkanfurt/Almanya, email=Semih@hotmail.com, isim=Semih Nerde}}
