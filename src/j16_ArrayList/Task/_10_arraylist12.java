package j16_ArrayList.Task;

import java.util.*;

public class _10_arraylist12 {

    /*
    rangeBtw() isminde bir method oluşturun.
    Parametre olarak   bir Arraylist  ve iki ayrı int
    return tipi int

     Arraylist'in iki int arasında kaç değeri olduğunu sayın.
    return  count       (sayacı (count) döndürün.)

    Example (Örnek):
    ArrayList: 1 , 5 , 22, 10 ,20 ,14 , 8 , 25 , 30, 28
    min = 20
    max = 30
    return =  5    (20,22,25,28,30)
    min ve max aralığı da  dahil (Örnek1 'deki 20 ve 30 da dahildir.)
     */

    public static void main(String[] args) {
        ArrayList<Integer> sayiList = new ArrayList<>(List.of(1, 5, 22, 10, 20, 14, 8, 25, 30, 28));
        Scanner input = new Scanner(System.in);
        System.out.println(sayiList + " listesinden istediginiz sayı aralıgını seçiniz");
        int sayi1 = input.nextInt();
        int sayi2 = input.nextInt();
        System.out.println("girdiğiniz degerler arasında "+rangeBtw(sayiList,sayi1,sayi2)+" adet sayı bulunmaktadır");
    }

    private static int rangeBtw(ArrayList<Integer> sayiList, int sayi1, int sayi2) {
        if (sayi1>sayi2){
            int temp = sayi1;
            sayi1 = sayi2;
            sayi2 =temp;
        }
        int count=0;
        Collections.sort(sayiList);
        for (int i:sayiList) {
            if (i>=sayi1 && i<=sayi2){
                count++;
            }
        }
        return count;

    }
}