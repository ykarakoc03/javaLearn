package j16_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class task002 {
    public static void main(String[] args) {

/* TASK :
         Bir öğretmenden girmek istediği kadar notu alınız, ve
         ortalamayı geçen öğrenci sayısını bulan code create ediniz.

         */
        Scanner sc = new Scanner(System.in);
        System.out.println("kac ogrenci notu girmek istersiniz?");
        int ogrSayisi= sc.nextInt();

        System.out.println("girmek istediginiz notu giriniz");

        List<Integer> not= new ArrayList<>();
        for (int i = 0; i < ogrSayisi; i++) {
                not.add(sc.nextInt());
        }
        System.out.println(not);
        System.out.println("ortalama " +ortalamaAl(not, ogrSayisi));

        System.out.println("ortalama ustu ogrenci notlari :");
        for (int i:not
             ) {
            if (i>=ortalamaAl(not,ogrSayisi)){
                System.out.print(i+" ");
            }
        }

    }

    private static double ortalamaAl(List<Integer> not, int ogrSayisi) {
        return ((double)toplam(not)/(double) ogrSayisi);
    }

    private static int toplam(List<Integer> not) {
        int topla =0;
        for (int i:not) {
            topla+=i;
        }
        return topla;
    }


}
