package Src.First;

/*
 * Solution of HackerRank.
 * This Result Class is to be Created.
 */

import java.util.*;
class Result {
    
    public static void plusMinus(List<Integer> arr) {
        int positive = 0;
        int negitive = 0;
        int zero = 0; 
        int size = arr.size();
        for(int x : arr ){
            if (x>0){positive++;}
            else if(x<0){negitive++;}
            else{zero++;}
        }
        System.out.println((double)positive/size);
        System.out.println((double)negitive/size);
        System.out.println((double)zero/size);
    }

}

public class PlusMinus {
    /*
     * This block is Give by HackerRank.
     */
}
