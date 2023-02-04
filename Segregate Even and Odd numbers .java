import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
       
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        new Solution().segregateEvenOdd(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}


class Solution {
    void segregateEvenOdd(int arr[], int n) {
        // code here
        Arrays.sort(arr);
        ArrayList<Integer> list= new ArrayList<>();

        for(int i =0; i<n; i++){
             if(arr[i]%2 == 0){
                 list.add(arr[i]);
             }
        }

        for(int i=0;i<n; i++){
            if(arr[i]%2 != 0){
                list.add(arr[i]);
            }
        }
        for(int i=0; i<n; i++){
            arr[i]=list.get(i);
        }
    }
}
