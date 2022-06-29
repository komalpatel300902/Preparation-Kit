package Src.First;
/*
 * Solution HackerRank Preparation kit.
 * Note : This answer is Correct But some test case did'nt pass because it ecxcedded the timeLimit.
 */
import java.util.*;


public class SimpleTextEditor {
    public static void main(String[] args) {
        Stack<String> history = new Stack<>();
        Scanner sc = new Scanner(System.in);
        String[] cmd;
        String instruction , element;
        int n = sc.nextInt();
        sc.nextLine();
        String result = "";
        int num;
        
        for(int i = 0; i < n; i++){
            
            cmd = sc.nextLine().split(" ");
            instruction = cmd[0];
            if(instruction.equals("1")){
                element = cmd[1];
                history.push(result);
                result = result + element;
            
            }
            else if(instruction.equals("2")){
                element = cmd[1];
                num = Integer.parseInt(element);
                history.push(result);
                result = result.substring(0,result.length()-num);
            }
            else if(instruction.equals("3")){
                element = cmd[1];
                num = Integer.parseInt(element);
                System.out.println(result.charAt(num-1));
            }
            else if(instruction.equals("4")){
                result = history.pop();
            }
        }
        sc.close();
    }
}
