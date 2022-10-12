package j15_Arrys;

import java.util.Arrays;

public class C03_Arrays {
    public static void main(String[] args) {
        //Stringi arraya cevirme...split()-> girilen parametre değere göre String ifadeyi parçalar
//task-> String ifadenin kelime sayısını print eden bircode create edinix
        String str= "javaCAn'lara selam olsun. en kısa zamanda bolcana offre sonrası TuzlaBalık :)";
        String strArr[] = str.split(" ");//str her " " karakter göre parçalar,
        //Her bir parça bir eleman olarak atanır

        System.out.println(Arrays.toString(strArr));//

        System.out.println("kelime sayısı: "+strArr.length);

        //Task -> String ifadedeki harf sayısını print eden code print ediniz

        String harfArr[] =str.split("");//hiçlige göre her şeyi parçalayıp array a attı
        System.out.println("Harf array : "+Arrays.toString(harfArr));
        System.out.println("karakter sayısı :"+harfArr.length);// saydırdık




    }
}
