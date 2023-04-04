import java.util.*;

public class SubarraysWithSumK{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[N];
        
        for(int i = 0; i<N; i++){
            arr[i] = sc.nextInt();
        }
        
        Solution ob = new Solution();
        System.out.println(ob.findSubArraySum(arr, N, k));
    }
}

class Solution
{
    static int findSubArraySum(int Arr[], int N, int k)
    {
        // code here
        /*
        //Brute force
        int count = 0;
        for(int i=0; i<N; i++){
            int sum = 0;
            for(int j=i; j<N; j++){
                sum += Arr[j];
                if(sum == k){
                    count++;
                }
            }
        }
        return count;
        */
        
        //Optimize solution
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        
        int sum = 0;
        int count = 0;
        
        for(int i=0; i<N; i++){
            sum += Arr[i];
            
            int removeSum = sum - k;
            
            if(map.containsKey(removeSum)){
                count += map.get(removeSum);
            }
            
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}
