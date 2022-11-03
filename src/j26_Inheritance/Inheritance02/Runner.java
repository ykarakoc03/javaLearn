package j26_Inheritance.Inheritance02;

import j26_Inheritance.Inheritance02.Kedi;


public class Runner {

    public static void main(String[] args) {
        Kedi k1 = new Kedi();
        System.out.println("k1.a = " + k1.a);
        System.out.println("k1.c = " + k1.c);
        System.out.println("k1.d = " + k1.d);
        System.out.println("k1.m = " + k1.m);

        k1.mA();
        k1.mC();
        k1.mM();



        Mammal k2 = new Kedi("a");
        k2.mA();
        k2.mC();
        k2.mM();
        Mammal k3 = new Kedi();
        Hayvancik k4 = new Kedi();
        Mammal m1 = new Mammal();
    }

}
