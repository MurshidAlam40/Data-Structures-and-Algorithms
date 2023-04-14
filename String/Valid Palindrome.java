import java.io.*;
import java.util.*;
class Main{
    public static void main (String[] args){
        
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
    
        Solution obj = new Solution();
        System.out.println(obj.isPalindrome(s));
        
    }
}

class Solution {
    public boolean isPalindrome(String s) {
        String str = s.toLowerCase();
        str = str.replaceAll("[^a-zA-Z0-9]", "");

        int i = 0;
        int j = str.length()-1;

        while(i < j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
