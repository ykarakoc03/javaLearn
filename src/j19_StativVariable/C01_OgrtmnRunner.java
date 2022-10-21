package j19_StativVariable;

public class C01_OgrtmnRunner {
    public static void main(String[] args) {

        C01_Ogrtmn hc1 = new C01_Ogrtmn("Cüneyit", 11);
        System.out.println("hc1.tecrübe = " + hc1.tecrübe);
        System.out.println("hc1.isim = " + hc1.isim);
        //hc1.okul = "kabataş";
        System.out.println("hc1.okul = " + hc1.okul);//obj imi ile static variable call etmek gereksiz ve tercih edilmez

        C01_Ogrtmn.okul = "KABATAŞ ERKEK LİSESİ";//bu satırdan sonrakilerde static degeri aynı yazar

        C01_Ogrtmn hc2 = new C01_Ogrtmn("Bekir", 7);
        System.out.println("hc2.tecrübe = " + hc2.tecrübe);
        System.out.println("hc2.isim = " + hc2.isim);
        // hc2.okul = "kapataş";
        System.out.println("hc2.okul = " + hc2.okul);

        C01_Ogrtmn hc3 = new C01_Ogrtmn("Nazım", 13);
        System.out.println("hc3.tecrübe = " + hc3.tecrübe);
        System.out.println("hc3.isim = " + hc3.isim);
        //hc3.okul = "gabataş";
        System.out.println("hc3.okul = " + hc3.okul);
        hc1.evlilikYıldönümü();//obj ile non-static meth. call
        C01_Ogrtmn.maasHesapla();// Class name ile static method call edildi
        hc2.maasHesapla();//obj ile static meth. call edildi-> bad practice


    }
}
