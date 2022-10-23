package j16_ArrayList.Task;

public class _12_array1 {

    /*
    dupicate() isminde bir method oluşturun.
    Parametresi int Array olmalı
    Return tipi boolean
    Eğer Array içinde çiftleme(yineleme) var ise true dönmeli.
    Eğer Array içinde çiftleme(yineleme) yok ise false dönmeli.
    
    Örnek1:
    Input: [1,2,3,1]
    Output: true

    Örnek 2:
    Input: [1,2,3,4]
    Output: false
         */

    public static void main(String[] args) {

     int[] arr = {1,2,3,4,};


        System.out.println("dupicate(arr) = " + dupicate(arr));

    }

    private static boolean dupicate(int[] arr) {
        boolean kontrol = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    //System.out.println(arr[i] +" "+ arr[j]);
                    kontrol = true;
                break;
                }
            }
        }

        return kontrol;
    }
}