package j11_MethodCreation;

import java.util.Scanner;

public class C05_RecursiveMethod {
/*
Recursive  call edildiğinde run time'da programa ekstradan yük getiren bir yapıdadır
çünkü bir fonksiyon kendi kendini çağırdığında her çağırmada yığında (stack) bir işlem gerçekleşir ve bir bellek konumu oluşur.
Bu yüzden özyineleme ile yapılan hesaplamalar daha yavaş ve verimsizdir.
Peki özyinelemeyi neden kullanıyoruz?
Bazı karmaşık çözülmesi güç problemlerde döngülere göre daha kısa ve anlaşılır olduğu için.
 */
public static void main(String[] args) {
/* faktöriyel girilen sayının 1 e kadar olan tam sayıların çarpımıdır

    */
     Scanner sc = new Scanner(System.in);
    System.out.println("bir tamsayı giriniz :");
    int num = sc.nextInt();
    System.out.println(faktöriyel(num));
    }
public static int faktöriyel (int a){
    if (a>=1) {
        return a* faktöriyel(a - 1);
    }else return 1;

}



}
