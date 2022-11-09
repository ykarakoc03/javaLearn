package j29_Exceptions;

public class C05_ArrayIndexOutOfBoundsException {
    public static void main(String[] args) {
        //ArrayIndexOutOfBoundsException -> Arraylarda olmayan bir index elemani ile ;slem yapildiginda olusan RTE
int arr[]={24,27,38,41,54};
        System.out.println("arr[0] = " + arr[0]);//24

        //System.out.println("arr[7] = " + arr[7]);//ArrayIndexOutOfBoundsException
        try {// excep. firlatacak cahtch calisacak
            System.out.println("arr[7] = " + arr[7]);
            System.out.println("try block ta bu yaziyi okunuyorsa exception firlatmadi. code sorunsuz");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("hata var cahtc block calisti?");
        }




        System.out.println("sorun handle edildi");// bu code calismisa program kirilmadan sorunsuz calismistir

    }
}
