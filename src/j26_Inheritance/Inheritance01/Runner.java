package j26_Inheritance.Inheritance01;

/*
 1)Java'da class'lar arasinda parent(Aile)-child(Cocuk)  relationship(iliski) tanımlanmıştır.
 2)Parent Class'a "super class"   Child Class'a "sub class"  denir.
 3)Ortak ozellikler parent class'a, specific ozellikler child class'a tanımlanır.
 4)Parent Child Relationship "reusability", "maintenance",  "less code", "well organization" avantajları içim kullanılır.
 5)Child classlar parent'lardaki her methodu ve variable'i  kullanabilir ama parent class child'dakileri kullanamaz.
 6)Java "Multiple Inheritance"'i desteklemez. Yani; Java'da  bir Child Class'in 1'den fazla parent'i olamaz.
 7)Bir parent class, 1'den fazla child class ile olusturulan  parent child relationship'e "Hierarchical Inheritance"
   denir.
 8)Child-Parent-Grandparent... seklinde olusturulan cok katli  parent child relationshipe'e multi-level inheritance denir.
 9)"Object Class" -> Hz.Adem Class :) butun classlarin parent class'idir. Java'da parent class'i olmayan tek class "Object Class"dir

*/
public class Runner {
    public static void main(String[] args) {
        Hayvancik hyvn = new Hayvancik();
        hyvn.hareket();
        hyvn.icme();
        hyvn.yeme();


        System.out.println("       *****       ");

        Mammal m1 = new Mammal();
        m1.sutBeslenme();//child mammal class call
        m1.dogum();//child mammal class call
        m1.icme();//parent hayvancik class call
        m1.yeme();//parent hayvancik class call
        m1.hareket();//parent hayvancik class call

        System.out.println("         ********          ");

        Paluk hms = new Paluk();
        hms.izgaraTava();//child Paluk class call
        hms.hareket();//parent hayvancik class call
        hms.yeme();//parent hayvancik class call
        hms.icme();//parent hayvancik class call

        System.out.println("       ******       ");
        Kedi kd = new Kedi();
        kd.cirlama();
        kd.hareket();//parent hayvancik class call
        kd.yeme();//parent hayvancik class call
        kd.icme();//parent hayvancik class call
        kd.dogum();//parent Mammal class call
        kd.sutBeslenme();//parent Mammal class call

        System.out.println("       ******       ");

        Koyun ky=new Koyun();
        ky.semir();
        ky.hareket();//parent hayvancik class call
        ky.yeme();//parent hayvancik class call
        ky.icme();//parent hayvancik class call
        ky.dogum();//parent Mammal class call
        ky.sutBeslenme();//parent Mammal class call



    }
}
