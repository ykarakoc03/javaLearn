package j11_MethodCreation;

public class C04_MethodCreation {
    public static void main(String[] args) {
        String name = "yakup";
        System.out.println("car car " + name);
        C04_MethodDepo.gecmeNotu(24);//depo class'tan class name ile method call ettik
        C04_MethodDepo.topla(3, 5);// 8
/*
farklı clastan method call etmek içindir
1. method static olmalı -> gökteki güneş gibi
2. ClassName.method() şeklinde call edilir.
aynı classta'daki method doğrudan methodName ile call edilir
 */
selamVer();// aynı classs'dan sadece methodName ile çağrılır

    }

    private static void selamVer() {

        System.out.println("agam selam ver");
    }

}
