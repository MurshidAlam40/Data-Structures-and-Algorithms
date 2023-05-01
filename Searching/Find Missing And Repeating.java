import java.io.*;
import java.util.*;
class Main{
    public static void main (String[] args){
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        int[] ans = new Solve().findTwoElement(a, n);
        System.out.println(ans[0] + " " + ans[1]);
    }
}



class Solve {
    int[] findTwoElement(int arr[], int n) {
        // code here
        int temp[] = new int[n];
        int missing = 0;
        int repeating = 0;
        //find Repeating element
        for(int i=0; i<n; i++){
            temp[arr[i] - 1]++;
            if(temp[arr[i] - 1] > 1){
                repeating = arr[i];
            }
        }
        //Find Missing element
        
        for(int i=0; i<n; i++){
            if(temp[i] == 0){
                missing = i+1;
            }
        }
        //return the ans in array
        int ans[] = new int[2];
        ans[0] = repeating;
        ans[1] = missing;
        
        return ans;
    }
}
