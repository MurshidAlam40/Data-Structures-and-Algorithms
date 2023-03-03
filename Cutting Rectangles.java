import java.io.*;
import java.util.*;
import java.lang.*;

class Main{
    public static void main(String args[])throws IOException
    {
        Scanner read = new Scanner(System.in);
        long L = read.nextLong();
        long B = read.nextLong();

        Solution ob = new Solution();
        List<Long> ans = new ArrayList<Long>();
        ans = ob.minimumSquares(L, B);
        System.out.print(ans.get(0)+" ");
        System.out.println(ans.get(1));
    }
}

class Solution{
    static List<Long> minimumSquares(long L, long B)
    {
        // code here
        List<Long> list = new ArrayList<>();
        //find the dimension K of that square.
        long K = GCD(L, B);
        //minimum number (N) of identical squares of maximum side
        long N = (L*B)/(K*K);
        
        list.add(N);
        list.add(K);
        
        return list;
        
    }
    public static long GCD(long a, long b){
        if(b == 0)
            return a;
        
        return GCD(b, a%b);
    }
}
