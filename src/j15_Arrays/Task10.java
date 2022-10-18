package j15_Arrays;

import java.util.*;

public class Task10 {

    public static void main(String[] args) {
        /* TASK :
        bir int Array elemanlarinin işaretini(+-)degistiren  bir method create ediniz.
        input : 1,2,-3,4,-5,-6
        output :-1,-2,3,-4,5,6

         */
        Scanner sc=new Scanner(System.in);
        System.out.println("5 adet integer negati yada pozitif sayi giriniz");
        int numArr[]=new int[5];
        for (int i=0; i<numArr.length;i++) {
            System.out.println((i+1) + ".sayiyi giriniz :");
            numArr[i]=sc.nextInt();
        }
        System.out.println("girdiginiz sayi:" + Arrays.toString(numArr));
        System.out.println(Arrays.toString(isaretDegis(numArr)));

    }

    private static int[] isaretDegis(int[] numArr) {
        for (int i = 0; i < numArr.length; i++) {
                numArr[i]-=2*numArr[i];
        }
        return numArr;

    }


}
