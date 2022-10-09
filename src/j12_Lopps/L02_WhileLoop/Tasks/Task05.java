package j12_Lopps.L02_WhileLoop.Tasks;

import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {
		/*
		task-> girilen  isim ve soyismi için ilk isminin ilk harfinden soy isminin son harfine kadar olan butun harfleri
		 ayni satirda aralarina bosluk birakarak print rden code create ediniz

		 */
		Scanner sc= new Scanner(System.in);
		System.out.println("ad-soyad giriniz :");
		String adSoyad= sc.nextLine();
		int uzunluk=0;
		while (uzunluk<adSoyad.length()){
			System.out.print(adSoyad.charAt(uzunluk)+" ");
			uzunluk++;
		}


	}

}
