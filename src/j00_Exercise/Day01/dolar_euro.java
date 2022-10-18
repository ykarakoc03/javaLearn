package j00_Exercise.Day01;

import java.util.Arrays;

public class dolar_euro {

    /*
 TASK :
 $ ve  £  isareti olanlarin toplamlarini ayri ayri bulup yazdıran java code create ediniz.

      String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
      */
    public static void main(String[] args) {

        String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
        String para[]= str.split(" ");
int dolartopla=0;
int Sterlintopla=0;
        System.out.println("yeni arrya :"+ Arrays.toString(para));
        for (int i = 0; i < para.length; i++) {
            if (para[i].contains("$")) {
                dolartopla = Integer.parseInt(para[i].replace("$", ""));
            } else if (para[i].contains("£")) {
                Sterlintopla=Integer.parseInt(para[i].replace("£",""));
            }
        }
        System.out.println("dolartopla = " + dolartopla);
        System.out.println("Sterlintopla = " + Sterlintopla);
    }
}
