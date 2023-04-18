import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.*;


public class Driver {
    
    public static void main(String[] args)throws IOException {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1 = br.readLine();
        String s2 = br.readLine();
        
        Solution obj = new Solution();
        
        boolean a = obj.areIsomorphic(s1,s2);
        if(a)
        System.out.println(1);
        else
        System.out.println(0);
    }
    
}

class Solution{
    //Function to check if two strings are isomorphic.
    public static boolean areIsomorphic(String str1,String str2){
        // Your code here
        HashMap<Character, Character> map = new HashMap<>();
        
        if(str1.length() != str2.length())
            return false;
            
        for(int i=0; i<str1.length(); i++){
            char c1 = str1.charAt(i);
            char c2 = str2.charAt(i);
            
            if(map.containsKey(c1)){
                if(map.get(c1) != c2)
                    return false;
            }
            
            else if(map.containsValue(c2))
                return false;
            
            else
                map.put(c1, c2);
        }
        return true;
    }
}
