package j29_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C02_FileInputStreamException01 {
    /*

     Dosya okuma/yazma işlemi bu işlemlerde hata olasılığı yüksek olduğundan hata kontrolü zorunlu tutuluyor.
     bu yüzden try-catch e alınması bu kodun zorunlu tutuluyor. bu gibi surumlara karşılk gelen hatalara Checked Exception denir
     Özellikle IO(input output) işlemleri CHECKED EXCEPTİON dur.


    Bir kod yazilirken olasi exception'lar ongorulup
    exception olustugunda Java'nin ne yapmasini istedigimiz
    belirtilmelidir.


         1) FileNotFoundException, ustunde calisilicak bir dosyaya ulasma ile ilgili problemlerde
kullanilir. Bir dosyaya ulasmada iki temel problem olabilir; a) Path yanlistir. b) Dosya silinmistir.

   2) IOException, input ve output ile alakali tum problemlerde kullanilir. IOException,
FileNotFoundException'in yaptigi tum aksiyonları yapabilir dolayısıyla IOException kullanildiginda
FileNotException'in kullanilmasina gerek yoktur. IOException FileNotFoundException
Class'inin parent class Hz.Adem
 */
    public static void main(String[] args) throws IOException {// IO islemlerinin en parent class exception
        //public static void main(String[] args) throws FileNotFoundException {// read() methot import oncesi child exception

        FileInputStream fis = new FileInputStream("C:\\Users\\Nutzer\\IdeaProjects\\javaLearn\\src\\j29_Exceptions\\ebikGabik");
        //ilgili dosyaya ulasmak icin fis obj tanimlandi parametre olarak ulasilacak dosya yolu girildi
        // FileNotFountException-> adres yanlis controlu
        int k;
        while ((k = fis.read()) != -1) {
            System.out.print((char) k);// k int ascci olan file degeri char icin casting-> type donusumu yapildi
        }
        System.out.println("sorun handle edildi. program calisip bitirildi");

    }


}
