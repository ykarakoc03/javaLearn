package j37_Enum.enum03;

import java.util.ArrayList;

public class Runner {
      /*  TASK :
1- Bir Kitap calss'i create ediniz, fields : name ve kategori(Enum)
2- KitapKategori adında bir enum oluşturunuz: Klasik, Roman, Fantezi, Tarih, Ekonomi
3- 2 kitap tanımlayınız bir ArrayList e atınız.
4- bir kategoriye gore listeletiniz.

 */
      public static void main(String[] args) {
          Kitap ktp1=new Kitap();
          ktp1.name="leyla mecnunun nesi olyor?";
          //ktp1.kategori="Roman";
            ktp1.kategori=KitapKategori.ROMAN;
          
          Kitap ktp2=new Kitap();
          ktp2.name="Agama benden küşleme";
          //ktp2.kategori="roman";
          ktp2.kategori=KitapKategori.ROMAN;
         
          Kitap ktp3=new Kitap();
          ktp3.name="haluk ebik gabık";
          //ktp3.kategori="Rooman";
          ktp3.kategori=KitapKategori.ROMAN;

            ArrayList<Kitap> kütüphane=new ArrayList<>();
            kütüphane.add(ktp1);
            kütüphane.add(ktp2);
            kütüphane.add(ktp3);

            for (Kitap k:kütüphane) {
                  if (k.kategori==KitapKategori.ROMAN)
                        System.out.println(k.name);
            }
          
          
      }
}
