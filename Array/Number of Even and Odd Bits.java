import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Solution sol = new Solution();
        int[] res = sol.evenOddBit(n);
        System.out.print(res[0]+" "+res[1]);
    }
}

class Solution {
    public int[] evenOddBit(int n) {
       
        // String bin = Integer.toBinaryString(n);
        
        int binary[] = new int[35];
        int k = 0;
        while(n > 0){
            binary[k] = n%2;
            n = n/2;
            k++;
        }
        
        int countEven = 0;
        int countOdd = 0;
        
        for(int i=binary.length-1; i>=0; i--){
            if(i%2 == 0 && binary[i] == 1)
                countEven++;
            else if(binary[i] == 1)
                countOdd++;
        }
        
        int ans[] = new int[2];
        ans[0] = countEven;
        ans[1] = countOdd;
        
        return ans;
    }
}
