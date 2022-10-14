package j00_Exercise.Day01;

import java.util.Arrays;

public class Q01_task01 {
    public static void main(String[] args) {


   String [] strs={"A","B"};
   int idx =0;
        for (String s:strs) {
            strs[idx].concat(" eleman"+idx);
            idx++;
            System.out.println(Arrays.toString(strs));
        }
        for (idx=0;idx< strs.length; idx++){
            System.out.println(strs[idx]);
        }
}
}