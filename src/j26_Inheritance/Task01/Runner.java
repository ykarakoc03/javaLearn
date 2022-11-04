package j26_Inheritance.Task01;

public class Runner {
    public static void main(String[] args) {

        A a = new A();
        System.out.println("a.str = " + A.str);
        B b= new B();
        // artik b objesi olusunca static str variablesi yeni deger atandi
        // ve butun objeler icin gecerli(static)
        System.out.println("b.str = " + B.str);
        System.out.println("a.str = " + A.str);

    }
}
