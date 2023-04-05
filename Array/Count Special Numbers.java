//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);


        int N = sc.nextInt();

        int arr[] = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        Solution ob = new Solution();
        System.out.println(ob.countSpecialNumbers(N, arr));
    }
}

class Solution {
    public int countSpecialNumbers(int N, int arr[]) {
        // Code here
        /*
        //Broute force
        int count = 0;
        
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(i != j && arr[i] % arr[j] == 0){
                    count++;
                    break;
                }
            }
        }
        return count;
        */
        
        //using Sieve of Eratosthenes Method
        
        int max = arr[0];
        //find maximum element
        for(int i=0; i<N; i++){
            max = Math.max(max, arr[i]);
        }
        
        int count[] = new int[max+1];
        // To fill complete count array with 0
        Arrays.fill(count, 0);
        
        for(int i=0; i<N; i++){
            if(count[arr[i]] < 2){
                // Update all multiples of j greater than or
                // equal to the multiple of it numbers
                for(int j=arr[i]; j<=max; j+=arr[i]){
                    count[j]++;
                }
            }
        }
        
        int ans = 0;
        
        for(int x:arr){
            if(count[x] > 1)
                ans++;
        }
        return ans;
    }
}
