package j23_Varargs_StringBuilder.StringBuilder;

public class C3_SB_Pdfsoru08 {
    /*
 Soru-8
Cıktı sonucu ne olur?
StringBuilder sb = new StringBuilder(“OCAJP8”);
sb.setLength(4);
sb.setLength(15);
System.out.println(sb.length());
A. 4 yazdırır.
B. 15 yazdırır.
C. 11 yazdırır
D. Compiler error verir.
E. Yukarıdakilerin hiçbiri
     */

    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("01234567891234567");
        System.out.println(sb);
        sb.replace(0,13,"************");
        System.out.println(sb);
        sb.setLength(4);
        System.out.println(sb);
        sb.setLength(15);
        System.out.println(sb);
        System.out.println(sb.length());


    }

}
