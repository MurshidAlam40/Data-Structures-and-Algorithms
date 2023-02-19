import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
           
        int n = sc.nextInt();
        
        int[] arr = new int[n];
       
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(new Solution().maxIndexDiff(arr, n));        
    }
}



class Solution {

    int maxIndexDiff(int arr[], int n) {
        // code here
        /*
        int ans = 0;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i] <= arr[j]){
                    ans = Math.max(ans, j-i);
                }
            }
        }
        return ans;
        */
        
        int ans = 0;
        
        for(int i=0; i<n; i++){
            int j = n-1;
            while(i <= j){
                if(arr[i] <= arr[j]){
                    ans = Math.max(ans, j-i);
                    break;
                }
                j--;
            }
        }
        return ans;
    }
}
