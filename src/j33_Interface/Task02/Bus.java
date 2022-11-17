package j33_Interface.Task02;

public class Bus extends Vehicle implements Deisel{
    public Bus() {
        model="Man";
        engine="5.0 turbo";
    }

    @Override
    public String changeDeisel() {
        return "Man dizel yakit bitiyor";
    }

    @Override
    public String drive() {
        return null;
    }
    @Override
    public String toString() {
        return "Bus" +
                "\nmodel= " + model +
                "\nengine= " + engine +
                "\n"+drive()+
                "\n"+changeDeisel();
    }
}
