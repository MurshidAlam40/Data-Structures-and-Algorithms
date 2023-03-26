import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
            String inputLine1[] = br.readLine().trim().split(" "); 
            int i=0;
            int N = Integer.parseInt(inputLine1[i++]);
            int leaves = Integer.parseInt(inputLine1[i++]);
            
            int frogs[] = new int[(int)(N)];
            
            String inputLine2[] = br.readLine().trim().split(" ");
            for ( i = 0; i < N; i++) {
                frogs[i] = Integer.parseInt(inputLine2[i]);
            }
        
            Solution ob = new Solution();
            System.out.println(ob.unvisitedLeaves(N, leaves, frogs));
	}
}

class Solution {
    public int unvisitedLeaves(int N, int leaves, int frogs[]) {
        // Code here
        //Brute force
        /*
        int vis[] = new int[leaves+1];
        for(int i=0; i<N; i++){
            int pos=frogs[i];
        
            int temp=pos;
            while(temp<=leaves){
                if(vis[temp]==0)
                vis[temp]=1;

                temp+=pos;
            }
        }
        
        int count=0;
        for(int i=1; i<leaves+1; i++){
            if(vis[i]==0)
            count++;
        }
        return count;
        */
        
        // Using Sieve algorithm
        int vis[] = new int[leaves+1];
        for(int i=0; i<N; i++){
            int pos=frogs[i];

            if(pos<=leaves && vis[pos]==0){
                int temp=pos;
                while(temp<=leaves){
                    if(vis[temp]==0)
                    vis[temp]=1;
                    temp+=pos;
                }
            }
        }
        
        int count=0;
        for(int i=1; i<leaves+1; i++)
        {
            if(vis[i]==0)
            count++;
        }
        return count;
    }
}
