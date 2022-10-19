package j18_Constructor;

public class C04_TeacherRunner {
    public static void main(String[] args) {

        C04_Teacher ogrt1=new C04_Teacher();
        ogrt1.ad="Muharrem";
        ogrt1.soyadı="Güzel";
        ogrt1.brans="Qa";
        ogrt1.emekli=false;
        ogrt1.maaş=23000;
        ogrt1.tecrübe=11;
        ogrt1.dersSaati();
        System.out.println(ogrt1);//C04_Teacher{ad='Muharrem', soyadı='Güzel', brans='Qa', tecrübe=11, maaş=23000.0, id=0, emekli=false}

        C04_Teacher ogrt2=new C04_Teacher("Ugur","Javacan","dev",15,100000,333,false);
        System.out.println(ogrt2);
    }
}
