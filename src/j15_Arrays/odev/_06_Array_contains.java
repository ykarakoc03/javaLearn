package j15_Arrays.odev;

import java.util.Arrays;

public class _06_Array_contains {

    public static void main(String[] args) {

        /*
        String array oluşturun ve elemanları : Apple , Orange , Banana , Pineapple
        Apple elemanının bu Array'a ait olup olmadığını kontrol edin.
        Eğer aitse "true" çevirin.
        Loops (döngüler) kullanın.
         */

String meyve[]={"Apple" , "Orange" , "Banana" , "Pineapple"};
int count=0;
boolean kontrol=false;
while (count< meyve.length){
    if (meyve[count].equals("Apple")) {
        kontrol=true;
        break;
    }else count++;
}
        System.out.println( "Apple varligi :"+kontrol);
        System.out.println("2. yontem");
        Arrays.sort(meyve);
        System.out.println("binarySearch methodu ile Apple hangi indexte:"+Arrays.binarySearch(meyve, "Apple"));


    }
}
