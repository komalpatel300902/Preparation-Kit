package Src.First;
/*
 * Solution of HackerRank Preparation kit. 
 */

import java.util.*;
class Result {
    
    public static List<Integer> countingSort(List<Integer> arr) {
        
        List<Integer> l = new ArrayList<>();
        int[] list = new int[100];
        for(int h : arr){
            list[h] = ++list[h];
        }
        for (int i = 0; i < 100; i++){
            l.add(list[i]);
        }
        return l ;
    }
}

public class CountingSort {
    /*
     * This block of code is provided by HackerRank.
     */
}
