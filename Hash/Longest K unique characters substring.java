import java.io.*;
import java.util.*;

class Substring {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
    
        String s = sc.next();
        int k = sc.nextInt();
        Solution obj = new Solution();
        System.out.println(obj.longestkSubstr(s, k));
    }
}


class Solution {
    public int longestkSubstr(String s, int k) {
        // code here
        //Method 1 (Brute Force) 
        /*
        //If the length of string is n, then there can be n*(n+1)/2 possible substrings
        int max = -1;
        //generate all the substring
        for(int i=0; i<s.length(); i++){
            for(int j=i+1; j<=s.length(); j++){
                //Take empty Hashset
                HashSet<Character> set = new HashSet<>();
                // Add longest subString in HashSet
                for(int m=i; m<j; m++){
                    set.add(s.charAt(m));
                }
               //check each one whether it has exactly k unique characters or not
                if(set.size() == k)
                    max = Math.max(max, j-i);
            }
        }
        return max;
        */
        // Method 2 (Linear Time) 
        /*
        //Take empty HashMap
        HashMap<Character, Integer> map = new HashMap<>();
        // Take two pointer i, j
        int i = 0;
        int j = 0;
        //intialize max = -1
        int max = -1;
        // Travese in String using j pointer
        while(j < s.length()){
            //add the element and their frequency
            map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0) + 1);
            // if map size is greater than k
            while(map.size() > k){
                //if frequency is more than 1 than reduce by 1
                map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) - 1);
                // if frequency is 1 than remove 
                if(map.get(s.charAt(i)) == 0){
                    map.remove(s.charAt(i));
                }
                i++;
            }
            //if size of map is equal to k update the max
            if(map.size() == k){
                max = Math.max(max, j-i+1);
            }
            j++;
        }
        return max;
        */
        //using for loop
        HashMap<Character, Integer> map = new HashMap<>();
        int max = -1;
        int j = 0;
        
        for(int i=0; i<s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
            
            while(map.size() > k){
                map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0) - 1);
                
                if(map.get(s.charAt(j)) == 0){
                    map.remove(s.charAt(j));
                }
                j++;
            }
            
            if(map.size() == k){
                max = Math.max(max, i-j+1);
            }
        }
        return max;
    }
}
