package j32_Abstract.abstract01;
// not :bu konu islenirken honda parenti lastik parenti ile degistirildi.
public class Civic extends Lastik {//Honda parent abs Class extend child cocrete class
    /*
    extends honda yazilarak Honda Class'a concrete bir class tanimlandi.
    java CTE verdi
    Cozum:
    a) Uniplemented (uyarlanmamis) method implement edilmeli
    b) parent Hond class'tan abstract keyword kaldirilmali
    c) concrete olan chile civiv class abstract tanimlanmali
     */

    //Concerete class'da abstract method tanimlanir mi?
    //public abstract void absNethod();// ya class abs olmali yada method concrete body olmali..
    // TRICK->
    @Override
    public void motor() {//implements edilen abs method
        System.out.println("1.6 eco motor az yakar cok kacar");
    }

    @Override
    void koltuk() {//implements edilen abs method
        System.out.println("Ucuz olsun diye kumas koltuk");
    }

    @Override
    void kapi() {//implements edilen abs method
        System.out.println("5 kapi sedan");
    }
    public int vites(){//concrete child method

        return 5;
    }


    @Override
    public void lastikEbat() {
        System.out.println("21 inc lastik");
    }





}
