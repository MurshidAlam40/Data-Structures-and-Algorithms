import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputLine;
        int n = Integer.parseInt(br.readLine().trim());
        int[] arr = new int[n];
        inputLine = br.readLine().trim().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(inputLine[i]);
        }

        new Solution().rearrange(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

class Solution {
    void rearrange(int arr[], int n) {
        // code here
        ArrayList<Integer> positive = new ArrayList<>();
        ArrayList<Integer> negative = new ArrayList<>();
        
        for(int i=0; i<n; i++){
            if(arr[i] >= 0)
                positive.add(arr[i]);
            else
                negative.add(arr[i]);
        }
        
        int i=0;
        int j=0;
        int index = 0;
        
        while(i<positive.size() && j<negative.size()){
            arr[index] = positive.get(i++);
            arr[index + 1] = negative.get(j++);
            
            index += 2;
        }
        
        while(i<positive.size()){
            arr[index++] = positive.get(i++);
        }
        
        while(j<negative.size()){
            arr[index++] = negative.get(j++);
        }
    }
}
