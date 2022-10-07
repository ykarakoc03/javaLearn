package j12_ForLopps.L02_WhileLoop;

import java.util.Scanner;

public class C03_WhileLoop {
    //task->girilen tamsayının tam bölen sayısını print eden code create ediniz
    //20->1,2,4,5,10,20: 20nin altı tam böleni vardır


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("AGAM nassıng :) bir tamsayı giriyorsun : ");
        int sayi = sc.nextInt();
        int bölenSayi=1;
        int tamNölenAdeti=0;

        while (bölenSayi<=sayi){
            if (sayi%bölenSayi==0){//tam bölüm şartı
                tamNölenAdeti++;
            }
            bölenSayi++;
        }
        System.out.println("girdiginiz "+sayi+" nın "+tamNölenAdeti+ "tam böleni var") ;



    }
}
