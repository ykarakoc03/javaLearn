package j18_Constructor;

public class C03_Student {
    //field->
    String ad;
    String soyadı;
    int sınıf;
    double ortama;
    int okulno;
    boolean taktir;
    public void mezuniyet(){
        if (ortama>=50){
            System.out.println( "agam diplomayı aldın");
        }else System.out.println("agam kaldın");
    }

    @Override                 // tüm field ler yazabiliriz.üzerinde oynama yaparız
    public String toString() {// obj referan degerini print etmemesi için obj datalarını print eden method
        return "{" +
                "ad='" + ad + '\'' +
                ", soyadı='" + soyadı + '\'' +
                ", sınıf=" + sınıf +
                ", ortama=" + ortama +
                ", okulno=" + okulno +
                ", taktir=" + taktir +
                '}';
    }
}
