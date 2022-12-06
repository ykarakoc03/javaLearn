package j23_Varargs_StringBuilder.StringBuilder;

public class C3_SB_Pdfsoru11 {
    /*
 Soru-11
StringBuilder sb= new StringBuilder(“0123456789”);
sb.delete(2, 8);
sb.append(“-“).insert(2, “+”);
System.out.println(sb);
A. 01+89–
B. 012+9–
C. 012+–9
D. 0123456789
E. Compile error verir


     */

    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder("0123456789");
        sb.delete(2, 8);
        sb.append("-").insert(2, "+");
        System.out.println(sb);
    }

}
