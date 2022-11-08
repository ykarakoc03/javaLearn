package j29_Exceptions;

import java.util.Scanner;

public class C01_ArithmeticException {
    public static void main(String[] args) {
        // Arithmetic Exception matematiksel islemlerde olusan RTE
        String str = "";
        // str.charAt(2);//RTE->StringIndexOutOfBoundsException
        Scanner sc = new Scanner(System.in);

        System.out.println("bir sayi giriniz : ");
        int sayi1 = sc.nextInt();

        System.out.println("ikinci sayi giriniz : ");
        int sayi2 = sc.nextInt();

        int oran;// eger sayi2=0 olursa Rte->ArithmeticException: / by zero
        try {// dene -> hata olma ihtimali oldugu block
            /*
            1- try-catch kullanildiginda try bloc hatasiz calisirsa catch block asla calismaz. hata yakalarsa calisir
            2- try block catch veya finally block olmadan CTE verir. try block'tan sonra birden fazla catch block tanimlanabilir
                ayni anda sadece bir catch block calisabilir; hicbir catch blockta calismayabilir
            3- parent - child iliskisi olan catch lerde child once yazilmalidir  aksi halde CTE
             */
            oran = sayi1 / sayi2;
            System.out.println(oran);
            System.out.println("try block tan selamlar");

        }
        catch (ArrayIndexOutOfBoundsException arryExc){

            System.out.println("arrayda olmayan eleman istiyorsunuz");

        }
        catch (ArithmeticException falanFilan){
            System.out.println("bolmede 0 olmaz"+falanFilan.getMessage());//(/ by zero) Exception olustugunda sadece hata mesaji pirn etmek icin getMessage() kullanilir
            falanFilan.printStackTrace();//olursa Exception tum detay bilgisini print etmek icin kullanilir. program calismasi bittikten sonra yazar
            System.out.println("child catch ten selamlar");
        }

        catch (Exception ebikGabik) {//Exception Class tum exceptionlarin parentidir en ustudur.-> bad practies
                                        // hata yakalandiginda yapilacak aksiyonlarin oldugu blok
            System.out.println(" '0' bolme hatasi");
            System.out.println("usta (parent) catch block tan selamlar");
        }
        //catch (ArithmeticException falanFilan){// child exception paren exception (Exception ebikGabik)dan sonra tanimladigi icin hata verdi
        //
        //}
        finally {// catch block'lardan sonra istenirse finally block kullanilabilir
            /*
            try- catch icinde yapilan islemlerden sonra mutlaka calismasi gereken black varsa finally tanimlanir
            hata durumunda catch calismazsa pogram sonlanir. ama finally tanimlanirsa catch calismasa bile
            program akisi devam eder. finally hata olsada olmasada calisir.
            Cloud ortamlarda database ortamlarinda baglanti kesmek icin kullanilir.
            Claud ile connection yazdiginizda code basarili bir sekilde calisirsa islem bittiginde finally block ile connection kapanmazsa maliyet agir olur
             */
            System.out.println("finally block tan selamlar");
        }

        System.out.println("sorun handle edildi. cikis yapildi...");


    }
}
