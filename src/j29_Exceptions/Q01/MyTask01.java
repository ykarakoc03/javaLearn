package j29_Exceptions.Q01;

import java.util.Scanner;

/*
'ortalama' isminde bir method create ediniz ve int v  - int f  isminde 2 adet parametresi olsun.
        int v = vize
        int f = final

Eğer  vize 100 den büyük, veya final 100'den büyük, veya vize 0'dan küçük, veya final 0'dan küçük ise,
        Sistem ArithmeticException hatası versin ve "Notlar 0-100 arasında olmalı" mesajını döndürsün.
        Diğer durumlarda ise,
        vizenin yüzde 40 ını, finalin yüzde 60 ını alsın ve toplasın.(ortalama =)
        vizeye 120, finale 80 girin.

        Programın çalışmasını sağlayın. (handle edin)

 */
public class MyTask01 {
    static int v=0;
     static int f=0;

    public static void main(String[] args) {


        System.out.println("ortalama = " + ortalama());


    }

    private static double ortalama() {
        Scanner scanner=new Scanner(System.in);
        try {
            System.out.println("vize notunuzu giriniz :");
             v =scanner.nextInt();
            System.out.println("final notunuzu giriniz :");
             f=scanner.nextInt();
            System.out.println(v+" "+f);
            if (v>100||f>100||v<0||f<0){

                throw new ArithmeticException("Notlar 0-100 arasında olmalı");
            }

        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
            System.out.println("lutfen tekrar deneyiniz");
            ortalama();

        }
        System.out.println("vize = "+v+"\n final = "+f);
        double result= v*0.4+f*0.6;
        return result;
    }
}
