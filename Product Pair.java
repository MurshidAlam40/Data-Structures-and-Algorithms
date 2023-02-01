mport java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            long x = Long.parseLong(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            boolean ans = new Solution().isProduct(arr, n, x);
            System.out.println(ans ? "Yes" : "No");
    }
}

class Solution {
    boolean isProduct(int[] arr, int n, long x) {
        // code here
        HashSet<Long> hs = new HashSet<>();
        
        for(int i=0; i<n; i++){
            if(arr[i] != 0 && x%arr[i] == 0){
                if(hs.contains(x / arr[i]))
                    return true;
                else
                    hs.add(Long.valueOf(arr[i]));
            }
        }
        return false;
    }
}
