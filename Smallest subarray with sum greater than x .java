import java.util.*;
import java.io.*;

class Main {
	public static void main(String[] args) throws IOException
	{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[] = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        Solution obj = new Solution();
        System.out.println(obj.smallestSubWithSum(arr, n, m));
	}
}

class Solution {

    public static int smallestSubWithSum(int arr[], int n, int x) {
        // Your code goes here
        /*
        int minLen = n + 1;
 
        // Pick every element as starting point
        for (int i=0; i<n; i++)
        {
            // Initialize sum starting with current start
            int sum = arr[i];
 
            // If first element itself is greater
            if (sum > x)
                return 1;
 
            // Try different ending points for curremt start
            for (int j=i+1; j<n; j++)
            {
                // add last element to current sum
                sum += arr[j];
                if (sum > x && (j-i + 1) < minLen)
                    minLen = (j-i + 1);
            }
        }
        return minLen;
        
        */
        
        // Initialize current sum and minimum length
        int sum = 0, minLen = n + 1;
 
        // Initialize starting and ending indexes
        int i = 0, j = 0;
        while (j < n) {
            // Keep adding array elements while current sum is smaller than or equal to x
            while (sum <= x && j < n)
                sum += arr[j++];
 
            // If current sum becomes greater than x.
            while (sum > x && i < n) {
                // Update minimum length if needed
                if (j - i < minLen)
                    minLen = j - i;
 
                // remove starting elements
                sum -= arr[i++];
            }
        }
        return minLen;
    }
}

