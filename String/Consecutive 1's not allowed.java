import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        long ans = new Solution().countStrings(n);
        System.out.println(ans);
    }
}

class Solution {
    long countStrings(int n) {
        // code here
        //we can observe that the count is actually (n+2)’th Fibonacci number for n >= 1
        //n = 1, count = 2  = fib(3)
        //n = 2, count = 3  = fib(4).....
        //Using Fibonacci Numbers aproaches
        
        int a = 1;
        int b = 1;
        int sum = a+b;
        if(n==1)
            return sum;
        int mod = 1000000007;
         
        for(int i=2; i<=n; i++){
            sum = (a+b)%mod;
            b = a%mod;
            a = sum%mod;
        }
        return (a+b)%mod;
    }
}
