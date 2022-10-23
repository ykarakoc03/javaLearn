package j19_StativVariable;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*    Task 02 ->
        ElektirikHesap Class:  fields : toplamTuketim(int), oran(double), fatura(double)
        Müşteriye ait tüketilen enerjiyi toplamTuketim'e toplayan tüketimEkle method
        oran(0.7)  katsaysı ile  toplamTuketim çarparak fatura değeri atayan odenecekTutar method

        Müsteri Class: fields: name ElektrikHesabi class obj.
        Runner Class obj ile enz 2  aylık elektrik tüketim faturası print eden code create ediniz
*/
public class Task02_ElektirikHesap {

    int toplamTuketim;
    double fatura;

    static double oran = 0.7;
    List<String> liste = new ArrayList<>();

    public Task02_ElektirikHesap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("aylık elektiri tüketim miktarını giriniz, sonlandırmak için q basınız.");

        while (!liste.contains("q")) {
            liste.add(sc.next());
        }
        liste.remove(liste.size() - 1);

        fatura = tüketimEkle() * oran;
        System.out.println(liste.size() + "aylık toplam elektirik faturanız :" + fatura);
    }

    public double tüketimEkle() {
        for (String str : liste) {
            toplamTuketim += Double.parseDouble(str);
        }
        return toplamTuketim;
    }


}



