package j16_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C15_ArrayConvertList {
    public static void main(String[] args) {
        //King of Trick-> Array'dan cevrilen List array kaynakli oldugu icin array davranisi
        // gosterir. boyut sabittir dolayisiyla remove add method calismaz

        String arrJavaCan[] = {"akif,", "gamze", "musty", "sevdenur"};
        List<String> listJavaTar = Arrays.asList(arrJavaCan);//arrJavaCan degerleri list elemani oldu
        System.out.println("listJavaTar = " + listJavaTar);
        System.out.println("listJavaTar.size() = " + listJavaTar.size());
        //listJavaTar.add("sefilcan haluk");//arraya eleman eklenmez aslist yaptigimiz icin array gibi davranip boyut degisikligine izin verme
        //listJavaTar.clear();//array gibi oldugu inin eleman silmesine izin vermez boyut degisiligi olamz rte verir
        //RTE-> UnsupportedOperationException

        // ahan da kral Trickyyy -> list data type ArrayList tanımlanırsa Rte vermez
        // kaynagı array de olsa list davranır boyut esnekliği yapar.

        ArrayList<String> listJavaTar1 = new ArrayList<>(Arrays.asList(arrJavaCan));
        listJavaTar1.add("sefil haluk");
        System.out.println("listJavaTar1 = " + listJavaTar1);//[Akif, Gamze, Musty, SevdeNur, sefil haluk]


    }


}
