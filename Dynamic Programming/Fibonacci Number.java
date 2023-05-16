import java.util.*;
import java.io.*;
class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Solution ob = new Solution();

        System.out.println(ob.fib(n));
    }
}

class Solution {
    public int fib(int n) {
        /*
        //Method 1 (Use recursion) 
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }

        return fib(n-1) + fib(n - 2);
        */

        //Method 2: (Use Dynamic Programming)
        
        int f[] = new int[n+2];
        f[0] = 0;
        f[1] = 1;

        for(int i=2; i<=n; i++){
            //Add the previous 2 numbers in the series and store it
            f[i] = f[i-1] + f[i-2];
        }
        return f[n];
    }
}
