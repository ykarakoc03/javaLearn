package j32_Abstract.Ornek2;

public class Runner {
    public static void main(String[] args) {
        Dikdortgen dd = new Dikdortgen(24, 7);
        dd.setName("dikdortgen");
        //dd.cevre();
        //dd.alan();
        System.out.println("dd.ciz() = " + dd.ciz());
        System.out.println(dd);

        Cember c1 = new Cember(39);
        c1.setName("cemberimde gul oya");
        System.out.println(c1);
    }
}
