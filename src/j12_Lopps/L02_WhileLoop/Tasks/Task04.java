package j12_Lopps.L02_WhileLoop.Tasks;

public class Task04 {

	public static void main(String[] args) {
		/*
		task->  3 basamakli 4 ve 6 ya tam bolunebilen tam sayilari buyukten kucuge ve kaç tane oldugunu print eden code create ediniz.

		 */
			int sayac =0;
		for (int i = 1000; i >100 ; i--) {
			if (i%4==0 && i%6==0) {
				System.out.print(i+" ");
				sayac++;
			}

		}System.out.println("");
		System.out.println("3 basamakli 4 ve 6 ya tam bolunebilen tam sayilar :"+sayac);
		

		
		
			
	}

}
