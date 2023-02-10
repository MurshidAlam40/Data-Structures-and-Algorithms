import java.util.*;
 //Pair with minimum product of subarray in an array
class MinimumProduct {
     
    // Function to find minimum product pair in arr[0..n-1]
    static void minProduct(int arr[], int n)
    {
        if (n < 2)
        {
            System.out.println("No pairs exists");
            return;
        }
      
        // Initialize min product pair
        int a = arr[0];
        int b = arr[1];
      
        // Traverse through every possible pair
        // and keep track of min product
        for (int i = 0; i < n-1; i++){
            if (arr[i] * arr[i+1] < a * b && arr[i] != 0){
                a = arr[i];
                b = arr[i+1];
            }
        }
        
        System.out.println("Min product pair is {" + a + ", " + b + "}");
        System.out.println("Minimum Product"+ a*b);  
    }
     
   
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int arr[] = new int[n];
	    
	    for(int i=0; i<n; i++){
	        arr[i] = sc.nextInt();
	    }
        minProduct(arr, n);
             
    }
}
