import java.io.*;
import java.util.*;

  public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int key = sc.nextInt();
        Solution g = new Solution();
        System.out.println(g.binarysearch(arr, n, key));
    }
}


class Solution {
    int binarysearch(int arr[], int n, int k) {
        // code here
        int start = 0;
        int end = n-1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(arr[mid] == k){
                return mid;
            }
            else if(k > arr[mid]){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }
}
