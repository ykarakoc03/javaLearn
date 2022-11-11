package j32_Abstract.abstract01;

public class Accord extends Honda {
    @Override
    public void motor() {//implement
        System.out.println("2 turbo motor");
    }

    @Override
    void koltuk() {//implement
        System.out.println("deri koltuklu");
    }

    @Override
    void kapi() {//implement
        System.out.println("vakumlu kapilar");
    }

    @Override
    void sunrooff() {
        System.out.println("Agam cugara yakinca sunroof amayi unutma");
    }
}
