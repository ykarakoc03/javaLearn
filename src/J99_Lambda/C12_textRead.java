package J99_Lambda;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.stream.Stream;

public class C12_textRead {
    public static void main(String[] args) throws IOException {


        //TASK 01--> haluk dosyasını okuyunuz Consola print ediniz
        Path hlk=Path.of("src/J99_Lambda/haluk");// erişilecek dosyanın path'i tanımlandı
        Stream<String> akıs= Files.lines(hlk);
        //Stream<String> akıs= Files.lines(Path.of("src/J99_Lambda/haluk"));

        akıs.//erişimi verlen dosyadaki satırlar akışa alındı
                forEach(System.out::println);// akıştaki satırlar (lines) print edildi

        //TASK 02 --> haluk.txt dosyasini buyuk harflerle okuyunuz.(Console'a buyuk harflerle print ediniz.)
        System.out.println("\n*************  TASK 02 ***************\n");

        Files.lines(Path.of("src/J99_Lambda/haluk")).
                map(String::toUpperCase).
                forEach(System.out::println);
        // Alternatif çözüm: Files.readAllLines(hlk).stream().map(String::toUpperCase).forEach(System.out::println);



        //TASK 03 --> haluk.txt dosyasindaki ilk satiri kucuk harflerle print ediniz..
        System.out.println("\n*************  TASK 03 ***************\n");
        Files.lines(Path.of("src/J99_Lambda/haluk")).
                map(String::toLowerCase).
                limit(1).//akıştaki ilk eleman(ilk satır) alındı
                forEach(System.out::println);
        //findFirst()--> limit yerine kullanılabilirdi

//TASK 04 --> haluk dosyasinda "basari" kelimesinin kac satirda gectiginiz print ediniz.
        System.out.println("\n****   TASK 04 haluk dosyasinda \"basari\" kelimesinin kac satirda gectiginiz print ediniz*****\n");
        System.out.println(Files.lines(Path.of("src/J99_Lambda/haluk")).
                map(String::toLowerCase).
                filter(t -> t.contains("basarı")).//başarı içeren elemanlar filitrelendi
                count());// akıştaki elemanlar saydırıldı

        //yakup  TASK 05 --> haluk.txt dosyasindaki farkli kelimeleri  print ediniz..
        System.out.println("\n****  TASK 05 haluk.txt dosyasindaki farkli kelimeleri  print ediniz.. *****\n");
        Stream<String> akis05=Files.lines(Path.of("src/J99_Lambda/haluk"));
       akis05.map(String::toLowerCase).distinct().forEach(t-> System.out.print(t+ " "));

        //Esma H.TASK 06 --> haluk.txt dosyasindaki tum kelimeleri natural order  print ediniz..


        //Mücahit B.TASK 07 --> haluk.txt dosyasinda "basari" kelimesinin kac kere gectigini buyuk harf kucuk harf bagımsız print ediniz.
        //Elif H.TASK 08 --> haluk.txt dosyasinda "a" harfi gecen kelimelerin sayisini print eden  programi create ediniz.
        //Yakup TASK 09 --> haluk.txt dosyasinda icinde "a" harfi gecen kelimeleri print ediniz.
        System.out.println("\n****  TASK 09 haluk.txt dosyasinda icinde \"a\" harfi gecen kelimeleri print ediniz. *****\n");
        Stream<String> akis09=Files.lines(Path.of("src/J99_Lambda/haluk"));
        akis09.map(String::toLowerCase).map(t->t.split(" ")).flatMap(Arrays::stream).filter(u->u.contains("a")).forEach(System.out::println);

        //Esma H. TASK 10 --> haluk.txt dosyasinda kac /farklı harf kullanildigini print ediniz.
        //Mücahit B.TASK 11 --> haluk.txt dosyasinda kac farkli kelime kullanildigini print ediniz.
        //Elif H.TASK 12 --> haluk.txt dosyasinda  farkli kelimeleri print ediniz



    }
}
