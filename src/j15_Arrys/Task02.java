package j15_Arrys;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        //task-> girilen int array elemanları toplamını prtint eden code creade ediniz

        Scanner sc = new Scanner(System.in);
        System.out.println("kaç elemanlı Array istiyorsunuz");
       // int indexSay = sc.nextInt();//elde ettigimiz datayı tekrar kullanmıycaksanız boşuna hafızada yer kaplamasın
        int sayiArr[] = new int[sc.nextInt()];//bunun için new int[] içine yazdık zaten int. tipde istiyordu. hem ram dan hemde hafızadan tasarruf ettik
        int toplam = 0;
        for (int i = 0; i < sayiArr.length; i++) {
            System.out.println(i + ". Arrayı giriniz :");
            sayiArr[i] = sc.nextInt();

        }
        for (int i = 0; i < sayiArr.length; i++) {
            toplam += sayiArr[i];
        }
        System.out.println("Toplam "+toplam);
    }
}
