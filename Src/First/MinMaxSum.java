package Src.First;
/*
 * Solution of HackerRank Question.
 */

import java.util.*;
class Result {

    public static void miniMaxSum(List<Integer> arr) {
        long min = 0;
        long max = 0;
        Collections.sort(arr);
        int size = arr.size();
        for(int i = 0; i<size; i++ ){
            if (i != 0){
                max += arr.get(i);
            }
            if (i != (size-1)){
                min += arr.get(i);
            }
        }
        System.out.print(min +" "+max);
    }

}

public class MinMaxSum {
    /*
     * This block of code is provided by HackerRank.
     */
}
