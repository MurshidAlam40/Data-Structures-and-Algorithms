import java.util.*;
import java.lang.*;
import java.io.*;
class Solution {
    long minimizeSum(int N, int arr[]) {
        // code here
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        long sum = 0;
        //To add all element in min heap
        for(int i=0; i<N; i++){
            pq.add(arr[i]);
        }
        while(pq.size() != 1){
            //you can remove any two elements from the list, note their sum, and add the sum to the list
            int a = pq.remove();
            int b = pq.remove();
            int curr = a+b;
            pq.add(curr);
            sum += curr;
        }
        return sum;
    }
}

public class GFG
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int A[] = new int[n];

        for (int i = 0; i < n;i++)
        {
            A[i] = sc.nextInt();
        }
        Solution obj = new Solution();
        long ans = obj.minimizeSum(n, A);
        System.out.println(ans);
    }
}
