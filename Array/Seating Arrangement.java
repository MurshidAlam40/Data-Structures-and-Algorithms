import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine().trim());
        int m = Integer.parseInt(in.readLine().trim());
        String s[]=in.readLine().trim().split(" ");
        int [] seats = new int[m];
        for(int i = 0; i < m; i++){
            seats[i] = Integer.parseInt(s[i]);
        }
        Solution obj = new Solution();
        boolean res = obj.is_possible_to_get_seats(n, m, seats);
        
        String _result_val = (res) ? "Yes" : "No";
        System.out.println(_result_val);
    }
}


class Solution {
    public static boolean is_possible_to_get_seats(int n, int m, int[] seats) {
        // code here
        if(n == 0)
            return true;
            
        if(m == 1){
            if(n == 1 && seats[0] == 0)
                return true;
            return false;
        }
        
        int count = 0;
        for(int i=0; i<m; i++){
            if(seats[i] == 0){
                if(i == 0){
                    if(seats[i+1] == 0){
                        count++;
                        seats[i] = 1;
                    }
                }
                else if(i == m-1){
                    if(seats[i-1] == 0){
                        count++;
                        seats[i] = 1;
                    }
                }
                else{
                    if(seats[i-1] == 0 && seats[i+1] == 0){
                        count++;
                        seats[i] = 1;
                    }
                }
            }
        }
        
        if(count >= n){
            return true;
        }
        return false;
        /*
        return count >= n;
        */
       
    }
}
