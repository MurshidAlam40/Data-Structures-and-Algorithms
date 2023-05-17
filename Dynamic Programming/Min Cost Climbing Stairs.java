import java.util.*;
import java.io.*;
class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] cost = new int[n];
        
        for(int i=0 ; i<n ; i++)
            cost[i] = sc.nextInt();
        
        Solution ob = new Solution();
        System.out.println(ob.minCostClimbingStairs(cost));
    }
}

class Solution {
    public int minCostClimbingStairs(int[] cost) {
        //Using Dyanamic programming
        int n = cost.length;

        int dp[] = new int[n];
        if(n == 1){
            return cost[0];
        }
        dp[0] = cost[0];
        dp[1] = cost[1];

        for(int i=2; i<n; i++){
            dp[i] = Math.min(dp[i-1], dp[i-2]) + cost[i];
        }
        return Math.min(dp[n-2], dp[n-1]);
    }
}
