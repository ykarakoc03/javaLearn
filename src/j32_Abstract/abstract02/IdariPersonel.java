package j32_Abstract.abstract02;

public class IdariPersonel extends Personel{
    @Override//Mecbur implement edilmeli
    public void maasHesapla() {//Personel parent class"dan override edildi
        System.out.println("idarecimice saati 120$");
    }

    @Override//Mecbur implement edilmeli
    public void maasBilgisi() {//Personel parent class"dan override edildi
        System.out.println("Temiz Code yazan idari personele exsra 1 ay ikramiye");
    }

    @Override//Tercihen Override edildi
    public void sigortta() {
        System.out.println("Temiz code personel full sigorta kapsaminda");
    }
}
