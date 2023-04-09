import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int arr[] = new int[n];
	    
	    for(int i=0; i<n; i++){
	        arr[i] = sc.nextInt();
	    }
	    
	    System.out.println(problemWithDifficulty(arr, n));
}
	
	static int problemWithDifficulty(int arr[], int n){
	    
	    int count = 0;
	    
	    for(int i=0; i<n; i++){
	        if(arr[i] >= 1000)
	            count++;
	    }
	    return count;
	}
}
