package j29_Exceptions;

public class C04_NullPointerException {

    public static void main(String[] args) {
        //NullPointerException-> Null atamasi yapilan bir Stringte lenght() methot run edildiginde olusan RTE exception
        String str="";
        System.out.println("str.length() = " + str.length());

        //String str1=null;
        //System.out.println("str1.length() = " + str1.length());

        try {// excep. firlatacak catch calisacak
            String str1=null;
            System.out.println("str1.length() = " + str1.length());
            System.out.println("try block ta bu yaziyi okunuyorsa exception firlatmadi. code sorunsuz");
        }catch (NullPointerException e){
            System.out.println("hata var cahtc block calisti?");
        }

        System.out.println("sorun handle edildi");// bu code calismisa program kirilmadan sorunsuz calismistir


        try {// excep. firlatmayacak try calisacak
            String str1=null;
            System.out.println("str.length() = " + str.length());
            System.out.println("try block ta bu yaziyi okunuyorsa exception firlatmadi. code sorunsuz");
        }catch (NullPointerException e){
            System.out.println("hata var cahtc block calisti?");
        }


        System.out.println("sorun handle edildi");// bu code calismisa program kirilmadan sorunsuz calismistir








    }
}
