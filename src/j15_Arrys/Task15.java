package j15_Arrys;

public class Task15 {
    public static void main(String[] args) {
        // task-> arr tüm elemanlarının çarpımını veren code create ediniz
        int sayi[][]={{1,2,3},{9,8}};
int carpt=1;
        for (int i = 0; i < sayi.length; i++) {
            for (int j = 0; j < sayi[i].length; j++) {
               carpt *=sayi[i][j];
            }
        }
System.out.println("çarpım sonucu :"+carpt);
    }
}
