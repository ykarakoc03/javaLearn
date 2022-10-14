package j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C04_Get {
    public static void main(String[] args) {
// get();-> listte istenen index elemanını return eder (arr[3]->arr'in 3.indekteki elemanını verir)
        ArrayList<String> listSehir=new ArrayList<>(List.of("Münih","LosAngeles","Londra","stockholm"));
        System.out.println(listSehir.get(1));//LosAndeles
        //System.out.println(listSehir.get(11));//olmayan elemanda RTE verir



    }
}
