package Src.First;
/*
 * Solution of HackerRank Preparation Kit.
 */
import java.util.*;
class Result {

    public static int diagonalDifference(List<List<Integer>> arr) {
    int diagonal1 = 0;
    int diagonal2 = 0;
    for (int x = 0;x < arr.size();x++){
        diagonal1 += arr.get(x).get(x);
        diagonal2 += arr.get(x).get(arr.size()-1-x);
    }
    return Math.abs(diagonal1 - diagonal2);
    
    }

}

public class DiagonalDifference {
       /*
        * This block of code is provided by HackerRank.
        */
}
