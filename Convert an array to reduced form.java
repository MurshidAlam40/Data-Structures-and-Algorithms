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

        new Solution().convert(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}


class Solution {
    void convert(int[] arr, int n) {
        //Code here
        
        // Sort the array
        int temp[] = new int[n];
        for(int i=0; i<n; i++){
            temp[i] = arr[i];
        }
        Arrays.sort(temp);
        
        //Insert sorted array with index in Map
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i<n; i++){
            map.put(temp[i], i);
        }
        //Traverse each and every given array element and
        //find its index in sorted array
        for(int i=0; i<n; i++){
            arr[i] = map.get(arr[i]);
        }
    }
}
