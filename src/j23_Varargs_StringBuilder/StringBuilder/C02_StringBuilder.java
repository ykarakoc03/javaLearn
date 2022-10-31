package j23_Varargs_StringBuilder.StringBuilder;

public class C02_StringBuilder {
    public static void main(String[] args) {
        // StringBuilder obj create etme...
        // 1. yol
        StringBuilder sb1 = new StringBuilder();// default capacity 16 bit olan value'su olmayan  bos sb

        System.out.println("sb1.length() = " + sb1.length());//0 -> length(): sb 'deki karakter sayısı return eder

        System.out.println("sb1.capacity() = " + sb1.capacity());//16

        sb1.append("jAVATAR");//javatar sb1' eklendi
        System.out.println("sb1 = " + sb1);
        System.out.println("sb1.capacity() = " + sb1.capacity());//16

        sb1.append(" selam ").append("olsun").append(" ").append(24).append(" ").append(true);
        System.out.println("sb1 = " + sb1);// jAVATAR selam olsun24true
        System.out.println("sb1.capacity() = " + sb1.capacity());//34 -> capcity aşma durumunda yeni capacity : eski capacity * 2 + 2  -> 16*2+2 = 34 değeri atanır

        sb1.append(" basarı gayrete asıktır :)");
        System.out.println("sb1 = " + sb1);
        System.out.println("sb1.capacity() = " + sb1.capacity());//70 -> capcity aşma durumunda yeni capacity : eski capacity * 2 + 2  -> 34*2+2 =70 değeri atanır

        // 2. yol
        StringBuilder sb2 = new StringBuilder("Kevser hanıma selamlar");//ilk değer atamsı yapılmış sb1 STBuil obj
        System.out.println("sb2 = " + sb2);
        System.out.println("sb2.capacity() = " + sb2.capacity());//38-> 22 karakter ilk değer atamısnda olustu + 16 default hafız yeri atandı

        // trimToSize()->  fazladan ayrılan capcity silinir

        System.out.println("sb2.length() = " + sb2.length());
        sb2.trimToSize();
        System.out.println("sb2.capacity() = " + sb2.capacity());

        // 3. yol
        StringBuilder sb3 = new StringBuilder(11);//hafızada 11 karakterlik yer ayıran bos sb tanımlandı
        System.out.println("sb3.length() = " + sb3.length());//bos sb3 karakter sayısı =0
        System.out.println("sb3.capacity() = " + sb3.capacity());//11
        sb3.append("ebubekir bey");
        System.out.println("sb3.capacity() = " + sb3.capacity());//24


        //istenen bir character index'i alma
        System.out.println("sb1.charAt(12) = " + sb1.charAt(12));//m

        //Belirli aralıktaki character'leri alma
        System.out.println("sb1.subSequence(3,13) = " + sb1.subSequence(3, 13));//3.4.5...12 index karakterleri->ATAR selam
        System.out.println("sb1.substring(17) = " + sb1.substring(17));//17.18... 17 ve soan kadar tüm karakterler ->un 24 true basarı gayrete asıktır :)
        System.out.println("sb1.substring(3,13) = " + sb1.substring(3, 13));//3.4.5...12 index karakterleri->ATAR selam

        //belirli ir index'deki karakter silmek
        System.out.println("sb1.deleteCharAt(3) = " + sb1.deleteCharAt(3));//3.index A karakter silindi -> jAVTAR selam olsun 24 true basarı gayrete asıktır :)
        System.out.println("sb1.delete(3,7) = " + sb1.delete(3, 7));//3.4.5.6. index karakterler silindi->jAVselam olsun 24 true basarı gayrete asıktır :)
        System.out.println("sb1 = " + sb1);//jAVselam olsun 24 true basarı gayrete asıktır :)

        // istenen karakter veya karakterleri eklemek
        System.out.println("sb3 = " + sb3);
        System.out.println("sb3.insert(4,:)) = " + sb3.insert(4, ":)"));
        String s = "güzel insan";
        //  System.out.println("sb3.insert(9,s) = " + sb3.insert(9, s));
        System.out.println("sb3.insert(1,s,3,7) = " + sb3.insert(1, s, 3, 7));//eel ibub:)ekir bey->sb3 value!sini 1. index'ine s value'sinin 3,7 index eklendi

        StringBuilder sb4 = new StringBuilder("Nihan Hanım");
        System.out.println("sb4.insert(5,\"Qa team lead\",0,2) = " + sb4.insert(5, "Qa team lead", 0, 2));//NihanQa Hanım

        //istenen index'deki karakteri değiştirme..
        sb4.setCharAt(6, 'A');
        sb4.setCharAt(sb4.indexOf(" "), ':');
        System.out.println("sb4 = " + sb4);//NihanQA Hanım
        System.out.println("sb4.insert(6,\" \") = " + sb4.insert(5, " "));

        //istenen index'e karakter yerine birden cok karakter eklemek

        System.out.println("sb4.replace(8,10,\"hi\") = " + sb4.replace(8, 10, "hi"));

        //Sb obj String'e çevirme-> toString()

        System.out.println("sb3.toString().toUpperCase() = " + sb3.toString().toUpperCase());//EEL İBUB:)EKİR BEY->sb3 SB stringe cevirelerek toUppercase meth calıştı

//String ile StringBuilder karsilastirmasi


/*
Compare iki sb'i esit mi diye kontrol etmek icin
ilk harften baslayarak tum karakterleri karsilastirir
Ayni olan karakterler icin bir sey return etmezken
farkli olan ilk karakter icin ascii tablosuna gore kac deger geride veya ileride
oldugunu print eder
Tamamen ayni ise bize 0 return eder

bir sb ile bir String'i compare etmek istersek Java CTE verir
 */

        StringBuilder sb5=new StringBuilder("javaCAN");
        StringBuilder sb6=new StringBuilder("javaCAN");
        String  str1="javaCAN";
        System.out.println("sb5.compareTo(sb6) = " + sb5.compareTo(sb6));//0
        System.out.println("sb6.compareTo(new StringBuilder(str1)) = " + sb6.compareTo(new StringBuilder(str1)));//0
        // sb6.compareTo((str1)//CTE-> elam armut kıyası olamazzz

        System.out.println("sb6.equals(sb6) = " + sb6.equals(sb5));//false-> SB equals == gibi çalışır -> hem value hem de ref değere bakar
        System.out.println("sb6.equals(sb6) = " + sb6.equals(sb6));//true

        System.out.println("str1.equals(sb6.toString()) = " + str1.equals(sb6.toString()));//True


    }


}
