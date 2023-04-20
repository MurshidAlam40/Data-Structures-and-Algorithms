import java.util.*;
 
public class Main{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String words[] = new String[n];
        
        for(int i=0; i<n; i++){
            words[i] = sc.next();
        }
        
        String target = sc.next();
        int startIndex = sc.nextInt();
        
        Solution obj = new Solution();
        
        System.out.println(obj.closetTarget(words, target, startIndex));
    }
}

class Solution {
    public int closetTarget(String[] words, String target, int startIndex) {
        int ans = Integer.MAX_VALUE;
        int n = words.length;
        for (int i=0; i<words.length; i++){
            if(target.equals(words[i])){
                int dist = Math.abs(i - startIndex);
                ans = Math.min(ans, dist);
                ans = Math.min(ans, n - dist);
            }
        }
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}
