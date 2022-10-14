package j15_Arrays;

public class Task17 {

    public static void main(String[] args) {
// task -> sayi arr'deki en büyük elemanı print eden code  yazınız
        int sayi[][] = {{1, 2, 3}, {19, -8}, {24, 10, -41}};

        int max=sayi[0][0];
        for (int i = 0; i < sayi.length; i++) {
            for (int j = 0; j < sayi[i].length; j++) {
                if (sayi[i][j]>max){
                    max=sayi[i][j];
                }
            }
        }
        System.out.println("maksimum eleman :"+max);
/*
       int max=sayi[0][0];
        for (int i = 0; i < sayi.length; i++) {
            Arrays.sort(sayi[i]);
            if (sayi[i][sayi[i].length-1]>max)
                max=sayi[i][sayi[i].length-1];

        }
        System.out.println(max);*/
    }
}
