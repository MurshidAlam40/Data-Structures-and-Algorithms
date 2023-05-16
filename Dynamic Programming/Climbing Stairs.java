import java.util.*;
import java.io.*;
class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Solution ob = new Solution();

        System.out.println(ob.climbStairs(n));
    }
}

class Solution {
    public int climbStairs(int n) {
        /*
        if(n < 4){
            return n;
        }
        int a = 2;
        int b = 3;
        int c = 0;
        while(n>3){
            c = a+b;
            a = b;
            b = c;

            n--;
        }
        return c;
        */
        //Method 2: (Use Dynamic Programming)
        if(n <= 2){
            return n;
        }

        int dp[] = new int[n];
        dp[0] = 1;
        dp[1] = 2;

        for(int i=2; i<n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n-1];
    }
}
