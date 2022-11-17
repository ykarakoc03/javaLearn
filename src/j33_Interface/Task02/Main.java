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
        System.out.println("     ******    ");
        System.out.println(teslaCar.getClass().getSimpleName());// class ismini obje ile getiriyor
        System.out.println("     ******    ");

        for (Vehicle str:arac) {

            System.out.println(str);
            System.out.println("   *******      ");

        }

    }
}
