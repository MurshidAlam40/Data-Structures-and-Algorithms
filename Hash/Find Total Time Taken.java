import java.io.*;
import java.util.*;
class Main{
    public static void main (String[] args){
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a[]=new int[n];
        
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
       
        int time[]=new int[n];
        for(int i=0;i<n;i++){
            time[i]=sc.nextInt();
        }
        
        Solution ob=new Solution();
        long ans=ob.totalTime(n,a,time);
        System.out.println(ans);
    }
}

class Solution
{
    public static long totalTime(int n,int arr[],int time[])
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        long ans = -1;
        
        for(int i=0; i<n; i++){
            ans++;
            if(map.get(arr[i]) != null){
                ans += time[arr[i] - 1];
                ans--;
            }
            
            map.put(arr[i], i+1);
        }
        return ans;
    }
}
