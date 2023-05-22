import java.util.*;
import java.io.*;
class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int p[] = new int[N];
        
        for(int i=0; i<N; i++){
            p[i] = sc.nextInt();
        }
        
 	    Solution ob = new Solution();
	    System.out.println(ob.solve(N, p));
    }
}

class Solution {
    public static int solve(int N, int[] p) {
        // code here
        int temp[] = new int[N];
        Arrays.fill(temp, 0);
        
        for(int i=1; i<N; i++){
            temp[p[i]]++;
            temp[i]++;
        }
        
        int ans = 0;
        for(int x : temp){
            if(x == 1)
                ans++;
        }
        if(ans == N){
            return 0;
        }
        return N-1 - ans;
    }
}
        
