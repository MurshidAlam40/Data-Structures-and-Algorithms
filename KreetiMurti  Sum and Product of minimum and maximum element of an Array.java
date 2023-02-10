import java.util.*;
 
class SumProduct{
    // Function to find minimum element
    static int findMin(int arr[], int n){
        int min = arr[0];
        
        for(int i=0; i<n; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
    // Function to find maximum element
    static int findMax(int arr[], int n){
        int max = arr[0];
        
        for(int i=0; i<n; i++){
            if(arr[i] > max)
                max = arr[i];
        }
        return max;
    }
    // Function to get Sum
    static int findSum(int arr[], int n){
        int min = findMin(arr, n);
        int max = findMax(arr, n);
        
        return min+max;
    }
    // Function to get product
    static int findProduct(int arr[], int n){
        int min = findMin(arr, n);
        int max = findMax(arr, n);
     
        return min*max;
    }
}

class SumSolution{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int arr[] = new int[n];
	    
	    for(int i=0; i<n; i++){
	        arr[i] = sc.nextInt();
	    }
	    
	    SumProduct obj = new SumProduct();
	    
        // Sum of min and max element
        System.out.println ("Sum = " + obj.findSum(arr, n));
 
        // Product of min and max element
        System.out.println( "Product = " + obj.findProduct(arr, n));
             
    }
}
