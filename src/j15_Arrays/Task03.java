package j15_Arrays;

import java.util.Arrays;

public class Task03 {
	
	public static void main(String[] args) {
		
		 /*
       Task-> Verilen  bir arrayin tum elemanlarini
        bir soldaki konuma print eden code create ediniz
       input:  [1,2, 3]
        output [2, 3, 1]
        */
int temp;
		int num []={1,2,3,4,5,6,7,8,9};
		for (int i=num.length-1;i>=1;i--){
			temp=num[i];
			num[i]=num[i-1];
			num[i-1]=temp;
		}
		System.out.println(Arrays.toString(num));
	}

}
