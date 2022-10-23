package j19_StativVariable;

import java.util.Scanner;

/*Task 03 ->
        Lesson Class :  fields : name, credit (1-10 arasında değer almalı)
        Student Class : fields : name, maxCredit, dersleri(Lesson class obj) saklayacak list
        derslerin toplam kredi miktarını return eden  toplamKredisi method
        Runner Class :  3 adet  ders ve 1 adet öğrc (maxCredit=10) obj create ederek öğrencinin alabileceği ve
        alamayacagı dersleri print eden code create ediniz

 */
public class Task03_RunnerClass {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("öğrenci ismi giriniz :");
        Task03_StudentClass ögr1=new Task03_StudentClass(sc.next());


    }
}
