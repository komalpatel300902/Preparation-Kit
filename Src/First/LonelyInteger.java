package Src.First;
/*
 * Solution of Preparation Kit.
 */

import java.util.*;

public class LonelyInteger {
    /*
     * This block of code will be provided by HackerRank.
     */
}

class Result {

    public static int lonelyinteger(List<Integer> a) {
        HashMap<Integer,Integer> dict = new HashMap<>();
        for (int i : a){
            if(dict.get(i) == null){
                dict.put(i,1);
            }
            else{
                dict.remove(i);
            }
        }
        Set<Integer> s = dict.keySet();
        int elementHolder = 0;
        for (int l : s){
            elementHolder = l;
        }
        return elementHolder;
    }

}


