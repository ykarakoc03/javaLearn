package j26_Inheritance.Inheritance02;

import j26_Inheritance.Inheritance02.Kedi;


public class Runner {

    public static void main(String[] args) {
        /*
  Ayni isimli variable'lardan hangisinin kullanildi
olusturulan object'in data type'ina göre bilinir
Variable'i arastirmaya data type'i classindan baslanır.
*/

        Kedi k1 = new Kedi();
        System.out.println("k1.a = " + k1.a);//0 hayvancik class tan call edildi
        System.out.println("k1.c = " + k1.c);//2 kedi class call edildi
        System.out.println("k1.d = " + k1.d);//5 kedi class call ed'ld'
        System.out.println("k1.m = " + k1.m);//1 Mammal class call edildi

        k1.mA();//hayvancik class call
        k1.mC();//Kedi class call
        k1.mM();//Mammal class call
/*
 Method cagirilirken ayni isimli methodlardan
 hangisinin kullanilacagina Constructor karar verir.
 Methodlari arastirmaya Consctuctor ismini tasiyan
 class'dan baslayin ve parentlarda arastirmaya devam edin.
 */
        //Data Type (mammal) buna gore method veya variable cagrilir
        Mammal k2 = new Kedi("Kevser");// datatype Mammel class constr kedi class
        System.out.println("k2.c = " + k2.c);
        System.out.println("k2.a = " + k2.a);
        System.out.println("k2.m = " + k2.m);
        //k2.d cte verir data type Mammel olan class ta d yok cal edilemez
        k2.mA();//mA Hayvancik class meth call edildi
        k2.mC();//mC kedi class meth call edildi
        k2.mM();//mM Mammal class meth call edildi

        Hayvancik k3 = new Kedi();
        System.out.println("k3.m = " + k3.m);
        System.out.println("k3.a = " + k3.a);
        //k3.c-> datatype hayvancik Class oldugu icin Hayvacik Clasinda olmayan c variable call edilemez
        k3.mA();// mA Hayvancik class meth call edildi
        k3.mM();// Mammal class method call edildi
        Mammal m1 = new Mammal('$');
        System.out.println("m1.m = " + m1.m);
        System.out.println("m1.a = " + m1.a);
        System.out.println("m1.c = " + m1.c);
        //m1.d d kedi class tan oldugu icin call edilemez
        m1.mA();// hayvancik class call
        m1.mC();// mammal clas call
        m1.mM();// mammal class call


    }

}
