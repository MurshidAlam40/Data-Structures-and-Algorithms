import java.io.*;
import java.util.*;

class Substring {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
    
        String s = sc.next();
        Solution ob = new Solution();
        System.out.println(ob.longestUniqueSubsttr(s));
    }
}


class Solution{
    int longestUniqueSubsttr(String S){
        //If the length of string is n, then there can be n*(n+1)/2 possible substrings
        HashMap<Character, Integer> map = new HashMap<>();
        //The algorithm starts with two pointers, start 
        //and i, which point to the beginning and end of a substring being examined.
        int start = 0;
        // intialize max
        int max = 0;
        // traverse using i pointer
        for(int i=0; i<S.length(); i++){
            // Store the current character in the variable ch.
            char ch = S.charAt(i);
            //Check if the HashMap contains the character ch.
            if(map.containsKey(ch)){
                //If the character is present in the HashMap
                //its index is greater than or equal to the current start pointer
                if(start <= map.get(ch)){
                   //move the start pointer to the next 
                   //index of the last occurrence of ch in the substring
                    start = map.get(ch)+1;
                }
            }
            //Add the current character and its index to the HashMap.
            map.put(ch, i);
            // Update the max variable to store the length of the longest substring
            max = Math.max(max, i-start+1);
        }
        return max;
    }
}
