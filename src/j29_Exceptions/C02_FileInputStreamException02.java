package j29_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C02_FileInputStreamException02 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\Nutzer\\IdeaProjects\\javaLearn\\src\\j29_Exceptions\\ebikGabik");
           int k;

               try {
                   while((k= fis.read())!=-1){
                       System.out.print((char)k);
                   }
                   System.out.println("\nicteki try block tan selamlar");
               } catch // dosyaya ulasilir ancak okunamaz sa bu catch calisir
               (IOException e) {
                   System.out.println("dosya okunamiyorrrrrr");
                   System.out.println("icteki catch block tan selamlar");
               }

            System.out.println("Distaki try block tan selam");

        } catch // dosyaya ulasilamazsa bu catch calisir
        (FileNotFoundException e) {
            System.out.println("dosya okunamiyor");
            System.out.println("distaki catch block tan selamlar");

        }
        System.out.println("sorun handle edildi. program calisip bitirildi");

    }


}
