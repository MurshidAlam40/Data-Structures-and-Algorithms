import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int k = in.nextInt();
        Solution ob = new Solution();
        System.out.println(ob.minValue(s,k));
    }
}


class Solution {
    int minValue(String s,int k) {
        // code here
        if(k>s.length()){
            return 0;
        }
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        int[] a = new int[map.size()];
        int i = 0;
        for(Map.Entry e : map.entrySet()){
            a[i] = (int)e.getValue();
            i++;
        }
        
        Arrays.sort(a);
        int j = a.length-1;
        
        while(k != 0){
            if(a[j] != 0){
                a[j]--;
                k--;
             }
             else{
                j--;
            }
            Arrays.sort(a);
        }
        
        int sum = 0;
        
        for(int l=0; l<a.length; l++){
            sum += a[l]*a[l];
        }
        return sum;
    }
}
