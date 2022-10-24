package j20_PassByValue;

public class C01_PassByValue {
    public static void main(String[] args) {
        /* Java Pass By Value bir programlama dilidir.
        Bir primitiv variable argument olarak bir methoda call edildiğinde variable
        değil bir copy clone(vesikalık) (pointer) degeri gönderir
         */
        // task-> verilen bir fiyat için %24 artırılmış fiyatı print eden method creat ediniz

        double fiyat = 100;//primitiv double Type variale
        System.out.println("cal öncesi fiyat degeri :" + fiyat);//100
        fiyatArttır(fiyat);//fiyat methoda call edildi
        System.out.println("cal öncesi fiyat degeri :" + fiyat);//100

    }

    public static void fiyatArttır(double bisey) {
        bisey *= 1.24;
        System.out.println("arttırılmış fiyat :" + bisey);
    }

}
