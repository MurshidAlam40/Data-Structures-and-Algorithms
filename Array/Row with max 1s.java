import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
           
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
       
        for(int i=0; i<n; i++){
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
          
        int ans = new Solution().rowWithMax1s(arr, n, m);
        System.out.println(ans);
    }
}



class Solution {
    int rowWithMax1s(int arr[][], int n, int m) {
        // code here
        /*
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(arr[j][i] == 1){
                    return j;
                }
            }
        }
        return -1;
        */
        int row = m-1;
        int col = 0;
        int maxCount = -1;
        
        while(row >= 0 && col < n){
            if(arr[col][row] == 1){
                maxCount = col;
                row--;
            }
            else{
                col++;
            }
        }
        return maxCount;
    }
}
