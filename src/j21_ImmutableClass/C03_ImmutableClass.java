package j21_ImmutableClass;

import java.util.ArrayList;
import java.util.List;

public class C03_ImmutableClass {
    /*
  Boolean, Short, Integer, Long, Float, Double, Char ve String gibi tüm kapsayıcı sınıflar (Wrapper Class)
  BigDecimal, BigInteger java'da immutable sınıflara örnek olarak gösterilebilir.
        Date, StringBuilder, StringBuffer, Arrays ve ArrayList de Mutable (değişebilir) class'lardır.
 */
    public static void main(String[] args) {
        String name="Merve";
        System.out.println(name);//Merve
        name.concat(" Javacan");
        System.out.println("name = " + name);//merve-> String name variable meth sonrası aynı degerde kaldı ımmutable


        List<String> isimList =new ArrayList<>();//boş String listesi
        System.out.println("isimList = " + isimList);//[]

        isimList.add("Fatih");
        isimList.add("erkan");
        isimList.add("serhat");
        isimList.remove(1);
        isimList.set(1,"javacan");

        System.out.println("isimList = " + isimList);// [Fatih, javacan]-> list boş iken methodlar sonrası değişti :mutable ArrayList de Mutable (değişebilir


    }
}
