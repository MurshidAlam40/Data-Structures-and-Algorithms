import java.io.*;
import java.util.*;
class Main{
    public static void main (String[] args){
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int i=0 ; i<N ; i++)
            arr.add(sc.nextInt());
        
        Solution ob = new Solution();
        ArrayList<Integer> res = ob.increment(arr,N);
        
        for(int i=0; i<res.size(); i++){
            System.out.print(res.get(i) + " ");
        }
        System.out.println();
    }
}


class Solution {
    static ArrayList<Integer> increment(ArrayList<Integer> arr , int N) {
        // code here
        
        for(int i=N-1; i>=0; i--){
            if(arr.get(i) != 9){
                arr.set(i, arr.get(i)+1);
                 break;
            }
            else{
                arr.set(i, 0);
            }
        }
        
        if(arr.get(0) == 0){
            ArrayList<Integer> ans = new ArrayList<>();
            ans.add(1);
            
            for(int i=0; i<N; i++){
                ans.add(arr.get(i));
            }
            return ans;
        }
        return arr;
    }
};
