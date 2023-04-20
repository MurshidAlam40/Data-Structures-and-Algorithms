import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
    
        int n = Integer.parseInt(read.readLine());
        ArrayList<String> arr = new ArrayList<String>();
        String input[] = read.readLine().split(" ");
        
        for(int i = 0; i < n; i++){
            arr.add(input[i]);
        }
        String word1 = read.readLine();
        String word2 = read.readLine();
        
        Solution ob = new Solution();
        System.out.println(ob.shortestDistance(arr,word1,word2));
    }
}

class Solution {
    int shortestDistance(ArrayList<String> s, String word1, String word2) {
        // code here
        int startPos = Integer.MIN_VALUE;
        int lastPos = Integer.MIN_VALUE;
        int ans = Integer.MAX_VALUE;
        int dist = 0;
        
        for(int i=0; i<s.size(); i++){
            String str = s.get(i);
            if(str.equals(word1))
                startPos = i;
            
            if(str.equals(word2))
                lastPos = i;
        
            if(startPos >= 0 && lastPos >= 0){
                dist = (int)Math.abs(startPos - lastPos);
                ans = Math.min(dist, ans);
            }
        }
        
        if(ans == Integer.MAX_VALUE)
            return 0;
        else
            return ans;
    }
};
