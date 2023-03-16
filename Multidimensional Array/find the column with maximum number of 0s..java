import java.util.*;

public class Array{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int arr[][] = new int[N][N];
        
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
              arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(new Solution().columnWithMaxZeros(arr,N));
    }
}

class Solution
{
    int columnWithMaxZeros(int arr[][], int N)
    {
        // code here
        int ans = 0;
        int max = Integer.MIN_VALUE;
        
        for(int col=0; col<N; col++){
            int count = 0;
            for(int row=0; row<N; row++){
                if(arr[row][col] == 0)
                    count++;
            }
            if(count > max){
                max = count;
                ans = col;
            }
        }
        return ans;
    }
}
