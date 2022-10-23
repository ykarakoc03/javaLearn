package j16_ArrayList.Task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Task11_Fibonacci {
    /*
    Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
    1-1-2-3-5-8-13-21-34....
    */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Integer> fibo = new ArrayList<>();
        System.out.println("fibonacci için bir sayı giriniz");

        int num = sc.nextInt();
        if (fibo.isEmpty()) {
            fibo.add(0, 1);
            fibo.add(1, 1);
        }

        for (int i = 1; fibo.get(i) < num; i++) {

            fibo.add(fibo.get(i) + fibo.get((i - 1)));
        }
        System.out.println("fibo = " + fibo);

    }
}