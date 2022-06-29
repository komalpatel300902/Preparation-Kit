package Src.First;
/*
 * Solution of HackerRank Preparatio Kit.
 */

 public class CaesarCipher {
    /*
     * This block of code will be Provided by HackerRank.
     */
}

class Result {

    public static String caesarCipher(String s, int k) {
        String result = "";
        for(int i = 0; i < s.length();i++){
            char c = s.charAt(i);

            if (Character.isUpperCase(c)){
                int ascii = (int) c;
                
                ascii = ((ascii) + k - 65)%26 + 65;
                result += Character.toString((char) ascii);  
            }
            
            else if(Character.isLowerCase(c)){
                int ascii = (int) c;
                ascii = ((ascii) + k - 97)%26 + 97;
                result += Character.toString((char) ascii);
                
            }
            else{
                result += Character.toString(c);
            }
            
        }
        return result;
    }

}


