import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
	   
	    int n = sc.nextInt();
	    
	    int a [] = new int[n];
	    
	    for(int i=0; i<n; i++){
	        a[i] = sc.nextInt();
	    }

        Solution obj = new Solution();
        obj.segregateElements(a, n);
        
        for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");
        
        System.out.println();
    }
}



class Solution {
    
    public void segregateElements(int arr[], int n)
    {
        // Your code goes here
        int temp[] = new int[n];
        int j = 0;
        for(int i=0; i<n; i++){
            if(arr[i] >= 0){
                temp[j] = arr[i];
                j++;
            }
        }
        
        for(int i=0; i<n; i++){
            if(arr[i] < 0){
                temp[j] = arr[i];
                j++;
            }
        }
        
        for(int i=0; i<n; i++){
                arr[i] = temp[i];
        }
    }
}
