package j15_Arrys;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {
        // Array elemanı varlığınıkontrol etme..
        int arr[]={67,97,20,63,43,34,54,24,16,7,55,17};

        int sayi=33;
        System.out.println("**** kendi yaptıgımız kode *****");

        boolean flag=false;//bayrak, varsa bayrak kaldırıyor gibi true yapılır

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==sayi){
                flag=true;
                break;
            }
        }
        if (flag){
            System.out.println("Aradığınız sayı arrayde var");
        }else {
            System.out.println("aradıgınız sayı arryde yok");
        }
        System.out.println("********* Arrays sınıfı ve methodları ***********");
        Arrays.sort(arr); //array elemanlarını sıralar
        System.out.println("sıralanmış hali :"+Arrays.toString(arr));//sıralanmış halini yazdırdık
        System.out.println("34 varmı varsa hangi indexte :"+Arrays.binarySearch(arr, 34));//sıraladıktan sonra varlığını kontrol ettik index noyu veriri
        System.out.println("16 varmı varsa hangi indexte :"+Arrays.binarySearch(arr, 16));//sıraladıktan sonra varlığını kontrol ettik index noyu veriri
        System.out.println("21 varmı varsa hangi indexte :"+Arrays.binarySearch(arr, 21));//sıraladıktan sonra varlığını kontrol ettik index noyu veriri
//trick -> binarySearch() methodu arayda olmayan elemanı çalışırsa sonuçolarak: eger bu eleman olsaydı kaçıncı indekte oldugunu verir.olmadığı için negatif - verir



    }
}
