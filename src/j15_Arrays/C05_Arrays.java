package j15_Arrays;

import java.util.Arrays;

public class C05_Arrays {
    public static void main(String[] args) {
        //Array copy... copyOf(arr,newLength);-> girilen arr'yin newlength kadar ilk elemanını kopyalar

        int sayi[]={63,21,47,27,35,12,36,31,46,24};

        int yeniArr[]= Arrays.copyOf(sayi,5);//[63, 21, 47, 27, 35]
        System.out.println("sayi arrayından 5 eleman kopyalanana yeni arr :"+Arrays.toString(yeniArr));//[63, 21, 47, 27, 35]

        int baskaArr[]= Arrays.copyOfRange(sayi,3,8);//3 dahil 8 hariç index elemanlar kopyalanır
        System.out.println("copyOfRange methodu çalıştırarak from 3, to 8 -> "+Arrays.toString(baskaArr));

        // arrayı belirli bir eleman ile update(set) etme... fill(arr,value);

        Arrays.fill(sayi,99);//bütün sayi arrayini value degeri ile değiştirip doldurur fuller
        System.out.println("sayi arrayı 99 a fulledim :"+Arrays.toString(sayi));//[99, 99, 99, 99, 99, 99, 99, 99, 99, 99]

        Arrays.fill(sayi,3,7,33);//3 den başla 7 ye kadar 33 ile update edildi
        System.out.println(" sayi arrayi 3 ile 7. index arası 33 ile fullenmiş hali :"+Arrays.toString(sayi));//[99, 99, 99, 33, 33, 33, 33, 99, 99, 99]



    }
}
