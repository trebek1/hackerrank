import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt(); 
        
        // move through newline char
        sc.nextLine();
        // create a list --> linked list for storage 
        List<Integer> list = new LinkedList<Integer>(); 
        // iterate through elements and add them to the list 
        for(int i = 0; i<n; i++){
            int el = sc.nextInt(); 
            list.add(el); 
        }
        // move through newline char
        sc.nextLine(); 
        int k = sc.nextInt(); 
        sc.nextLine();
        for(int i = 0; i<k; i++){
            String s = sc.nextLine(); 
            if(s.equals("Insert")){
                int indexToInsert = sc.nextInt(); 
                int valueToInsert = sc.nextInt();
                list.add(indexToInsert, valueToInsert);
            }else{
                // must be delete 
                int indexToDelete = sc.nextInt(); 
                list.remove(indexToDelete); 
            }
            try{
                sc.nextLine(); // remove /n                 
            }catch(Exception e){
                
            }
        }
        
        // print out list 
        String answer = ""; 
        for(int i = 0; i<list.size(); i++){
            if(i != list.size() - 1){
                answer += list.get(i);
                answer += " "; 
            }else{
                answer += list.get(i);
            }
        }
        System.out.println(answer); 
    }
}


