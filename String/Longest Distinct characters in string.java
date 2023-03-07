import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException {
        Scanner br = new Scanner(System.in);
        String S = br.nextLine();
        
        Solution ob = new Solution();
        System.out.println(ob.longestSubstrDistinctChars(S));
    }
}

class Solution{
    static int longestSubstrDistinctChars(String S){
        // code here
        int n = S.length();
     
        // Result
        int ans = 0;
         
        for(int i = 0; i < n; i++){ 
            // Note : Default values in visited are false
            boolean[] visited = new boolean[256];
            for(int j = i; j < n; j++){   
                // If current character is visited Break the loop
                if (visited[S.charAt(j)] == true)
                    break;
                // Else update the result if
                // this window is larger, and mark
                // current character as visited.
                else{
                    ans = Math.max(ans, j - i + 1);
                    visited[S.charAt(j)] = true;
                }
            }
     
            // Remove the first character of previous
            // window
            visited[S.charAt(i)] = false;
        }
        return ans;
    }
}
