package j32_Abstract.Ornek2;

public abstract class Sekil {
    private String name;

    public Sekil(String name) {// parametreli const.
        setName(name);
    }

    public Sekil() {//pram.siz const
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double alan();

    public abstract double cevre();

    @Override
    public String toString() {
        return "ismi =" + this.name +
                "\n Alan = " + this.alan() +
                "\n Cevre = " + this.cevre()+
                "\n Sekil "+this.ciz();
    }

    //public void ciz() {
    //    System.out.println(this.name + "çizildi...");
    //}

    public String ciz() {
        return this.name + " çizildi...";
    }

}
