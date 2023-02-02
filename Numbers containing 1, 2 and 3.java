import java.io.*;
import java.util.*;
import java.awt.Point; 
import java.util.Arrays; 
import java.util.Vector; 
class Main {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		findAll();
		    int n=sc.nextInt();
		    int arr[]=new int[n];
		    for(int i=0;i<n;i++)
		    arr[i]=sc.nextInt();
		    
		    Arrays.sort(arr);
		    boolean flag=false;
		    for(int x:arr)
		    {
		        if(mp.containsKey(x))
		        {System.out.print(x+" ");flag=true;}
		    }
		    
		    if(flag==false)
		    System.out.print(-1);
		    System.out.println();
	}
	
	
    static HashMap<Integer,Integer>mp=new HashMap<>();
  
//Function to find all the numbers with only 1,2 and 3 in their digits.
public static void findAll()
{
    //Your code here
    for(int i=1; i<=1000000; i++){
        int j = i;
        boolean flag = true;
        while(j > 0){
            int rem = j%10;
            if(rem != 1 && rem != 2 && rem != 3){
                flag = false;
                break;
            }
            j = j/10;
        }
        if(flag == true)
            mp.put(i, 1);
    }
}
