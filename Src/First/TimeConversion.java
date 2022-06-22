package Src.First;

class Result {

    public static String timeConversion(String s) {
        int size = s.length();
        String tail = s.substring(size-2,size);
        String body = s.substring(2,size-2);
        String head = s.substring(0,2);
        if(tail.equals("AM")){
            if(head.equals("12")){
                return ("00"+body);
            }
            else{
                return (head+body);
            }
            
        }
        else if(tail.equals("PM")){
            if(head.equals("12")){
                return (head+body);
            }
            else{
                Integer y = 12+ Integer.parseInt(head);
                String result = y.toString()+body;
                return result;
            }
        }
        
    return "";
    }

}


public class TimeConversion {
    /*
     * This block of code will be provided by HackerRank.
     */
}
