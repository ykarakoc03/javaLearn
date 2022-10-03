package j11_MethodCreation;

public class C04_MethodDepo {

    //main olmayacak-> motor olmayacak -> malzeme taşıyan romörk
    /* her class da main zorunlu değildir
    */
    public static void gecmeNotu(int not){

        if (not>=85){
            System.out.println("agam tebrik çok başarılısın");
        } else if (not>=70) {
            System.out.println("agam başarılı");
        } else if (not>=60) {
            System.out.println("agam sadece geçtin");
        } else if (not>=45) {
            System.out.println("agam ucuz yırttın :)");
        }else System.out.println("agam fena çaktın :(");


    }
    public static void topla(int sayi1, int sayi2) {
        System.out.println("int-int type method çalıştı -> " + (sayi1 + sayi2));

    }
















}
