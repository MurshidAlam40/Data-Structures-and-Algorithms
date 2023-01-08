import java.util.Scanner;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner br = new Scanner(System.in);
        int n = br.nextInt();
        int x = br.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = br.nextInt();
        }

        boolean ans = new Solution().hasArrayTwoCandidates(arr, n, x);
        System.out.println(ans ? "Yes" : "No");
    }
}
class Solution {
    boolean hasArrayTwoCandidates(int arr[], int n, int x) {
        // code here
        /*
        //brute force method
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i] + arr[j] == x)
                    return true;
            }
        }
        return false;
        */
        
        //Using Two Pointers Technique.............
        
        //sort the array in ascending order
        Arrays.sort(arr);
        //this pointer represent the first element
        int i = 0;
        //this pointer represent the last element
        int j = n - 1;
        
        while(i < j){
            //if we found the pair return true
            if(arr[i] + arr[j] == x)
                return true;
            /*If sum of elements at current
                pointers is less, we move towards
                higher values by doing i++ */
            else if(arr[i] + arr[j] < x)
                i++;
            /*If sum of elements at current
                pointers is more, we move towards
                lower values by doing j-- */
            else
                j--;
        }
        return false;
    }
}
