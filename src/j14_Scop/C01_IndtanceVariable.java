package j14_Scop;

public class C01_IndtanceVariable {


    /*                                  INSTANCE VARIABLE

       1) Main method'un ve urettiginiz diger methodlarin disinda  disinda(ustunde veya altinda), class'in icinde
          olusturulan variable'lara "instance variable" denir.
       2) Instance variable'lar object olusturulurken olusturulur ve her obje'ye bu variable'lar monte edilir.
       3) Instance variable'lara deger atamasi yapsaniz da olur, yapmasaniz da olur.
          Asagida goruldugu gibi "yas" variable'ina deger atamasi yaptim "tecrube" variable'ina yapmadim.
          Note : Bir variable'a deger atamasi yapma "Initialize" olarak adlandirilir.
             "i" variable'i initialize edildi, digerleri initialize edilmedi.
       4) Initialize edilmeyen "instance variable" lar icin Java kendisi deger atamasi yapar.
          Java'nin instance variable'lara kendisinin verdigi degerlere "default value" denir.
                byte, short, int, long icin default value 0'dir.
                float, double icin default value 0.0'dir.
                char icin default value 0'dir.
                boolean icin default value false'dur.
                String icin default value "null" dir.

    */
    static String kurs = "Clarusway";//static
    int yas = 48; //initialized ilk atamsı yapılmış ins. variable
    int tecrube;// default deger 0
    String name;// default deger null
    boolean developerMı;// deafult deger false
    double boy;// default deger 0.0
    char unvan;// default deger bosluk

    public static void main(String[] args) {
        int a = 7;//local variabledir
        System.out.println(a);//7
        //System.out.println(yas);  // ins deger ataması yapılmadan kullanılmaz
        //System.out.println(yas);//non-static oldugundan dogrudan cağrılamaz
        System.out.println(kurs);// static variable doğrudan static methoda çağrılır.
        StatikMethod();//static method call edildi
        //non_staticMethod();//static olmayan method call edilemez

        // obj creation -> ClassName objName= new Classname

        C01_IndtanceVariable ebikGabıkObj = new C01_IndtanceVariable();
        ebikGabıkObj.boy = 1.9;//inst variable objile call edilip atama yapıltı
        ebikGabıkObj.developerMı = true;
        ebikGabıkObj.name = "küpra hanım";
        System.out.println(ebikGabıkObj.name);//küpta hanım
        System.out.println("ebikGabıkObj.tecrube = " + ebikGabıkObj.tecrube);// default deger 0
        ebikGabıkObj.yas = 33;
        System.out.println("ebikGabıkObj.yas = " + ebikGabıkObj.yas);//3
        C01_IndtanceVariable obj1 = new C01_IndtanceVariable();
        obj1.boy = 1.75;
        obj1.name = "Fatih bey";
        System.out.println("obj1.boy = " + obj1.boy);//1.75
        System.out.println("obj1.name = " + obj1.name);//Fatih bey


    }

    //a=23;// local dışı call edilemez
    public void non_staticMethod() {
        System.out.println("statik olmayan methoddan selamlae");
    }

    public static void StatikMethod() {
        System.out.println("statik methoddan selamlar");
    }

}
