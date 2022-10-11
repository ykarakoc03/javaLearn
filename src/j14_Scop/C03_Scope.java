package j14_Scop;

public class C03_Scope {



    public static void main(String[] args) {


    C01_IndtanceVariable kus=new C01_IndtanceVariable();
    kus.name="HÜMA";
    kus.developerMı=false;


        System.out.println("kus.name = " + kus.name);
        C01_IndtanceVariable.StatikMethod();//Classname ile static method call edildi
        kus.non_staticMethod();//obje ile non-staticMethod call


    }

}
