import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int ans[] = new Solve().getMoreAndLess(arr, n, x);
        System.out.println(ans[0] + " " + ans[1]);
    }
}




class Solve {
    int[] getMoreAndLess(int[] arr, int n, int x) {
        // code here
        int min = 0;
        int max = 0;
        //find the number of array elements more than or equal to X
        for(int i=0; i<n; i++){
            if(arr[i] >= x){
                max++;
            }
        }
        // find the number of array elements less than or equal to X. 
        for(int i=0; i<n; i++){
            if(arr[i] <= x){
                min++;
            }
        }
        
        int minMax[] = new int[2];
        minMax[0] = min;
        minMax[1] = max;
        
        return minMax;
    }
}
