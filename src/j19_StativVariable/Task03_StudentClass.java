package j19_StativVariable;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Task03_StudentClass {
    String StudentName;
    int maxCredit;
    List<Task03_LessonClass> dersListesi = new ArrayList<>();// LessonClass obj'lerinin tutuldugu liste

    public Task03_StudentClass(String studentName) {//ögrenci ismi alan const.
        Scanner sc = new Scanner(System.in);
        StudentName = studentName;

        while (maxCredit<=30) {
            System.out.println("ders adı giriniz ");
            Task03_LessonClass ders = new Task03_LessonClass(sc.next());//nesne oluşturup const.ders ismini gönderdi
            System.out.println(ders.dersİsmi + " dersinin kredisini giriniz ");
            ders.credit= sc.nextInt();

            if (maxCredit+ders.credit <= 30) {//max credi control
                maxCredit += ders.credit;
                dersListesi.add(ders);
                continue;
            } else {
                System.out.println("Maksimum 30 kredi mikarını aşığınız için " + ders.dersİsmi + " dersini alamadınız");
                break;
            }
        }
        System.out.println("Adınız :"+studentName+"\nAldığınız dersler :");
        for (Task03_LessonClass lesson:dersListesi) {
            System.out.println(lesson.dersİsmi+" : "+lesson.credit);
        }
        System.out.println("Toplam kredi :"+toplamKredisi());
    }

    public int toplamKredisi() {//Task'a baglı kalmak için yazıp son printte kullandım

        return maxCredit;
    }
}
