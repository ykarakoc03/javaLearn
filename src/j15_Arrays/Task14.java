package j15_Arrays;

public class Task14 {
    public static void main(String[] args) {
        /*  TASK :
        Write a method which accepts  string as parameter and prints the sum of digits
        present in thr given string
        input :"ade1r4d3"
        output : 8
        trick : Use --> Character.isDigit()
                    --> Integer.valueOf()
         */
        String str = "ade1r4d3";

        String arr[] = str.replaceAll("\\D", "").split("");
        int topla = 0;
        for (int i = 0; i < arr.length; i++) {
            topla += Integer.valueOf(arr[i]);
        }
        System.out.println("toplam = " + topla);

        System.out.println("2.yol ");
    int toplama=0;
        for (int i = 0; i < str.length(); i++) {

            if (Character.isDigit(str.charAt(i))){
              toplama+=Integer.parseInt(String.valueOf(str.charAt(i)));
            }
        }
        System.out.println("2.yol sonuc :" + toplama);
    }




}

