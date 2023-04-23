import java.io.*;
import java.util.*;
import java.util.stream.*;

class Array{
    
	public static void main (String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int arr[] = new int[n];
	   
	    for(int i=0; i<n; i++){
	        arr[i] = sc.nextInt();
	    }
	    
	    Solution obj = new Solution();
        int res = obj.minimumNumber(n, arr);
        
        System.out.println(res);
            
	}
}


class Solution {
    public static int minimumNumber(int n, int[] arr) {
        // code here        
        int max = Integer.MAX_VALUE;
        
        for(int i=0; i<n; i++){
            max = Math.min(arr[i], max);
        }
        int gcd = max;
        for(int i=0; i<n; i++){
            int a = gcd, b = arr[i];
            while(a>0 && b>0){
                if(a < b)
                    b=b%a;
                else
                    a=a%b;
            }
            
            if(a == 0)
                gcd = b;
            else 
                gcd = a;
        }
        return gcd;
    }
}
        
