package J17_ForEachLoop;

public class C02_FotEachLoop {
    public static void main(String[] args) {


// task array elemanlarının çarpımını print eden code create ediniz...-> with for-each
        int arr[][] = {{2, 3}, {4}, {5, 6, 7}};
int carp=1;
        for (int kc[]:arr) {
            for (int a:kc) {
                carp*=a;
            }
        }
        System.out.println("çarpım"+carp);



    }
}
