package j15_Arrays.odev;

public class _05_Array_with_for_if {

    public static void main(String[] args) {

        /*
         elemanları : 5,6,8,12,14,19 olan int Array oluşturun ve
        Eğer sayı çiftse topla, tekse çıkar.
        Örneğin:
         -5 + 6 + 8 + 12 + 14 - 19 = 16
        Toplamlarını yazdırın.
         */
int num[]={5,6,8,12,14,19};
int result =0;
for (int i=0;i<num.length;i++){
    if (num[i]%2==0) {
        result+=num[i];
    }else result-=num[i];
}
        System.out.println("sonuc :"+result);
    }
}
