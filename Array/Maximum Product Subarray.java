import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
           
        int n = sc.nextInt();
        int[] arr = new int[n];
       
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
          
       System.out.println(new Solution().maxProduct(arr, n));
    }
}



class Solution {
    // Function to find maximum product subarray
    long maxProduct(int[] arr, int n) {
        // code here
        
        int index1 = 0;
        int index2 = 0;
        long ans = arr[0];
        for(int i=0; i<n; i++){
            long prod = arr[i];
            for(int j=i+1; j<n; j++){
                    ans = Math.max(ans, prod);
                    prod = prod * arr[j];
                    index1 = i;
                    index2 = j;
            }
            ans = Math.max(ans, prod);
        }
        System.out.println(index1+" "+index2);
        return ans;
        /*
        long max = arr[0];
        long min = arr[0];
        long currMax = arr[0];
       
        
        for(int i=1; i<n; i++){
            long temp = Math.max(Math.max(arr[i], arr[i]*max), arr[i]*min);
            
            min = Math.min(Math.min(arr[i], arr[i]*max), arr[i]*min);
            
            max = temp;
            currMax = Math.max(currMax, max);
        }
        return currMax;
        */
        
    }
}
