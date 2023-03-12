
import java.util.*;
import java.io.*;


class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
       
        int n = sc.nextInt();
        
        int arr[] = new int[n];
        for(int i = 0; i<n; ++i){
            arr[i] = sc.nextInt();
        }
         int ans = new Solution().findSum(arr, n);
        System.out.println(ans);
      
    }
}



class Solution {
    int findSum(int arr[], int n) {
        // code here
        HashSet<Integer> map=new HashSet<>();

        int sum = 0;

        for(int i=0;i<n;i++){
            map.add(arr[i]);
        }
        
        for(Integer element : map){
            sum += element;
        }
        return sum;
    }
}
