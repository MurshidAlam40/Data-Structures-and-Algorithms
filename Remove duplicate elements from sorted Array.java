import java.io.*;
import java.util.*;

public class GFG {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int a[] = new int[N];
        for(int i=0; i<N; i++)
            a[i] = sc.nextInt();

        Solution g = new Solution();
        int n = g.remove_duplicate(a,N);

        for(int i=0; i<n; i++)
            System.out.print(a[i]+" ");
        System.out.println();
    }
}

class Solution {
    int remove_duplicate(int A[],int N){
        // code here
        /*
        //if array is empty or contains a single element return N
        if(N==0 || N==1)
            return N;
        // Create Temp array
        int temp[] = new int[N];
        int j = 0;
        for(int i=0; i<N-1; i++){
        //If current element is not equal to next element then store that current element
            if(A[i] != A[i+1]){
                temp[j++] = A[i];
            }
        }
        //Store the last element as whether it is unique or repeated, it hasn't stored previously
        temp[j++] = A[N - 1];
        // Modify original array
        for(int i=0; i<N; i++){
            A[i] = temp[i];
        }
        return j;
        // T - O(N)
        // S - O(N)
        */
        
        if(N==0 || N==1)
            return N;
        //To store index of next unique element
        int j = 0;
        //Just maintaining another updated index
        for(int i=0; i<N-1; i++){
            if(A[i] != A[i+1])
                A[j++] = A[i];
        }
        A[j++] = A[N-1];
        
        return j;
        
        // T- O(N)
        // S - O(1)
    }
}
