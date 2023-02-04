import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] arr = new int[n];
           
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int ans = new Solution().findMaxSum(arr, n);
            System.out.println(ans);
    }
}


class Solution {
    int findMaxSum(int arr[], int n) {
        // code here
        int maxSum = arr[0];
        int sum = 0;
        int newSum;
  
        for(int i=1; i<n; i++){
            newSum = Math.max(maxSum, sum);
            
            maxSum = sum + arr[i];
            sum = newSum;
        }
        return Math.max(maxSum, sum);
    }
}
