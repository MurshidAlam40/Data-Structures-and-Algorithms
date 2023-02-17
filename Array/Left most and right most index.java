import java.util.*;
import java.lang.*;
import java.io.*;

class pair  {  
    long first, second;  
    public pair(long first, long second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
}

class GFG {
	public static void main(String[] args) throws IOException
	{
	    Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long a[] = new long[(int)(n)];
        
        for(int i=0; i<n; i++){
            a[i] = sc.nextLong();
        } 
        
        long k = sc.nextLong();
        
        Solution obj = new Solution();
        pair ans = obj.indexes(a, k);
        if (ans.first == -1 && ans.second == -1)
            System.out.println(-1);
        else
            System.out.println(ans.first+" "+ans.second);
	}
}

class Solution {
    
    public pair indexes(long v[], long x)
    {
        // Your code goes here
        /*
        int index1 = -1;
        int index2 = -1;
        
        for(int i=0; i<v.length; i++){
            if(v[i] == x){
                index1 = i;
                break;
            }
        }
        
        for(int i=v.length-1; i>=0; i--){
            if(v[i] == x){
                index2 = i;
                break;
            }
        }
        pair p = new pair(index1, index2);
        return p;
        */
        ArrayList<Long> arr = new ArrayList<>();
        for(int i=0; i<v.length; i++){
            arr.add(v[i]);
        }
        
        long index1 = arr.indexOf(x);
        long index2 = arr.lastIndexOf(x);
        
        pair p = new pair(index1, index2);
        return p;
    }
}
