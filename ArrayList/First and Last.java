import java.util.*;
class Main
{
	public static void main (String[] args)
	{
		Scanner read = new Scanner(System.in);
		int t = read.nextInt();
		for(int i=0; i<t; i++)
		{
		    ArrayList<Integer> a = new ArrayList<Integer>();
		    int n = read.nextInt();
		    for(int j=0; j<n; j++){
		        int ele = read.nextInt();
    		    a.add(ele);
		    }
		    // Update your code below this line to solve the problem
		    int ans = a.get(0) + a.get(n-1);
		    int j = 0;
		    
		    while(j < n-1){
		        int temp = a.get(j) + a.get(j+1);
		        
		        if(temp > ans){
		            ans = temp;
		        }
		        j++;
		    }
		    System.out.println(ans);
		}
	}
}
