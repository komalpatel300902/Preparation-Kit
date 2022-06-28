package Src.First;
import java.util.ArrayList;
import java.util.Scanner;
public class QueueHackerRank {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String[] cmd;
        String instruction ;
        String element;
        int n = sc.nextInt();
        sc.nextLine();
        for(int m = 0; m < n; m++){
       
            cmd = sc.nextLine().split(" ");
            instruction = cmd[0];
            
            
            if(instruction.equals("1")){
                element = cmd[1];
                array.add(element);
            }
            else if(instruction.equals("2")){
                array.remove(0);
                
            }
            else if(instruction.equals("3")){
                
                System.out.println(array.get(0));
                
                
            }
        }
        sc.close();
    }
}
