import java.util.*;
import java.io.*;

  public class validip {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            String s = sc.next();
            Solution obj = new Solution();

            if (obj.isValid(s))
                System.out.println("true");
            else
                System.out.println("false");
    }
}

class Solution {

    public boolean isValid(String s) {
        Set<String> allnums = new HashSet<>();
        
        for (int i = 0; i < 256; i++) {
            allnums.add(String.valueOf(i));
        }

        int dots = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '.')
                dots++;
        }
        if (dots != 3)
            return false;
        
        
        String[] nums = s.split("\\.");
        if (nums.length != 4)
            return false;

        for (String x : nums) {
            if (!allnums.contains(x))
                return false;
        }
        return true;
    }
}
