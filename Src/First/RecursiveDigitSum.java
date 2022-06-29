package Src.First;
/*
 * This is Solution of HackerRank Preparation Kit.
 */
import java.math.*;

public class RecursiveDigitSum {
    /*
     * This bolck of code is Provided by HackerRank.
     */
}

class Result {

    public static int superDigit(String n, int k) {
        BigInteger sum = BigInteger.valueOf(0);
        if (n.length() == 1){
            return Integer.parseInt(n);
        }
        for(int i = 0; i < n.length();i++){
            BigInteger num = BigInteger.valueOf(Character.getNumericValue(n.charAt(i)));
            sum = sum.add(num);
        }
        sum = sum.multiply(BigInteger.valueOf(k));
        String newNumber = sum.toString();
        return superDigit(newNumber,1);

    }

}


