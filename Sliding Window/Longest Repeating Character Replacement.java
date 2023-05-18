import java.util.*;
import java.io.*;
class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = sc.nextInt();
        
 	    Solution ob = new Solution();
	    System.out.println(ob.characterReplacement(s, k));
    }
}

class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int count[] = new int[26];
        int start = 0;
        int maxLength = 0;
        int maxCount = 0;

        for(int end=0; end<n; end++){
            count[s.charAt(end) - 'A']++;
            int currCount = count[s.charAt(end) - 'A'];
            maxCount = Math.max(maxCount, currCount);

            if(end - start + 1 - maxCount > k){
                count[s.charAt(start) - 'A']--;
                start++;
            }
            maxLength = Math.max(maxLength, end - start + 1);
        }
        return maxLength;
    }
}
