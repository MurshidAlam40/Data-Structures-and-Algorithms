import java.util.*;

class ArrPathSum1
{
	// Driver Code
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int ar1[] = new int[m];
		int ar2[] = new int[n];
		for(int i=0; i<m; i++){
			ar1[i] = sc.nextInt();
		}
		for(int i=0; i<n; i++){
			ar2[i] = sc.nextInt();
		}
		
		Solution g = new Solution();
		System.out.println(g.maxPathSum(ar1,ar2));
	}
}
// } Driver Code Ends


class Solution
{
    /*You are required to complete this method
    * ar1 : 1st array
    * ar2 : 2nd array
    */
    int maxPathSum(int ar1[], int ar2[])
    {
        // Your code here
        // initialize indexes for ar1[] and ar2[]
        int i = 0, j = 0;
        // Initialize ans and current sum through ar1[] and ar2[].
        int ans = 0, sum1 = 0, sum2 = 0;
        // Below 3 loops are similar to merge in merge sort
        while (i < ar1.length && j < ar2.length) {
            // Add elements of ar1[] to sum1
            if (ar1[i] < ar2[j]){
                sum1 += ar1[i];
                i++;
            }
            // Add elements of ar2[] to sum2
            else if(ar1[i] > ar2[j]){
                sum2 += ar2[j];
                j++;
            }
            // we reached a common point ar1[i] == ar2[j]
            else{
                // Take the maximum of two sums and add to ans
                // Also add the common element of array, once
                ans += Math.max(sum1, sum2) + ar1[i];
                // Update sum1 and sum2 for elements after this intersection point
                sum1 = 0;
                sum2 = 0;
                // update i and j to move to next element of each array
                i++;
                j++;
            }
        }
        // Add remaining elements of ar1[]
        while (i < ar1.length){
            sum1 += ar1[i];
            i++;
        }
        // Add remaining elements of ar2[]
        while (j < ar2.length){
            sum2 += ar2[j];
            j++;
        }
        // Add maximum of two sums of remaining elements
        ans += Math.max(sum1, sum2);
  
        return ans;
        
    }
}
