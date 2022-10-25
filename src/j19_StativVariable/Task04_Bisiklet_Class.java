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


import java.util.Scanner;

public class Task04_Bisiklet_Class {
    double hiz = 0;
    byte vites = 1;
    Scanner sc = new Scanner(System.in);

    public Task04_Bisiklet_Class() {
        menü();
    }

    public void menü() {

        System.out.println("vites artırmak->d \nvites azaltmak->r \nhız değiştir->v \ndurum göster->s \nbisikleti parketmek için->p");
        String secim = sc.next().toLowerCase();
        switch (secim) {
            case "d":
                vitesArtir();
            case "r":
                vitesAzalt();
            case "v":
                System.out.println("yeni hız giriniz");
                hizdegistir(sc.nextInt());
            case "s":
                durumGoster();
            case "p":
                System.out.println("park yapıldı");
                break;
            default:
                System.out.println("yanlış giriş yaptınız");
                menü();
        }


    }

    public void hizdegistir(int yeniHiz) {
        if (vitesKontrol(yeniHiz)) {
            hiz = yeniHiz;
            durumGoster();
        } else menü();

    }


    public boolean vitesKontrol(int yeniHız) {
        boolean kontrol = false;
        int sürat[][] = {{1, 10}, {11, 20}, {21, 30}, {31, 40}, {41, 50}};
        for (int i = 0; i < sürat.length; i++) {
            for (int j = 0; j < sürat[i].length - 1; j++) {
                if (yeniHız >= sürat[i][j] && yeniHız <= sürat[i][j + 1]) {
                    if (vites == i + 1) kontrol = true;
                    else {
                        System.out.println(vites + " .vitestesiniz. " + sürat[i][j] + " ile " + sürat[i][j + 1] + " arasında hız degeri girebilirsiniz. Aksi halde vitesinizi uygun hıza getiriniz");
                        break;
                    }
                }

            }

        }
        return kontrol;
    }

    public void vitesArtir() {
        if (vites < 5) {
            vites++;
            durumGoster();
        } else System.out.println("5. vitesdesiniz dahası yok:)");
        menü();
    }

    public void vitesAzalt() {
        if (vites > 1) {
            vites--;
            durumGoster();
        } else System.out.println("1. vitesdesiniz azı yok:)");
        menü();
    }

    public void durumGoster() {
        System.out.println(vites + ". vitestesiniz");
        System.out.println(hiz + " km/h hızdasınız");
        menü();
    }

}
