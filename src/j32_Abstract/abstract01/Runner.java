package j32_Abstract.abstract01;

public class Runner {
    public static void main(String[] args) {

        Civic cvc = new Civic();
        cvc.sunrooff();
        System.out.println(cvc.vites());
        cvc.lastikEbat();
        cvc.kapi();
        cvc.motor();
        cvc.koltuk();

        Honda obj=new Civic();//honda abs oldugu icin obje tanimlanamaz.
        // ancak bu sekilde polimorfizm chile clasin referansini tutabilir



    }
}
