package j33_Interface;

public class Sahin extends Tofas implements disDonanim, IcDonanim, Lastik {//conc child class extens-> Tofas, implements->disDonanim, IcDonanim, Lastik
    @Override
    public void koltuk() {
        System.out.println("agam deri koltuk yazin sorun, ici saman olmasin yeter");
    }

    @Override
    public void klima() {
        System.out.println("agam ac cami serinle klima senin neyine :)");
    }

    @Override
    public void ebat() {
        System.out.println("agam 16 inc lastik ebat");
    }

    @Override
    public void jant() {
        System.out.println("agam senin icin celik 5 kollu jant yakisir");
    }

    @Override
    public void motor() {
        System.out.println("agam 1.6 aile motor");
    }

    @Override
    public void yakit() {
        System.out.println("agam TUPitak yoksa ocagina incir agaci");
    }

    @Override
    public void kapi() {
        System.out.println("agam 4 kapi sedan");
    }

    @Override
    public void kaporta() {
        System.out.println("agam akordion kaporta gamzesiz olmaz");
    }
}
