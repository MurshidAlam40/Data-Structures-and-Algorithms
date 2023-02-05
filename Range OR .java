import java.io.*;
import java.util.*;
public class Main{
 
    
	public static void main (String[] args) throws IOException{
    
        Scanner sc = new Scanner(System.in);
           
            int n = sc.nextInt();
            
            System.out.println(new Solution().rangeOR(n));
    }
}

class Solution{
    public int rangeOR(int n){
        // Code here.
        int ans = 1;
        
        for(int i=0; i<=n; i++){
            ans = ans | i;
        }
        return ans;
        //second method
        /*
        return (1 << (int)(Math.log(n) / Math.log(2) + 1)) - 1;
        */
    }
}
