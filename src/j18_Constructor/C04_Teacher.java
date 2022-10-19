package j18_Constructor;

public class C04_Teacher {//mgrt obj üreten class
    String ad;
    String soyadı;
    String brans;
    int tecrübe;

    double maaş;
    int id;
    boolean emekli;

    public C04_Teacher() {//parametrenin ezdiği default conrt. yerine parametresiz contr. create ettik
    }

    // Trick-> parametreli contr. derault contr. ezer.

    public C04_Teacher(String ad, String soyadı, String brans, int tecrübe, double maaş, int id, boolean emekli) {
        this.ad = ad;
        this.soyadı = soyadı;
        this.brans = brans;
        this.tecrübe = tecrübe;
        this.maaş = maaş;
        this.id = id;
        this.emekli = emekli;
    }
    @Override
    public String toString() {
        return "C04_Teacher{" +
                "ad='" + ad + '\'' +
                ", soyadı='" + soyadı + '\'' +
                ", brans='" + brans + '\'' +
                ", tecrübe=" + tecrübe +
                ", maaş=" + maaş +
                ", id=" + id +
                ", emekli=" + emekli +
                '}';
    }



    public void dersSaati() {
        System.out.println("\"20 saatten sonrası extraya girer\" = " + "20 saatten sonrası extraya girer");


    }
}
