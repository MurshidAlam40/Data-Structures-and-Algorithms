import java.io.*;
import java.util.*;
import java.util.Map.Entry;

class Main {
	public static void main (String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		    
	    int n = sc.nextInt();
	    int arr[] = new int[n];
	    
	    for(int index = 0;index < n; index++){
	        arr[index] = sc.nextInt();
	    }
	    
	    Check obj = new Check();
	    
	    System.out.println(obj.firstNonRepeating(arr,n));
	
	}
}

class Check{
    
    public int firstNonRepeating(int arr[], int n) 
    { 
        // Complete the function
        /*
        for(int i=0; i<n; i++){
            int j;
            for(j=0; j<n; j++){
                if(i != j && arr[i] == arr[j])
                    break;
            }
            if(j == n)
                return arr[i];
        }
        return 0;
        */
        
        // Using Hashing:
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i=0; i<n; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i]) + 1);
            }
            else{
                map.put(arr[i], 1);
            }
        }
        //return first element with count 1.
        for(int i=0; i<n; i++){
            if(map.get(arr[i]) == 1)
                return arr[i];
        }
        return 0;
    }  
    
}
