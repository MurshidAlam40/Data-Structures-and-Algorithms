import java.io.*;
import java.util.*;
class Main{
    public static void main (String[] args){
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int val = sc.nextInt();
        int nums[] = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        Solution ob = new Solution();
        int ans = ob.removeElement(nums, val);
		System.out.println(ans);
		
		for(int i=0; i<ans; i++){
		    System.out.print(nums[i]+" ");
		}
    }
}

class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;

        for(int i=0; i<nums.length; i++){
            if(nums[i] != val){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
