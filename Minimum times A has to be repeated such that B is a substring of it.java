import java.io.*;
import java.util.*;

class Main {
    public static void main(String args[]) throws IOException {
        Scanner read = new Scanner(System.in);
    
        String A = read.nextLine();
        String B = read.nextLine();

        Solution ob = new Solution();
        System.out.println(ob.minRepeats(A,B));
    }
}

class Solution {
    static int minRepeats(String A, String B) {
        // code here
        int count = 1;   
        String rept = A;

       
        while(rept.length() < B.length()){
            rept += A;
            count++;
        }
        if(rept.contains(B)){
            return count;
        }
        
        rept += A;
        if(rept.contains(B))
            return count+1;
        
        return -1;
    }
};
