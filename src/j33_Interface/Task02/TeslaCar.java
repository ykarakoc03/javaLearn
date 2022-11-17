package j33_Interface.Task02;

public class TeslaCar extends Vehicle implements Electric{
    public TeslaCar() {
        model="X Long Range";
        engine="Dual Motor 670 HP";
    }

    @Override
    public String changeBattery() {
        return "Tesla Car batarya degisim";
    }

    @Override
    public String drive() {
        return "Tesla car surucusuz arac";
    }

    @Override
    public String toString() {
        return "TeslaCar" +
                "\nmodel= " + model +
                "\nengine= " + engine +
                "\n"+drive()+
                "\n"+changeBattery();
    }
}
