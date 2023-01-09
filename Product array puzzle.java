import java.io.*;
import java.util.*; 

class Question{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int[] array = new int[n];
    	for (int i=0; i<n ; i++ ) {
    		array[i] = sc.nextInt();
    	}
        Solution ob = new Solution();
        long[] ans = new long[n];
        ans = ob.productExceptSelf(array, n); 

       	for (int i = 0; i < n; i++) { 
			System.out.print(ans[i]+" ");
		} 
        System.out.println();
    } 
} 
  
class Solution 
{ 
	public static long[] productExceptSelf(int nums[], int n) 
	{ 
        // code here
        long left[] = new long[n];
        long right[] = new long[n];
        long prod[] = new long[n];
        
        left[0] = 1;
        right[n-1] = 1;
        
        for(int i=1; i<n; i++){
            left[i] = nums[i-1]*left[i-1];
        }
        for(int j=n-2; j>=0; j--){
            right[j] = nums[j+1]*right[j+1];
        }
        for(int i=0; i<n; i++){
            prod[i] = left[i]*right[i];
        }
        return prod;
	} 
} 
