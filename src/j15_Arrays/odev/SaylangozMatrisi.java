package j15_Arrays.odev;

import java.util.Arrays;
import java.util.Scanner;

public class SaylangozMatrisi {
    /* Task-> girilen değere göre  salyangoz matris  create eden code create ediniz
    input :3
    output:
            1       2       3
            8       9       4
            7       6       5

    input :4
    output :1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16
            1       2       3       4
            12      13      14      5
            11      16      15      6
            10      9       8       7
            */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("saylangoz matrisi için bir sayı giriniz :");
        int num = sc.nextInt();

        int arr [][]=new int[num][num];
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]=i;
            }

        }
        int dizin[]=new int[num*num];
        for (int i = 0; i < num*num; i++) {
            dizin[i]=i+1;
        }
        for (int i = 0; i < num; i++) {
            System.out.print(dizin[i]+" ");
        }
        System.out.println("");
        System.out.println(Arrays.toString(dizin));

    }










}
