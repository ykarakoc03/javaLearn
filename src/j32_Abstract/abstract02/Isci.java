package j32_Abstract.abstract02;

public class Isci extends Personel {

    @Override
    public void maasHesapla() {//Personel parent class"dan override edildi
        System.out.println("iscilere en cok yevmiye 499 tl dir");
    }

    @Override
    public void maasBilgisi() {//Personel parent class"dan override edildi
        System.out.println("gunde 8 saat iscilik");
    }
}
