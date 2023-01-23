import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args) {

        // Taking input using class Scanner
        Scanner sc = new Scanner(System.in);
        int n, m;

        // taking count of elements in array a
        n = sc.nextInt();

        // taking count of elements in array b
        m = sc.nextInt();

        // Creating 2 arrays of n and m
        int a[] = new int[n];
        int b[] = new int[m];

        // inserting elements to array a
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        // inserting elements to array b
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }
        Solution ob = new Solution();
        // calling NumberofElementsInIntersection method
        // and printing the result
        System.out.println(ob.NumberofElementsInIntersection(a, b, n, m));
    }
}


class Solution {
    // Function to return the count of the number of elements in
    // the intersection of two arrays.
    public static int NumberofElementsInIntersection(int a[], int b[], int n, int m) {
        // Your code here
        /*
        //brote force method
        int count = 0;
        
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(a[i] == b[j])
                    count++;
            }
        }
        return count;
        */
        /*
        int count = 0;
        int i = 0;
        int j = 0;
        Arrays.sort(a);
        Arrays.sort(b);
        while(i<n && j<m){
            if(a[i] > b[j]){
                j++;
                
            }
            else if(a[i] < b[j]){
                i++;
            }
            else{ //both are equal
                count++;
                i++;
                j++;
            }
        }
        return count;
        */
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for(int i=0; i<n; i++)
            set1.add(a[i]);
        for(int i=0; i<m; i++)
            set2.add(b[i]);
        set1.retainAll(set2);
        return set1.size();
    }
};
