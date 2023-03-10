import java.io.*;
import java.util.*;


class Array {
    
    // Driver code
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		Scanner sc = new Scanner(System.in);
		    
	    int n = sc.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; ++i)
            arr[i] = sc.nextInt();

		System.out.println (new Solution().closestToZero (arr, n));
	
	}
}

class Solution
{
    public static int closestToZero (int arr[], int n)
    {
        // your code here
        //Sort the elements 
        Arrays.sort(arr);
         //if Array have only 1 elements than return twice of than element in array
        if(n < 2)
            return 2*arr[0];
        //If  All element are positive than return sum of first two element
        else if(arr[0] > 0)
            return arr[0]+arr[1];
        //If  All element are negative than return sum of last two element
        else if(arr[n-1] < 0)
            return arr[n-1] + arr[n-2];
        // if both +ve and -ve element in array    
        int start = 0;
        int end = n-1;
        int minSum = Integer.MAX_VALUE;
        
        while(start < end){
            int sum = arr[start] + arr[end];
            //Absolute distance from 0 is diffent from all pair find minimum sum
            if(Math.abs(sum) < Math.abs(minSum))
                minSum = sum;
            //Absolute distance from 0 is same from two differnt pair choose the positive sum
            if(Math.abs(sum) == Math.abs(minSum))
                minSum = Math.max(minSum, sum);
            // if sum is less than 0    
            if(sum < 0)
                start++;
            //if sum is greater than 0
            else
                end--;
        }
        return minSum;
    }
}
