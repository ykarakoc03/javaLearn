package j18_Constructor;

public class C01_Constructur {
/*
1- consturctor ismi Calss bame ile aynı olmalı.Buyuk harf ile başlamalı
2- constructor creta eedildigğinde name den sonra () {} mutlaka kullanılmalı
3- eger p'li cons. create edildiğinde java default cons ezer(siler)
4- cons. return type olmaz method'dan ayıran özelliğidir.
5-Class oluştugunsa java default cons. kendi create eder.
 */

    String str;// inst. variable
    String selam = "güzel insan";
    //C01_Constructur obj1 = new C01_Constructur();

    public static void main(String[] args) {

        C01_Constructur obj1 = new C01_Constructur();
        C01_Constructur obj2 = new C01_Constructur();
        C01_Constructur obj3 = new C01_Constructur();
        C01_Constructur obj4 = new C01_Constructur();

        obj1.str = "javacan";// str ins variable obj1 ile call edililerek deger atandı
        obj2.str = "javatar";// str ins variable obj2 ile call edililerek deger atandı
        System.out.println(obj3.selam);//güzel insan

        System.out.println("obj1.str = " + obj1.str);//obj1.str = javacan
        System.out.println("obj2.str = " + obj2.str);//obj2.str = javatar
        System.out.println("obj4.str = " + obj4.str);//obj4.str =null

        obj3.aga();//agama selam


    }

    public void aga() {
        System.out.println("agama selam");
    }


}
