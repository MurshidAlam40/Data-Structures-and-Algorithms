import java.util.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
            int n = sc.nextInt();

            int[] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }

            Solution obj = new Solution();
            ArrayList<Integer> res = obj.makeBeautiful(arr);
            for(int e : res){ 
                System.out.print(e + " ");
            }
            System.out.println();
    }
}



class Solution {
    public static ArrayList<Integer> makeBeautiful(int[] arr) {
        // code here
        Stack<Integer> st = new Stack<>();
        
        for(int i=0; i<arr.length; i++){
            if(!st.isEmpty()){
                if((st.peek()>=0 && arr[i]<0) || (st.peek()<0 && arr[i]>=0)){
                st.pop();
                }
                else{
                    st.push(arr[i]);
                }
            }
            else{
                st.push(arr[i]);
            }
        }
        
        ArrayList<Integer> ans = new ArrayList<>();
        
        while(!st.isEmpty()){
            ans.add(st.peek());
            st.pop();
        }
        
        Collections.reverse(ans);
        
        return ans;
    }
}
