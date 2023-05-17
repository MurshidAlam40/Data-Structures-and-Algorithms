import java.util.*;
import java.io.*;
class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
 	    Solution ob = new Solution();
	    System.out.println(ob.uniquePaths(m, n));
    }
}

class Solution {
    public int uniquePaths(int m, int n) {
        /*
        //Using Recursion:
        if(m == 1 || n == 1){
            return 1;
        }

        return uniquePaths(m-1, n) + uniquePaths(m, n-1);
              // + uniquePaths(m-1, n-1); //If diagonal movements are allowed

        */
        // Using Dynamic Programming
        int dp[][] = new int[m][n];
        //Set value of dp[i][0] equal to 1
        for(int i=0; i<m; i++){
            dp[i][0] = 1;
        }
        //Set value of dp[0][j] equal to 1
        for(int j=0; j<n; j++){
            dp[0][j] = 1;
        }
        //// Calculate count of paths
        for(int i=1; i<m; i++){
            for(int j=1; j<n; j++){
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
                    //+ dp[i-1][j-1] // If diagonal movements are allowed
            }
        }
        return dp[m-1][n-1];
    }
}
