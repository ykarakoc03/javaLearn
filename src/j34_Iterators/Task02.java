package j34_Iterators;

import java.util.*;

public class Task02 {
    public static void main(String[] args) {

/*  task2->
   Bir listedeki istenen sayi araliginda olmayan-> 20den kck 40 dan byk
   elementleri silip print eden code create ediniz
   (2. liste olusturmadan, gecerli liste uzerinde iterator ile islem yapiniz)
Orn : [2,13,56,23,45,14,40] istenen aralik 20 ile 40 arasi (sinirlar dahil)
output: [23,40]
    */
        List<Integer> list = new ArrayList<>(Arrays.asList(2,13,56,23,45,14,40));

        System.out.println(" list ilk hali :" + list);

        Scanner scanner = new Scanner(System.in);
        System.out.println("istenen araliktaki kucuk sayiyi giriniz");
        int kSayi=scanner.nextInt();
        System.out.println("istenen araliktaki buyuk sayiyi giriniz");
        int bSayi=scanner.nextInt();

        ListIterator<Integer> it1= list.listIterator();
        while (it1.hasNext()){
            int num= it1.next();
            if(!(num>=kSayi&&num<=bSayi)){
                it1.remove();
            }
        }

        System.out.println(" list istene aralik hali :" + list);


    }
}
