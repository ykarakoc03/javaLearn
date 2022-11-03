package j26_Inheritance.Inheritance02;

public class Kedi extends Mammal {

    public Kedi() {//para.siz const.
        super();
        System.out.println("Kedinin parametresiz const.");
    }

    public Kedi(String str) {//parametrel'i const.
        this();
        System.out.println(super.c);
        System.out.println("Kedinin PARAMETRELI const.");
    }

    int c = 2;
    int d = 5;

    @Override
    public void mC() {// Mammale parentted ezen method
        System.out.println("mC   -> KEDI class tan method call ettim");
    }
}
