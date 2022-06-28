package Src.First;
/*
 * Solution of HackerRank Preparation Kit.
 */
import java.util.*;

class Result {

    public static String isBalanced(String s) {
        Stack<Integer> stacks = new Stack<>();
        Character c;
        int holder;
        for(int i = 0; i < s.length();i++){
            c = s.charAt(i);
            if(stacks.isEmpty() && (c.equals(']') || c.equals('}') || c.equals(')'))){
                return "NO";
            }
            if(s.length()%2 != 0){
                return "NO";
            }
            if(c.equals('(')){
                stacks.push(0);
            }
            else if(c.equals('[')){
                stacks.push(1);
            }
            else if(c.equals('{')){
                stacks.push(2);
            }
            if(!stacks.isEmpty()){
                if(c.equals(')')){
                    holder = stacks.pop();
                    if(holder != 0){
                        return "NO";
                    }
                }
                else if(c.equals(']')){
                    holder = stacks.pop();
                    if(holder != 1){
                        return "NO";
                    }
                }
                else if(c.equals('}')){
                    holder = stacks.pop();
                    if(holder != 2){
                        return "NO";
                    }
                }
            }
                
        }
        if(stacks.isEmpty()){
            return "YES";
        }
        else{
            return "NO";
        }

    }

}
public class BalancingBracket {
    /*
     * This block of Code will be provided by HackerRank.
     */
}
