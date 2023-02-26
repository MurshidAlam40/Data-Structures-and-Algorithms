import java.util.*;
import java.io.*;
import java.lang.*;

class Main {
    public static void main(String args[]) {
        // taking input using class Scanner
        Scanner sc = new Scanner(System.in);
        // taking total number of elements
        int n = sc.nextInt();

        // taking size of subArrays
        int k = sc.nextInt();

        // Declaring and Intializing an array of size n
        int arr[] = new int[n];

        // adding all the elements to the array
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Calling the method max_of_subarrays of class solve
        // and storing the result in an ArrayList
        ArrayList<Integer> res = new Solution().max_of_subarrays(arr, n, k);

        // printing the elements of the ArrayList
        for (int i = 0; i < res.size(); i++)
            System.out.print(res.get(i) + " ");
        System.out.println();
    }
}
// } Driver Code Ends


class Solution {
    static ArrayList<Integer> max_of_subarrays(int arr[], int n, int k) {
        // Your code here
        
        // Create a ArrayList to store Max element
        ArrayList<Integer> ans = new ArrayList<>();
        // Create a Double Ended Queue, dq that will store indexes of array elements
        // The queue will store indexes of useful elements in every window and it will
        // maintain decreasing order of values
        Deque<Integer> dq = new LinkedList<>();
        /* Process first k (or first window)
        elements of array */
        int i;
        for(i=0; i<k; i++){
            // For every element, the previous smaller elements are useless so
            // remove them from dq
            while(!dq.isEmpty() && arr[i] >= arr[dq.peekLast()]){
                // Remove from rear
                dq.removeLast();
            }
            // Add new element at rear of queue
            dq.addLast(i);
        }
        // Process rest of the elements,
        // i.e., from arr[k] to arr[n-1]
        for( ; i<n; i++){
            // The element at the front of the queue is the largest element of
            // previous window, so add in arrayList
            ans.add(arr[dq.peek()]);
             // Remove the elements which
            // are out of this window
            while((!dq.isEmpty()) && dq.peek() <= i-k){
                dq.removeFirst();
            }
            // Remove all elements smaller than the currently
            // being added element (remove useless elements)
            while(!dq.isEmpty() && arr[i] >= arr[dq.peekLast()]){
                dq.removeLast();
            }
            // Add current element at the rear of dq
            dq.addLast(i);
        }
        // The element at the front of the queue is the largest element of
        // previous window, so add in arrayList
        ans.add(arr[dq.peek()]);
        
        return ans;
    }
}
