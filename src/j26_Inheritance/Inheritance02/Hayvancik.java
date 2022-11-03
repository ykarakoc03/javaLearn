package j26_Inheritance.Inheritance02;

public class Hayvancik {
    public Hayvancik() {// parametresiz const

        System.out.println("hayvancik parametresiz const.");
    }

    public Hayvancik(int i) {// parametrel' const

        System.out.println("hayvancik parametreli  const.");
    }
    public  void mA(){

        System.out.println("mA   -> hayvancik class tan method call ettim");
    }
    public  void mM() {

        System.out.println("mM   -> hayvancik class tan method call ettim");
    }
    int a;
    int m = 3;
}
