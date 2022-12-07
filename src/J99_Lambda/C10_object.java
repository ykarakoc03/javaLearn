package J99_Lambda;

import java.util.*;
import java.util.stream.Collectors;

public class C10_object {
    public static void main(String[] args) {
/*
TASK :
fields --> Universite (String)
           bolum (String)
           ogrcSayisi (int)
           notOrt (int)
           olan POJO clas craete edip main method içinde 5 farklı obj'den List create ediniz.
 */

C10_Universite u01=new C10_Universite("Bogaziçi","Matematik",571,73);
C10_Universite u02=new C10_Universite("İstanbul","Matematik",622,77);
C10_Universite u03=new C10_Universite("Marmara","Hukuk",1453,52);
C10_Universite u04=new C10_Universite("İtu","Uçak Müh",333,63);
C10_Universite u05=new C10_Universite("Yıldız Teknik","Gemi",261,55);

        List<C10_Universite> unv=new ArrayList<>(Arrays.asList(u01,u02,u03,u04,u05));

        System.out.println("Task01 "+notOrt74denBüyük(unv));// false notların her biri 74 büyük oldugunu kontrol ediyor. 1 tanesi bile küçükse false verir
        System.out.println("  ** ** ** ** ** **");
        System.out.println("Task02 "+nogrtSayısı110danAz(unv));
        System.out.println("  ** ** ** ** ** **");
        System.out.println("Task03 "+enAzBirMAthVarMı(unv));
        System.out.println("  ** ** ** ** ** **");
        System.out.println("Task04 "+ogrnSysTersSırala(unv));
        System.out.println("  ** ** ** ** ** **");
        System.out.println("Task05 "+ogrnNotOrtilk3ü(unv));
        System.out.println("  ** ** ** ** ** **");
        System.out.println("Task06 "+ogrnSyısıEnAz2nciünv(unv));
        System.out.println("  ** ** ** ** ** **");
        System.out.println("Task07 "+notOrt63BüyükOgrnSysToplam(unv));
        System.out.println("  ** ** ** ** ** **");
        System.out.println("Task08 "+ogrnSayısı333denBüyükNotOrt(unv));
        System.out.println("  ** ** ** ** ** **");
        System.out.println("Task09 "+matematikBölümSay(unv));
        System.out.println("  ** ** ** ** ** **");
        System.out.println("Task10 "+ogrn571fazlaEnBüyükNotOrt(unv));


    }//main sonu


//task 01--> notOrt'larinin 74' den buyuk oldg kontrol eden pr create ediniz.

    public static boolean notOrt74denBüyük(List<C10_Universite> unv) {

        return unv.stream().allMatch(t -> t.getNotOrt() > 74);

    }
//task 02-->ogrc sayilarinin   110 den az olmadigini  kontrol eden pr create ediniz.

    public static boolean nogrtSayısı110danAz(List<C10_Universite> unv) {

        return unv.stream().allMatch(t -> t.getOgrcSayisi() >= 110);
    }

    //task 03-->universite'lerde herhangi birinde "matematik" olup olmadigini  kontrol eden pr create ediniz.

    public static boolean enAzBirMAthVarMı(List<C10_Universite> unv) {

        return unv.stream().anyMatch(t -> t.getBolum().toLowerCase().contains("Matematik"));
    }

//task 04-->universite'leri ogr sayilarina gore b->k siralayiniz.
public static List<C10_Universite> ogrnSysTersSırala(List<C10_Universite> unv) {

   return unv.
            stream().
            sorted(Comparator.comparing(C10_Universite::getOgrcSayisi).reversed()).
            collect(Collectors.toList());//akıştaki elemanlar Liste atandı
            //collect(Collectors.call)->Collector class'dan call edilen call. meth ile akış elemanlerı atanır
}
//task 05-->universite'leri notOrt gore  b->k siralayip ilk 3 'unu print ediniz.

    public static List<C10_Universite> ogrnNotOrtilk3ü(List<C10_Universite> unv) {

        return unv.
                stream().
                sorted(Comparator.comparing(C10_Universite::getNotOrt).reversed()).
                limit(3).
                collect(Collectors.toList());//akıştaki elemanlar Liste atandı
        //collect(Collectors.call)->Collector class'dan call edilen call. meth ile akış elemanlerı atanır
    }
//task 06--> ogrc sayisi en az olan 2. universite'yi  print ediniz.

    public static List<C10_Universite> ogrnSyısıEnAz2nciünv(List<C10_Universite> unv) {

        return unv.
                stream().
                sorted(Comparator.comparing(C10_Universite::getOgrcSayisi)).
                limit(2).
                skip(1).
                collect(Collectors.toList());
    }
//task 07--> notOrt 63 'den buyuk olan universite'lerin ogrc sayilarini toplamini print ediniz.

    public static int notOrt63BüyükOgrnSysToplam(List<C10_Universite> unv) {

        return unv.
                stream().
                filter(t -> t.getNotOrt() > 63).
                mapToInt(t -> t.getOgrcSayisi()).//akıştaki elemanları data type'nı parametredeki degere göre update eder
                sum();// akıştaki elemanlar toplanır


    }

    //task 08--> Ogrenci sayisi 333'dan buyuk olan universite'lerin notOrt'larinin ortalamasini bulunuz.

    public static OptionalDouble ogrnSayısı333denBüyükNotOrt(List<C10_Universite> unv) {

        return unv.
                stream().
                filter(t -> t.getOgrcSayisi()> 333).
                mapToDouble(t -> t.getNotOrt()).//akıştaki elemanları data type'nı parametredeki degere göre update eder
                average();//.getAsDouble();-> yapılarak return tipi douple ile döner


    }
//task 09-->"matematik" bolumlerinin sayisini  print ediniz.
public static int matematikBölümSay(List<C10_Universite> unv) {
        return (int) unv.stream().filter(t->t.getBolum().equals("Matematik")).count();

}
//task 10-->Ogrenci sayilari 571'dan fazla olan universite'lerin en buyuk notOrt'unu bulunuz.
    public static Optional<Integer> ogrn571fazlaEnBüyükNotOrt(List<C10_Universite> unv) {
       return unv.stream().filter(t -> t.getOgrcSayisi() > 571).map(t -> t.getNotOrt()).reduce(Math::max);

    }

    //task 11-->Ogrenci sayilari 1071'dan az olan universite'lerin en kucuk notOrt'unu bulunuz.
    public static Optional<Integer> ogrn1071szEnKüçükNotOrt(List<C10_Universite> unv) {
        return unv.stream().filter(t -> t.getOgrcSayisi() < 1071).map(t -> t.getNotOrt()).reduce(Math::min);

    }






}
