import java.util.*;
import java.io.*;
import java.util.HashMap;

class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        
        Solution g = new Solution();
        
        ArrayList<Integer> ans = g.countDistinct(a, n, k);

        for (Integer val: ans){
            System.out.print(val+" ");
        }
        System.out.println();
    }
}


class Solution
{
    ArrayList<Integer> countDistinct(int A[], int n, int k)
    {
        // code here
        // Creates an empty ArrayList list
        ArrayList<Integer> list = new ArrayList<>();
        // Creates an empty hashMap map
        HashMap<Integer, Integer> map = new HashMap<>();
        // Traverse the first window and store count
        // of every element in hash map
        for(int i=0; i<k; i++){
            map.put(A[i], map.getOrDefault(A[i], 0) + 1);
        }
        // add count of first window
        list.add(map.size());
        // Traverse through the remaining array
        for(int i=k; i<n; i++){
            // Remove first element of previous window
            // If there was only one occurrence
            if(map.get(A[i-k]) == 1){
                map.remove(A[i-k]);
            }
            // reduce count of the removed element
            else{
                map.put(A[i-k], map.get(A[i-k]) - 1);
            }
            // Add new element of current window
            // If this element appears first time,
            // set its count as 1,
            map.put(A[i], map.getOrDefault(A[i], 0) + 1);
            // add count of current window
            list.add(map.size());
        }
        return list;
    }
}

