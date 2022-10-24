package j20_PassByValue;

public class C02_PassByValue {
    public static void main(String[] args) {
        //  task -> verilen fiyat için %11 %22 ve %33  indirimlim  fiyatı print eden methodlar  create ediniz.
   double fiyat =100;

        System.out.println("method öncesi degeri :" + fiyat);//100

        System.out.println("indir1(fiyat) = " + indir1(fiyat));//89
        System.out.println("indir2(fiyat) = " + indir2(fiyat));//78
        System.out.println("indir3(fiyat) = " + indir3(fiyat));//67


    }

    private static double indir1(double fiyat) {
        return fiyat*=0.89;
    }

    private static double indir2(double fiyat) {
        return fiyat*=0.78;
    }

    private static double indir3(double fiyat) {

        return fiyat*=0.68;
    }
}