package j19_StativVariable;

import java.util.Scanner;

public class Task04_RunnerClass {
    public static void main(String[] args) {
        Task04_Bisiklet_Class bisiklet = new Task04_Bisiklet_Class();
        Scanner sc =new Scanner(System.in);
        String secim=sc.next();
        switch (secim){
            case "vitesArtır":
                bisiklet.vitesArtir();
            case "vitesAzal":
                bisiklet.vitesAzalt();
            case "hızlanDegisir":
                System.out.println("yeni hız giriniz");
                bisiklet.hizdegistir(sc.nextInt());
            case "durumGöster":
                bisiklet.durumGoster();
            default:
                System.out.println("yanlış giriş yaptınız");
        }


    }


}
