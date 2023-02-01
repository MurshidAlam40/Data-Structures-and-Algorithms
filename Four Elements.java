import java.util.Arrays;
import java.util.Scanner;
class FindFourElements
{
	
    public static void main(String[] args) 
    {
		Scanner sc=new Scanner (System.in);
			FindFourElements findfour = new FindFourElements();
			int n=sc.nextInt();
			int[] A=new int[n];
			for(int i=0;i<n;i++)
				A[i]=sc.nextInt();
			int X =sc.nextInt();
			
			Compute ob = new Compute();
		    System.out.println(ob.find4Numbers(A, n, X)?1:0);
    }
}

class Compute
{
    boolean find4Numbers(int A[], int n, int X) 
    {
        Arrays.sort(A);

        for(int i=0; i<n-2; i++){
            for(int j=i+1; j<n-1; j++){
                int start = j+1;
                int end = n-1;

                while(end > start){
                    int sum = A[i] + A[j] + A[start] + A[end];
                    
                    if(sum == X)
                        return true;
                    else if(sum > X)
                        end--;
                    else
                        start++;
                }
            }
        }
        return false;
    }
}
