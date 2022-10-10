package j13_Break_Continue;

import java.util.Scanner;

public class C06_Task {
    public static void main(String[] args) {

        // task-> girilen bir ifadedeki c karakterine kadar a karakter sayısını print eden code creade ediniz
        Scanner sc = new Scanner(System.in);
        System.out.println("bir ifade giriniz  :");
        String metin = sc.nextLine();
        int say = 0;
        for (int i = 0; i < metin.length(); i++) {
            char c = metin.charAt(i);
            if (c == 'a') say++;
            else if (c == 'c') break;

            System.out.println("döngüye giren karakter :" + c);

        }
        System.out.println("ilk c ye kadar olan a ların sayısı :" + say);


    }
}
