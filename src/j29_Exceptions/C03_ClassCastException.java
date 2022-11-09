package j29_Exceptions;

public class C03_ClassCastException {

    public static void main(String[] args) {
        //ClassCastException->Birbirine donusturulemeyen data type leri birbirine donusturuldugunde olusa RTE Exception dur

        Object obj="javaCAN'lara selam olsun";
        String str=(String) obj;//Object data type String data type casting yapilarak atandi.
        System.out.println("str = " + str);

        Object sayi1=10;
        //String str2= (String) sayi1;//Object data type String data type casting yapilarak atandi.
        //System.out.println("str2 = " + str2);//ClassCastException

        try {
            String str2= (String) sayi1;
        }catch (ClassCastException e){
            System.out.println("Integer object hic stringe cevrilir mi?");
        }
        System.out.println("sorun handle edildi");



        try {
            String str3= (String) obj;
            System.out.println("try block ta bu yaziyi okunuyorsa exception firlatmadi. code sorunsuz");
        }catch (ClassCastException e){
            System.out.println("hata var cahtc block calisti?");
        }
        System.out.println("sorun handle edildi");// bu code calismisa program kirilmadan sorunsuz calismistir






    }
}
