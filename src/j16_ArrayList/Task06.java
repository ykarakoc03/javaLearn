package j16_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
/* TASK :
 Kullanıcıdan alacağınız 6 elemanlı bir dizinin
 sadece tek elemanlarını ayrı diziye bir metodda atayarak
  yazdırınız.

 */
        Scanner sc=new Scanner(System.in);
        System.out.print(" 6 sayı giriniz :");

        int sayiArr[]=new int[6];
        for (int i=0; i< sayiArr.length;i++){
            System.out.println(i+1+". sayiyi giriniz");
            sayiArr[i]=sc.nextInt();
        }
       tekElemanlar(sayiArr);


    }

    private static void tekElemanlar(int[] sayiArr) {
        List<Integer> sayiList = new ArrayList<>();
        for (int i = 0; i < sayiArr.length; i++) {
            if (sayiArr[i]%2==1){
               sayiList.add(sayiArr[i]);
            }
        }
        System.out.println("tek sayiList = " + sayiList);
    }
}
