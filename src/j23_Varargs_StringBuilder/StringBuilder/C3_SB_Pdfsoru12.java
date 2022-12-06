package j23_Varargs_StringBuilder.StringBuilder;

public class C3_SB_Pdfsoru12 {
    /*
Soru-12
StringBuilder b= “rumble “;
b.append(4).deleteCharAt(3).delete(3,b.length()–1);
System.out.println(b);
A. rum
B. rum4
C. rumb4
D. rumble4
E. Compile error verir.


     */

    public static void main(String[] args) {

        StringBuilder b= new StringBuilder("rumble" );
        b.append(4).deleteCharAt(3).delete(3,b.length());
        System.out.println(b);


    }

}
