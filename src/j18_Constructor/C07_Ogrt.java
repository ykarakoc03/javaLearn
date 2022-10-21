package j18_Constructor;

public class C07_Ogrt {
    String isim;
    int tecrübe;
    int kidem=5;

    public C07_Ogrt(String isim, int tecrübe) {
        this.isim = isim;
        this.tecrübe = tecrübe;
    }
    public void kıdemHesapla(int kidem){
        System.out.println("agam kıdemin :"+(kidem*2));
        System.out.println("agam kıdemin :"+(this.kidem*2));

    }


}
