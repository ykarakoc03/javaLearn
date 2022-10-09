package j12_Lopps.L01_ForLoop;

public class C01_ForLoop {
    //41 kere maaşallah print ediniz


    public static void main(String[] args) {
        //loop -> döngü, tekrarlanan kod blokları
        //   baş.      bitiş  değişim
        for (int i = 1; i <= 41; i++) {
            System.out.println(i + ". maaşallah");//41 kere yazdırılır
        }
        System.out.println("selam javacanlar bolca offer");//döngü dışı 1 kez yazdırılır

        // iki basamaklı tek sayıları yan yana yazdırınız

        for (int i = 11; i <= 99; i += 2) {
            System.out.print(i + " ");
        }
        for (int i = 10; i < 100; i++) {//clear code
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
        }
        for (int i = 0; i > 10; i++) {// şartı saglamayan -> false olan for body run olmaz
            // kod kırılarak sıradaki saırdan devam eder 28.satır
            System.out.println("selam javacanlar");
        }
       // for (int i=0; i>=0 ; i++){//sonsuz döngüye girer sürekli true olur
       //     System.out.println(i);
       // }

    }
}
