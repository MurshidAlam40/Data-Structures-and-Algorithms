//{ Driver Code Starts
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
	    
	    Solution ob=new Solution();
        long ans[]=ob.smallerSum(n,arr);
        for(long i:ans){
            System.out.print(i+" ");
        }
        System.out.println();
	}
}


class Solution
{
    public long[] smallerSum(int n,int arr[])
    {
        long ans[] = new long[n];
        long sum[] = new long[n];
        int temp[] = new int[n];
        for(int i=0; i<n; i++){
            temp[i] = arr[i];
        }
        
        Arrays.sort(temp);
        sum[0] = temp[0];
        for(int i=1; i<n; i++){
            sum[i] = sum[i-1] + temp[i];
        }
        
        for(int i=0; i<n; i++){
            int index = BinarySearch(arr[i], temp, n);
            ans[i] = sum[index] - arr[i];
        }
        return ans;
    }
    
    static int BinarySearch(int key, int []temp, int n){
        int low = 0,high = n-1,mid = 0,index = -1;
        
        while(low <= high){
            mid = (low + high)/2;
            if(temp[mid] == key){
                index = mid;
                high = mid-1;
            }
            else if(temp[mid] > key)
                high = mid-1;
            else
                low = mid+1;
        }
        return index;
    }
}
