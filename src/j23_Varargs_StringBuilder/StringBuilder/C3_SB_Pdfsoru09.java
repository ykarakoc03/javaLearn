package j23_Varargs_StringBuilder.StringBuilder;

public class C3_SB_Pdfsoru09 {
    /*
 Soru-9
Cıktı sonucu ne olur?
StringBuilder sb1 = new StringBuilder(“OCAJP8”);
StringBuilder sb2 = sb1 ;
sb1.append(“J”);
System.out.println(sb1 + ” “+ sb2+ ” ” + (sb1==sb2));
A. OCAJP8J OCAJP8J true
B. OCAJP8J OCAJP8 false
C. OCAJP8 OCAJP8 true
D. OCAJP8J OCAJP8J false
E. Compiler error verir

     */

    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("OCAJP8");

        StringBuilder sb2 = sb1 ;
        sb1.append("J");

        System.out.println(sb1 + " "+ sb2+ " " + (sb1==sb2));


    }

}
