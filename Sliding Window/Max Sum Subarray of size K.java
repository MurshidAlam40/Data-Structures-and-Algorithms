import java.io.*;
import java.util.*;

class MaxSumSubarray
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
       
            
        int N=sc.nextInt();
        int K=sc.nextInt();
        ArrayList<Integer> Arr = new ArrayList<Integer>(N); 

        // Appending new elements at 
        // the end of the list 
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            Arr.add(x); 
        }

        Solution ob = new Solution();
        System.out.println(ob.maximumSumSubarray(K,Arr,N));
    }
}


class Solution{
    static long maximumSumSubarray(int K, ArrayList<Integer> Arr,int N){
        // code here
        //brute force
        /*
        long max = 0;
        
        for(int i=0; i<N-K+1; i++){
            long temp = 0;
            for(int j=i; j<i+K; j++){
               temp += Arr.get(j);
            }
            if(temp > max){
                max = temp;
            }
        }
        return max;
        */
        long max = 0;
        // Compute sum of first window of size k
        for(int i=0; i<K; i++){
            max += Arr.get(i);
        }
        
        long currSum = max;
        // Compute sums of remaining windows by
        for(int i=K; i<N; i++){
            // removing first element of previous
            // window and adding last element of 
            // current window.
            currSum += Arr.get(i) - Arr.get(i-K);
            //Update the max variable to store maximum
            max = Math.max(max, currSum);
        }
        return max;
        
    }
}
