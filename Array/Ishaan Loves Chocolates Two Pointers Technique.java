import java.io.*;
import java.util.*;

class Chocolates{
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
        Solution obj = new Solution();
        int res = obj.chocolates(n, arr);
        
        System.out.println(res);
    }
}

class Solution {
    public static int chocolates(int n, int[] arr) {
        // code here
        /*
        int min = arr[0];
        for(int i=0; i<n; i++){
            if(arr[i] < min)
                min = arr[i];
        }
        return min;
        */
        // using two pointer
        
        int i = 0;
        int j = n-1;
        while(i < j){
            if(arr[i] < arr[j])
                j--;
            else
                i++;
        }
        return arr[i];
    }
}
        
