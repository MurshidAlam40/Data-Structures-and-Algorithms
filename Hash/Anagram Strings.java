import java.io.*;
import java.util.*;
class Main{
    public static void main (String[] args){
        
        Scanner sc = new Scanner(System.in);
        String S1 = sc.nextLine();
        String S2 = sc.nextLine();
        Solution ob = new Solution();

        System.out.println(ob.areAnagram(S1, S2));
    }
}

class Solution {
    static int areAnagram(String S1, String S2) {
        // code here
        if(S1.length() != S2.length()){
            return 0;
        }
        
        char[] str1 = S1.toCharArray();
        char[] str2 = S2.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
      
        for(int i=0; i<str1.length; i++){
            if(str1[i] != str2[i]){
                return 0;
            }
        }
        return 1;
        /*
        if(S1.length() != S2.length()){
            return 0;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0; i<S1.length(); i++){
            char ch = S1.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for(int i=0; i<S2.length(); i++){
            char ch = S2.charAt(i);
            if(map.get(ch)!=null){
                if(map.get(ch)==1){
                    map.remove(ch);
                }
                else{
                    map.put(ch,map.get(ch)-1);
                }
            }
            else{
                return 0;
            }
        }
        return 1;
        */
    }
}
