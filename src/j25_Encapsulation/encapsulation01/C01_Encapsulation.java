package j25_Encapsulation.encapsulation01;

/*
   1) Encapsulation kisaca "data hiding" demektir

   2) Basarili bir Encapsulation için :
      a)Nasil kullanilacagi ve hedefi net iolmalidir.(Direksiyon gibi)
      b)Kodun karmasikligi kullanimin karmasikligina sebep olmamalidir.Yani cok
       karmasik kodlardan olusan bir yapi basit bir sekilde kullanilabilmelidir.
      c)Bir bolumun hata vermesi diger bolumlerin hatasına sebep olmamalidir.

   3) Encapsulation yapısı  tanımlanması için
      a)Access modifier'lari private tanımlanmalı
      b) istenilen field'lar için  getter ve setter methodlari ile "encapsulated" datalar okunmalı (getter) ve
       update edilebilmeli(setter)    .
       c) uygun constructor tanımlanmalı.
       d) toString() method tanımlanmalı


   4) Encapsulation'in faydalari
      a) Esneklik(Flexibility). Field'lar setter() methodunu ile istenildiği kadar update edilebilir
      b) Reusability-> Field'lar  getter ve setter method'lari bir kere tanımlanıp proje icindeki
        tum classlar'dan istenildiği kadar kullanabiliri.
      c) Istenilen field  okunabilir(getter() olustur), istenilen field okunamaz(getter() olusturma)
       hale getirebilir.
      d) Istenilen field degistirebilir (setter() olustur), Istenilen field degistirilemez
       (setter() olusturma) yapabilir.

      Trick-> Tum variable'lar private ve sadece getter() method tanımlanan  class'da
        data'lar sadece okunabilir, degistirilemez. Bu tarz class'lara "immutable class" denir.

   5) Kullanicinin kullandigi sistem arkasindaki karmasik yapiyi kullaniciya gosterilmez.

 */
public class C01_Encapsulation {

    public static void main(String[] args) {
        C02_Encapsulation obj1 = new C02_Encapsulation("dilek hanim", 11);
        C02_Encapsulation obj2 = new C02_Encapsulation();
        System.out.println("obj1.idVer() = " + obj1.getId());//11
        System.out.println("obj1.isimVer() = " + obj1.getName());//dilek hanim
        obj1.setName("dilek team lead");// obj name update edildi
        System.out.println("obj1.isimVer() = " + obj1.getName());//dilek team lead

        System.out.println("obj2.idVer() = " + obj2.getId());//1001
        System.out.println("obj2.isimVer() = " + obj2.getName());//Gamze Hanim
        obj2.setName("gamze scrum master");
        System.out.println("obj2.isimVer() = " + obj2.getName());//gamze scrum master
    }


}
