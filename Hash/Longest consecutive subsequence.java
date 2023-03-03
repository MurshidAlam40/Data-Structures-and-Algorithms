import java.io.*;
import java.util.*;
import java.lang.*;

class Main{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
		int a[] = new int[n];
		
		for(int i=0; i<n; i++){
			a[i] = sc.nextInt();
		}
	    System.out.println(new Solution().findLongestConseqSubseq(a, n));
    }
}

class Solution
{   
    // arr[] : the input array
    // N : size of the array arr[]
    
    //Function to return length of longest subsequence of consecutive integers.
	static int findLongestConseqSubseq(int arr[], int N)
	{
	    /*
	   // add your code here
        int[] arr2 = new int[1000001];
        int count = 0;
        int maximum = -1;
        int max = Integer.MIN_VALUE;
        
        for(int i=0; i<N; i++){
            arr2[arr[i]]++;
            maximum = Math.max(maximum, arr[i]);
        }
        for(int i=0; i<=maximum; i++) {
            if (arr2[i] >= 1){
               count++;
            }
            else{
               max = Math.max(max, count);
               count=0;
            }
            max = Math.max(max, count);
        }
        return max;
        */
        
        HashSet<Integer> set = new HashSet<>();
        int ans = 0;
        // Add all the array elements
        for(int i=0; i<N; i++){
            set.add(arr[i]);
        }
        // check each possible sequence from the start
        // then update optimal length
        for(int i=0; i<N; i++){
            // if current element is the starting
            // element of a sequence
            if(!set.contains(arr[i] - 1)){
                // Then check for next elements
                // in the sequence
                int j = arr[i];
                
                while(set.contains(j)){
                    set.remove(Integer.valueOf(j));
                    j++;
                }
                // update  optimal length if this
                // length is more
                if(ans < j-arr[i])
                    ans = j-arr[i];
            }
        }
        return ans;
        
	}
}
