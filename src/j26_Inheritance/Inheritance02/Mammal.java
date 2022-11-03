package j26_Inheritance.Inheritance02;

public class Mammal extends Hayvancik {
    public Mammal() {// parametresiz const.
        this('Y');
        System.out.println("Mammal parametresiz const.");
    }

    public Mammal(char c) {//pr.li const.
        super(17);
        System.out.println("Mammal parametreliii const.");
    }

    public void mC() {
        System.out.println("mC   -> Mammal class tan method call ettim");

    }

    int m = 1;
    int c = 4;

    @Override
    public void mM() {
        System.out.println("mM   -> Mammal class tan method call ettim");
    }
}
