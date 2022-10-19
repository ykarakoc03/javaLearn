package j16_ArrayList.Task;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task08 {
    static List<String> data=new ArrayList<>();
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        // Task-> Girilen sayıların içinde ortalamadan buyuk olanları print eden METHOD create ediniz.

        veriAl();
        yazdır(data);
        yazdır(ortalamaAl());
        yazdır(ortalamaUstU());


        }


    public  static void veriAl() {

        System.out.println("Sayı Listesini giriniz çıkmak için q ya basınız");
        int count = 0;
        while (!(data.contains("q") || data.contains("Q"))) {
            System.out.println((count + 1) + ". sayıyı giriniz");
            data.add(sc.next());
            count++;
        }
        data.remove(data.size()-1);

    }

    public  static double ortalamaAl() {
        double topla=0;
        for (String s:data) {
            topla+=Integer.parseInt(s);
        }
        return topla/data.size();
    }
    private static String ortalamaUstU() {
        double ort=ortalamaAl();
        for (String s:data) {
            if (Integer.parseInt(s)>ort) return s;
        }
        return "";
    }
    public static void yazdır(Object a) {
        System.out.println(a);
    }


}
