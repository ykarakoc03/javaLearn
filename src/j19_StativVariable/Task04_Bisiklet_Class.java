package j19_StativVariable;

 /*
    Task 04->
     Bisiklet Class :Properties(fields) : hiz, vites
     method  :hizdegistir(int yeniHiz), vitesArtir()-> 1 değer vites artırıyor,
     vitesAzalt() -> 1 deger vites azaltıyor, durumGoster -> O andaki hızı ve vitesi gösteriyor
     vites 5 den büyük ve 1 den küçük olamaz.
     yukarıdaki methodları seçtirilen islemYap methodu ile Runner class'da obj ile methodları çalıştırınız
    Trick -> Kullanıcıya metodlarla iligli bir menü veriniz.
     */



public class Task04_Bisiklet_Class {
    double hiz=0;
    byte vites=1;



    public void hizdegistir(int yeniHiz){
        hiz=yeniHiz;

    }


    public int vitesArtir(){
        if (vites<5){
            vites++;
        }else System.out.println("5. vitesdesiniz dahası yok:)");
        return vites;
    }

    public int vitesAzalt() {
        if (vites>1){
            vites--;
        }else System.out.println("1. vitesdesiniz azı yok:)");
        return vites;

}

    public void durumGoster () {
        System.out.println(vites+". vitestesiniz");
        System.out.println(hiz+" km/h hızdasınız");
}

}
