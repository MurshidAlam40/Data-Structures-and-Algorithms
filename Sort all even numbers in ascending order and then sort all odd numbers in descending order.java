import java.util.*;

public class Array{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        long n = sc.nextLong();
        long a[] = new long[(int)(n)];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }
        
        Solution ob = new Solution();
        ob.sortIt(a, n);
        StringBuilder output = new StringBuilder();
        for(int i=0;i<n;i++)
        output.append(a[i]+" ");
        System.out.println(output);
    }
}

class Solution
{
    
    public void sortIt(long arr[], long n)
    {
        //code here.
        
        ArrayList<Long> al = new ArrayList<>();
        // Sort all numbers
        Arrays.sort(arr);
        // add all odd number in descending order
        for(int i=arr.length-1; i>=0 ; i--){
            if(arr[i]%2!=0){
                al.add(arr[i]);
            }
        }
        // add all even number in ascending order
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2==0){
                al.add(arr[i]);
            }
        }
        //copy element from ArrayList to Array
        for(int i=0; i<al.size(); i++){
            arr[i]=al.get(i); 
        }
    }
}
