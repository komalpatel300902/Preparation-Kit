package Src.First;
/*
 * Solution of HackerRank Preparation Kit.
 */

import java.util.*;

class Result {

    public static String gridChallenge(List<String> grid) {
        List<String> wordBag = new ArrayList<>();
        for(String s : grid){
            String[] charArray = s.split("");
            Arrays.sort(charArray);
            String word = "";
            for(int i = 0; i < charArray.length; i++){
                word += charArray[i];
            }
            wordBag.add(word);
        }
        char firstChar = 'a' ;
        for(String s : wordBag){
            firstChar = 'a';
            for(int i = 0; i <s.length(); i++ ){
                if((int)firstChar > (int)s.charAt(i)){
                    return "NO";
                }
                else{
                    firstChar = s.charAt(i);
                }
            }
        }
        
        int size = wordBag.get(0).length();
        for(int i = 0; i < size; i++){
            firstChar = 'a';
            for(String s : wordBag){
                if((int)firstChar > (int)s.charAt(i)){
                    return "NO";
                }
                else{
                    firstChar = s.charAt(i);
                }
            }
        }
        return "YES";

    }

}

public class GridChallange {
    /*
     * This block of code is given by HackerRank.
     */
}
