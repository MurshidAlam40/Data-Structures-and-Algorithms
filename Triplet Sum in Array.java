import java.util.*;
import java.io.*;
import java.lang.*;

class Main
{
    public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String inputLine[] = br.readLine().trim().split(" ");
    int n = Integer.parseInt(inputLine[0]);
    int X = Integer.parseInt(inputLine[1]);
    int A[] = new int[n];
    inputLine = br.readLine().trim().split(" ");
    for(int i=0; i<n; i++){
        A[i] = Integer.parseInt(inputLine[i]);
    }
    Solution ob=new Solution();
    boolean ans = ob.find3Numbers(A, n, X);
    System.out.println(ans?1:0);
	}
}
//User function Template for Java

class Solution
{
    //Function to find if there exists a triplet in the 
    //array A[] which sums up to X.
    public static boolean find3Numbers(int A[], int n, int X) { 
    
       // Your code Here
       /*
       //brute force method
       for(int i=0; i<n; i++){
           for(int j=i+1; j<n; j++){
               for(int k=j+1; k<n; k++){
                   if(A[i] + A[j] + A[k] == X){
                       return true;
                   }
               }
           }
       }
       return false;
       */
       //Optimize solution
       //Using the two-pointer technique.
       
       //Sort the given array.
       Arrays.sort(A);
       
       //Loop over the array and fix the first element of the possible triplet, arr[i].
        for(int i=0; i<n-2; i++){
           //Then fix two pointers, one at i + 1 and the other at n – 1. And look at the sum.
            int left = i+1; // index of the first element in the remaining elements
            int right = n-1; // index of the last element
           
            while(right > left){
                //if the sum of elements at two-pointer is equal to given sum then print the triplet.
                if(A[i] + A[left] + A[right] == X)
                    return true;
                //f the sum is smaller than the required sum, increment the first pointer.
                else if(A[i] + A[left] + A[right] < X)
                    left++;
                //Else, If the sum is bigger, Decrease the end pointer to reduce the sum.
                else //A[i] + A[left] + A[right] > X
                    right--;
           } 
       }
       return false;
    }
}
