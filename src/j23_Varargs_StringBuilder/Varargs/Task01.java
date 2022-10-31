package j23_Varargs_StringBuilder.Varargs;

import java.util.Arrays;

public class Task01 {
    public static void main(String[] args) {

/*
Task ->
verilen Stringleri birlestiren concat isimli METHOD create ediniz.
input : "m", "e", "r", "v", "e";
output : merve
 */
        String arr1[]={"m", "e", "r", "v", "e"};
        String arr2[]={"a", "l", "i"};
        varargs(arr1);
        varargs(arr2);
varargs("m", "e", "r", "v", "e");

    }

    public static void varargs(String... str){
        String kelime="";
        for (String w:str ) {
            kelime=kelime.concat(w);

        }
        System.out.println(kelime);
    }
}
