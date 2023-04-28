import java.io.*;
import java.util.*;
class Main{
    public static void main (String[] args){
        
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

		System.out.println (new Solution().countBinarySubstrings(s));
    }
}


class Solution{
    public int countBinarySubstrings(String s) {
        int count = 0;
        int prev = 0;
        int curr = 1;
       
        for(int i = 1; i < s.length(); i++){
            if (s.charAt(i) == s.charAt(i-1)){
                curr++;
            }
            else {
                count += Math.min(curr, prev);
                prev = curr;
                curr = 1;
            }
        }
        return count + Math.min(curr, prev);
    }
}
