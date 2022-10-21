package j18_Constructor;

public class C05_Arac {
    // Fields obj üreilirken alacagı degerler
    int maxHız;
    String model;

    public C05_Arac() {// parametresiz contr
    }
    /*   1) Constructor icinden baska bir Constructor cagirmak icin "this()" kullanirsaniz mutlaka ilk satira yazmalisiniz.
Aksi takdirde Compile Time Error alirsiniz.
        2) Bir Constructor icinden sadece bir tane Constructor cagirisi yapabilirsiniz.Cunku iki tane cagri yaprsaz
birisi ilk satirda olamayacaktir, bu da ilk kuralla celisir.
        */

    public C05_Arac(int maxHız) {//1 parametreli
       this(180,"hacımurat");//iki parametreli contr.call edildi.  ilk satıra yazılmalı yoksa CTE verir
        this.maxHız = maxHız;// his keywort parametre değeri inst. variable atama yapar
       //maxHız=maxHız;//this olmadıgı için parametre degeri indt variableye atanmaz
    }

    public C05_Arac(int maxHız, String model) {// iki paramereli
        this.maxHız = maxHız;
        this.model = model;
        System.out.println("bu yazıyıokuduysan 2 parametreli cont. oluştu");

    }
    public C05_Arac(String model,int maxHız) {// iki paramereli sırası deşik
        this.maxHız = maxHız;
        this.model = model;
        System.out.println("2 parametreli cont. oluştu");

    }




}
