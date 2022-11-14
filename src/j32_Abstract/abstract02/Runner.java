package j32_Abstract.abstract02;

public class Runner {
    public static void main(String[] args) {
        Isci mrb1=new Isci();
        mrb1.maasBilgisi();
        mrb1.maasHesapla();
        mrb1.name="EbuBekir Bey";
        System.out.println("mrb1.name = " + mrb1.name);
mrb1.sigortta();//abs. parent class tan conc. method call edildi

        IdariPersonel cncCdr = new IdariPersonel();

        cncCdr.name="Dilek Hanim";
        System.out.println("cncCdr.name = " + cncCdr.name);//cncCdr.name = Dilek Hanim
        cncCdr.sigortta();//Temiz code personel full sigorta kapsaminda
        cncCdr.maasHesapla();
        cncCdr.maasBilgisi();


    }
}
