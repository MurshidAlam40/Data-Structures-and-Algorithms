import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	public static void main(String[] args) throws IOException
	{
        BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));
    
        StringTokenizer stt = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(stt.nextToken());
        int k = Integer.parseInt(stt.nextToken());
        long a[] = new long[(int)(n)];
        String inputLine[] = br.readLine().trim().split(" ");
        for (int i = 0; i < n; i++) {
            a[i] = Long.parseLong(inputLine[i]);
        }
        
        Solution obj = new Solution();
        System.out.println(obj.maximizeSum(a, n, k));
	}
}


class Solution {

    public static long maximizeSum(long a[], int n, int k)
    {
        // Your code goes here
        // Sorting given array 
        Arrays.sort(a);
        int sum = 0;
        
        for (int i=0; i<n; i++) {
            // If we find a 0 in our sorted array, we stop
            if (a[i] < 0 && k > 0){
                a[i] = -a[i];
                k = k-1;
            }
            else
                break;
        }
        
        Arrays.sort(a);
        if(k > 0){
            if(k % 2 != 0)
                a[0] = a[0]* (-1);
        }
  
        // Calculating sum
        for (int j=0; j<a.length; j++)
            sum += a[j];
        return sum;
    }
}
