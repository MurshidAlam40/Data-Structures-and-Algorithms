import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; ++i)
            arr[i] = sc.nextInt ();

		System.out.println (new Sol().search (arr, n));
    }
}


class Sol
{
    public static int search(int A[], int N)
    {
        // your code here
        int i = 0;
        int j = N-1;
        if(N == 1)
            return A[0];
            
        if(A[N-2] != A[N-1])
            return A[N-1];
        
        while(i < j){
            if(A[i] != A[i+1]){
                return A[i];
            }
            i = i+2;
        }
        return -1;
    }
}
