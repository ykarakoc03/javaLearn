package j33_Interface.Task02;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Vehicle> arac = new ArrayList<>();
        TeslaCar teslaCar = new TeslaCar();
        ToyotaPrius toyotaPrius = new ToyotaPrius();
        Bus bus = new Bus();

        arac.add(teslaCar);
        arac.add(toyotaPrius);
        arac.add(bus);

        for (Vehicle str:arac) {

            System.out.println(str);
            System.out.println("   *******      ");

        }

    }
}
