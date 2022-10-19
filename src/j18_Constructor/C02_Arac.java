package j18_Constructor;

public class C02_Arac {
    String marka;
    String model;
    int km=10;
    double motorHacmi;
    boolean vitesauto=false;
    boolean ikincEl;
    int yıl;

    public static void main(String[] args) {

        C02_Arac arac1= new C02_Arac();//default cont. arac1 creat ettik
       arac1.ikincEl=true;
       arac1.marka="volvo";
       arac1.km=50000;
       arac1.model="xc60";
       arac1.motorHacmi=2.4;
        //                      volvo         xc60          50000       default=0       true                2.4
        System.out.println(arac1.marka+" "+arac1.model+" "+arac1.km+" "+arac1.yıl+" "+arac1.ikincEl+" "+arac1.motorHacmi);

// task-> ikici bir aracın tüm field larını atayarak print ediniz.

    C02_Arac arac2= new C02_Arac();
    arac2.ikincEl=true;
    arac2.marka="Honda";
    arac2.km=60000;
    arac2.model="civic";
    arac2.motorHacmi=1.6;
    arac2.yıl=2022;
    arac2.vitesauto=true;
        System.out.println(arac2.marka+" "+arac2.model+" "+arac2.km+" "+arac2.yıl+" "+arac2.ikincEl+" "+arac2.motorHacmi+" "+arac2.vitesauto);


    }
}
