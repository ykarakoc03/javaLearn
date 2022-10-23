package j19_StativVariable;

import java.util.Scanner;

/*
    Task 01 >
    fields: width, length ve cevre ve alan hesaplayaan methodolan Rectangle isminde Class create ediniz.
    Runeer class'da obj ile cevre ve alan değerelrini print eden code create ediniz.
   */
public class Task01_Rectangle {
    double width;
    double length;

    public  Task01_Rectangle() {

        Scanner sc = new Scanner(System.in);
        System.out.println("uzunlık ve genişlik değerlerini giriniz :");
        length = sc.nextDouble();
        width = sc.nextDouble();
        System.out.println(toString());
    }

    public Task01_Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
        System.out.println(toString());
    }

    public double cevre() {
        return 2 * (length + width);
    }

    public double alan() {
        return length * width;
    }

    @Override
    public String toString() {
        return "Rectangle :" +
                "width=" + width +
                ", length=" + length;
    }
}
