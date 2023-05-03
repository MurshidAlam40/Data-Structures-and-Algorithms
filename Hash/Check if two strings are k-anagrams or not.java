import java.io.*;
import java.util.*;
class Main{
    public static void main (String[] args){
        
        Scanner sc = new Scanner(System.in);
        //input a number n
  		String str1=sc.next();
		String str2=sc.next();
		int k=sc.nextInt();
        Solution ob = new Solution();
		if (ob.areKAnagrams(str1, str2, k) == true)
			System.out.println("1");
		else
			System.out.println("0");

    }
}

class Solution {
    boolean areKAnagrams(String s1, String s2, int k) {
        // code here
        if(s1.length() != s2.length()){
            return false;
        }
        
        Map<Character, Integer> map = new HashMap<>();
        
        for(int i=0; i<s1.length(); i++){
            char ch = s1.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        
        for(int i=0; i<s2.length(); i++){
            char ch = s2.charAt(i);
            if(map.getOrDefault(ch, 0) > 0){
                map.put(ch, map.getOrDefault(ch, 0) - 1);
            }
        }
        
        int count = 0;
        for(char ch : map.keySet()){
            count += map.get(ch);
        }
        
        if(count > k){
            return false;
        }
        return true;
    }
}
