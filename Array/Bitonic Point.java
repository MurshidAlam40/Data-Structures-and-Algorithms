import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
	   
	    int n = sc.nextInt();
	    
	    int arr [] = new int[n];
	    
	    for(int i=0; i<n; i++){
	        arr[i] = sc.nextInt();
	    }

        int ans = new Solution().findMaximum(arr, n);
        System.out.println(ans);
    }
}



class Solution {
    int findMaximum(int[] arr, int n) {
        // code here
        /*
        Arrays.sort(arr);
        return arr[n-1];
        */
        /*
        int Max = arr[0];
        for(int i=0; i<n; i++){
            if(arr[i] > arr[0]){
                Max = Math.max(Max, arr[i]);
            }
        }
        return Max;
        */
        /*
        int Max = arr[0];
        for(int i=0; i<n; i++){
            if(arr[i] > Max){
                Max = arr[i];
            }
        }
        return Max;
        */
        int start = 0;
        int end = n-1;
        while(start < end){
            int mid = (start + end)/2;
            if(arr[mid] > arr[mid+1]){
                end = mid;
            }
            else{
                start = mid+1;
            }
        }
        return arr[start];
    }
}
