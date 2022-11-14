package j32_Abstract.abstract02;

public abstract class Personel {
    String name="Nur Hanim";

    public abstract void maasHesapla();//Abs. meth.
    public abstract void maasBilgisi();//Abs. meth.

    public void sigortta(){//Conc. meth.
        System.out.println("Ozel sigortasi kapsamindasin");
    }

}
