import java.io.*;
import java.util.*;
class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Solution ob = new Solution();
        int ans = ob.minOperation(s);
        System.out.println(ans);
       
    }
}


class Solution {
    int minOperation(String s) {
        // code here
        
        int n= s.length();
        if(n==1) return 1;

        int len=0;
        int count = n;
        while(len <= count){
            int mid = (len+count)/2 - 1;
            if(s.substring(0, mid+1).equals(s.substring(mid+1, 2*(mid+1))))
                return mid+1 + 1 + (n-2*(mid + 1));

            count--;
        }
        return n;
    }
}
