package j19_StativVariable;

/*
   1.static blok yapıları static variable'ları değer ataması update için kullanılır
   2. static block Clss oluşturulduğunda bütün methodlardan (main methodu dahi)önce calışır
   3. birden fazla static black varsa yukardan aşağıya sıralama ile çalışır

   */
public class C02_StaticBlok {
    static String isim="Haluk";

    static {
        System.out.println("1.static block çalıştı");
        isim = "Dilek hanım";
        System.out.println("isim = " + isim);

    }


    public static void main(String[] args) {
        System.out.println("Main method başladı...");
        isim = "Kerim Bey";
        System.out.println("isim = " + isim);
        System.out.println("main method bitti...");

    }


    static {
        System.out.println("2.static block çalıştı");
        isim="Ugur JavaCan";
        System.out.println("isim = " + isim);


    }


}
