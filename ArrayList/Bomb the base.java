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
		    int x = read.nextInt();
		    for(int j=1; j<=n; j++){
		        int ele = read.nextInt();
    		    a.add(ele);
		    }
		    // Update the code below to solve the problem

            int attack = 0;
		    int j = 0;
		    
		    while(j < n){
		        if(a.get(j) < x){
		            attack = j+1;
		        }
		        j++;
		    }
		    System.out.println(attack);
		}
	}
}   
