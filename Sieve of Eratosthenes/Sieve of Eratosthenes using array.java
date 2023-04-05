import java.io.*;
import java.util.*;

class Main
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
    
        int N=sc.nextInt();
        
        int primes[]  = sieveOfEratosthenes(N);
        for(int prime : primes) {
            System.out.print(prime+" ");
        }
        System.out.println();
    }
    
    static int[] sieveOfEratosthenes(int N){
        // code here
        
        boolean prime[] = new boolean[N+1];
        //// To fill complete prime array with true
        /*
        for(int i=0; i<N; i++){
            prime[i] = true;
        }
        */
        //or
        Arrays.fill(prime, true);
        
        for(int i=2; i*i<=N; i++){
            
            if(prime[i] == true){
                for(int j=2*i; j<=N; j+=i)
                    prime[j] = false;
            }
        }
        
        int ans[] = new int[N];
        
        for(int i=2; i<=N; i++){
            if(prime[i] == true)
                ans[i] = i;
        }
        
        return ans;
    }
}
