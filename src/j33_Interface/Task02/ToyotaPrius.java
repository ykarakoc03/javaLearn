package j33_Interface.Task02;

public class ToyotaPrius extends Vehicle implements Electric, Gas{
    public ToyotaPrius() {
        model="Prius";
        engine="2.0 motor & 220 HP";
    }

    @Override
    public String changeBattery() {
        return "Prius batarya degisim zamani";
    }

    @Override
    public String changeOil() {
        return "Prius benzin bitiyor ";
    }

    @Override
    public String drive() {
        return "Prius Kullanici dostu arac";
    }

    @Override
    public String toString() {
        return "ToyotaPrius" +
                "\nmodel= " + model +
                "\nengine= " + engine +
                "\n"+drive()+
                "\n"+changeBattery()+
                "\n"+changeOil();
    }
}
