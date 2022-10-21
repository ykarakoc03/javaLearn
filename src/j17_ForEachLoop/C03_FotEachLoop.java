package j17_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C03_FotEachLoop {
    public static void main(String[] args) {


// task iki string array elemanlarının ortak olmasıı kontrol eden code creat ediniz
        String arr1[] = {"nazım", "gülsüm", "dilek", "erol", "cüneyt", "ciğdem"};
        String arr2[] = {"musty", "gülsüm", "ayşe", "enise", "cüneyt", "ciğdem"};
        List<String> ortakİsim = new ArrayList<>();//ortak isimlerin olacagı list
        for (String a1 : arr1) {
            for (String a2 : arr2) {
                if (a1.equalsIgnoreCase(a2)) {//her bir eleman eşitligi
                    ortakİsim.add(a1);

                }
            }
        }
        if (ortakİsim.isEmpty()) {
            System.out.println("ortak isim yok" + ortakİsim);
        } else System.out.println(ortakİsim);

    }
}
