package Src.First;
/*
 * Solution of HackerRank Preraration Kit. 
 */

import java.util.ArrayList;
import java.util.Scanner;

public class MeargingTwoSortedList{
    public static void main(String[] args) {
        ArrayList<Integer> array1 = new ArrayList<>();
        ArrayList<Integer> array2 = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int a ,b;
        int inp;
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            array1.clear();
            array2.clear();
            a = sc.nextInt();
            for(int t = 0; t< a;t++){
                inp = sc.nextInt();
                array1.add(inp);
            }
            b = sc.nextInt();
            for(int h = 0; h< b;h++){
                inp = sc.nextInt();
                array2.add(inp);
            }
            for (int e = 0; e<array1.size();e++){
                for (int j = 0; j< array2.size();j++){
                    if(array1.get(e) <= array2.get(j)){
                        array2.add(j,array1.get(e));
                        break;
                    }
                    if(array1.get(e) > array2.get(array2.size()-1)){
                        array2.add(array1.get(e));
                        break;
                    }
                }
            }
            for (int r : array2){
                System.out.print(r + " ");
            }
            System.out.println();
            
        }
        sc.close();
    }
}