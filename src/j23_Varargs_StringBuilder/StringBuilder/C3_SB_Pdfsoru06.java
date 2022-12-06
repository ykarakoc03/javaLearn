package j23_Varargs_StringBuilder.StringBuilder;

public class C3_SB_Pdfsoru06 {
/*
Soru-6
Cıktı sonucu ne olur?
StringBuilder sb = new StringBuilder(“Java”);
String str1 = sb.toString();
String str2 = sb.toString();
StringBuilder sb1 = sb;
System.out.println((str1 == str2)+ ” “+ (sb == sb1) );
A. true true
B. false true
C. true false
D. false false
E. Compiler error verir.

 */
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Java");

        String str1=sb.toString();
        String str2=sb.toString();
        StringBuilder sb1=sb;

        System.out.println(sb1.hashCode());
        System.out.println(sb.hashCode());
        System.out.println((str1==str2)+ " "+(sb == sb1));


    }

}
