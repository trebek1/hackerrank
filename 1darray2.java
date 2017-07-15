import java.util.*;

public class Solution {
    public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.
        int pos = 0; 
        int len = game.length;
        int previous = 0; 
                
        while(pos + leap < len){
            // move all the way forward 
            if(game[pos + 1] == 0){
                pos++; 
                // if you cant move forward then leap
            }else if(game[pos + leap] == 0) {
                pos = pos + leap; 
                // otherwise try to go backward then leap 
            }else{
                if(pos == 0){
                    return false; 
                }
                // only do it if you are further along than before 
                if(pos > previous){
                    previous = pos; 
                    
                    for(int i = 0; i<leap; i++){
                        pos--; 
                        if(pos < 0){
                            return false; 
                        }
                        
                        // if you move back and you dont hit zero then continue 
                        if(game[pos] == 0){
                            // if you can leap from new position do it 
                            if(game[pos + leap] == 0){
                                pos = pos + leap; 
                                break; 
                            // if you cant jump to a zero and you are at starting position or its the last 
                            // instance in the loop return false 
                            }else if(game[pos + leap] != 0 && ((i == leap - 1) || pos == 0 )){
                                return false; 
                            }   
                        }else{
                            return false; 
                        }
                    }                    
                }else{
                    return false; 
                }
            }
        }
        return true; 
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}
