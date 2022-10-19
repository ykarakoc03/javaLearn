package j18_Constructor;

public class C03_StudentRunner {


    public static void main(String[] args) {

        C03_Student ogtc1 =new C03_Student();
        ogtc1.ad="fatih";
        ogtc1.soyadı="Ataş";
        ogtc1.sınıf=1;
        ogtc1.okulno=1001;
        ogtc1.ortama=77;
        ogtc1.taktir=true;
        System.out.println("ogtc1 = " + ogtc1);// stack ten referans degerini yazar:ogtc1 = j18_Constructor.C03_Student@5315b42e
                                            //bunun ici obj sınında sag tıklayıp generate->toString diyip özelliklerini secerek yazdırılmasını sagladık
                                            //ogtc1 = {ad='fatih', soyadı='Ataş', sınıf=1, ortama=77.0, okulno=1001, taktir=true}

        ogtc1.mezuniyet();//agam diplomayı aldın

     // task-> diger bir öğrenci objesi ile düm filtleri print ediniz

        C03_Student ogtc2 =new C03_Student();
        ogtc2.ad="Mehmet";
        ogtc2.soyadı="yıldız";
        ogtc2.sınıf=6;
        ogtc2.okulno=102;
        ogtc2.ortama=85;
        ogtc2.taktir=true;
        System.out.println("ogtc2 = " + ogtc2);
        ogtc2.mezuniyet();

    }
}
