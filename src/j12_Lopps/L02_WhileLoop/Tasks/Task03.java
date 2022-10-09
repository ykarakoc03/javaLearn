package j12_Lopps.L02_WhileLoop.Tasks;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		/*

        task-> girilen  tamsayı için carpim tablosunu print eden code create ediniz.

		 Ornek input = 13
		 13x1=13 13x2=26  . . .. .  . 13x10=130
		 */
		Scanner scan = new Scanner (System.in);
		System.out.println("carpim tablosunu istediginiz sayiyi giriniz :");
		int num = scan.nextInt();
		for (int i = 1; i <11 ; i++) {
			System.out.println(num+"x"+i+"="+num*i);
		}

	}

}
