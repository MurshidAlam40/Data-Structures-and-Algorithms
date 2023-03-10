import java.io.*;
import java.util.*;

class Solution {
    Long maxTripletProduct(Long arr[], int n){
        // Complete the function
        // Brute force method
        /*
        long prod = 1;
        long maxProd = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                for(int k=j+1; k<n; k++){
                    prod = arr[i]*arr[j]*arr[k];
                    maxProd = Math.max(maxProd, prod);
                }
            }
        }
        return maxProd;
        */
        
        // Optimize Method
        
        
        // Sort the array in ascending order
        Arrays.sort(arr);
        //maximum of product of last three elements and 
        //product of first two elements and last element
        long maxProd = Math.max(arr[0]*arr[1]*arr[n-1], arr[n-1]*arr[n-2]*arr[n-3]);
        
        return maxProd;
    }
}


class Array {
    
    // Driver code
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		 Scanner sc = new Scanner(System.in);
		    
	    int sizeOfArray = sc.nextInt();
	    
	    Long[] arr = new Long[sizeOfArray];
	    
	    for(int i = 0;i<sizeOfArray;i++){
	        arr[i] = sc.nextLong();
	    }
	    
	    Solution obj = new Solution();
	    Long res = obj.maxTripletProduct(arr, sizeOfArray);
	    System.out.println(res);
		
	}
}
