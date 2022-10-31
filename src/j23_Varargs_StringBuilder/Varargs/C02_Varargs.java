package j23_Varargs_StringBuilder.Varargs;

public class C02_Varargs {

    public static void main(String[] args) {
        /*
        arr ve verargs method
        */
        int arr[]={24,42,33,19,34,45,58,38};


        // task-> verilen array elemanları toplamını print eden method creade ediniz
        //-task-> task 1 varargs ile çalışınız
        System.out.println("normal method tıoplam: "+arrTop(arr));//293
        System.out.println("varargs toplam "+varargs(arr));//293
        //Trick-> varargs method parametreleri array gibi tanımlandığı için
        // varrag methodu parametre olarak array de verilebilir

    }

public  static int arrTop(int [] a){
        int top =0;
    for (int w:a) {
        top+=w;
    }
    return top;

}
    public  static  int varargs(int... a){
        int topla=0;
        for (int w:a) {
            topla+=w;
        }
        return topla;
    }



}
