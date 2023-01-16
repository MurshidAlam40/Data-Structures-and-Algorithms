import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine().trim());
    String inputLine[] = br.readLine().trim().split(" ");
    long[] arr = new long[n];
    for(int i=0; i<n; i++)arr[i]=Long.parseLong(inputLine[i]);
    Solution ob = new Solution();
    long[] res = ob.nextLargerElement(arr, n);
    for (int i = 0; i < n; i++) 
        System.out.print(res[i] + " ");
    System.out.println();
	}
}




// } Driver Code Ends


// User Function Template for JAVA

class Solution{
    public static long[] nextLargerElement(long[] arr, int n) { 
        // Your code here
        //brute force aproach
        /*
        long ans[] = new long[n];
        //ans[n-1] = -1;
        Arrays.fill(ans, -1);
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[j] > arr[i]){
                    ans[i] = arr[j];
                    break;
                }
            }
        }
        return ans;
        */
        long ans[] = new long[n];
        Stack<Long> stack = new Stack<>();
        
        for(int i=n-1; i>=0; i--){
            // // Fetching the element at the head of the Stack
            while(!stack.isEmpty() && arr[i] > stack.peek()){
                stack.pop();
            }
            if(stack.isEmpty()){
                ans[i] = -1;
            }
            else{
                ans[i] = stack.peek();
            }
            stack.push(arr[i]);
        }
        return ans;
    } 
}
