package j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Task07 {
    public static void main(String[] args) {

        /* TASK :
         * 10 elamanli bir list olusturun. Ardindan dizinin 3. elemani ile
         * 8. elemaninin yerlerini degistirin.
         *
         * ORNEK:
         *
         * INPUT : String[] isimler={"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};
         * OUTPUT : String[] isimler={"Umit","Emin","Furkan","Kerem","Taylan","Orhan","Sinan","Kemal","Ahmet","Ali"};
         */

        List<String> isimler = new ArrayList<>(List.of("Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"));
        String str3 = isimler.get(2);
        String str8 = isimler.get(7);
        System.out.println("isimler = " + isimler);
        isimler.set(2,str8);
        isimler.set(7,str3);
        System.out.println("degistirilmis isimler = " + isimler);


    }


}
