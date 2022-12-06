package j23_Varargs_StringBuilder.StringBuilder;

public class C3_SB_Pdfsoru10 {
    /*
 Soru-10
Cıktı sonucu ne olur?
StringBuilder sb = new StringBuilder(5 + 7 + “Java” + 4 + 5);
sb.append(sb.delete(1, 4));
System.out.println(sb);
A. 12Java451va45
B.1va451va45
C.57Java455va45
D.5va455va45
E.Compiler error verir


     */

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("5"+  7+"Java" + 4 + 5);
        System.out.println(sb);
        sb.append(sb.delete(1, 4));
        System.out.println(sb);


    }

}
