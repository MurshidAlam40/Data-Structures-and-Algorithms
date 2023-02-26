import java.util.*;
class SlidingWindow{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int K = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0 ;i < n; i++){
			arr[i]=sc.nextInt();
		}
		
		Solution g = new Solution();
		g.printMax(arr , n,K);
	}
}

class Solution
{
	public static void printMax(int[] arr, int N, int K){
        /*
        //Brute force Method
        int max;
        
        for(int i=0; i<=N-K; i++){
            max = arr[i];
            for(int j=1; j<K; j++){
                if(arr[i+j] > max)
                    max = arr[i+j];
            }
            System.out.print(max+" ");
        }
        //T- O(N*K)
        //T- O(1)
        */
        
        //Using Deque Method: 
        
        Deque<Integer> dq = new LinkedList<Integer>();
        
        int i;
        for(i=0; i<K; i++){
            while(!dq.isEmpty() && arr[i] >= arr[dq.peekLast()]){
                dq.removeLast();
            }
            dq.addLast(i);
        }
        
        for( ; i<N; i++){
            
            System.out.print(arr[dq.peek()]+" ");
            
            while((!dq.isEmpty()) && dq.peek() <= i-K){
                dq.removeFirst();
            }
            
            while(!dq.isEmpty() && arr[i] >= arr[dq.peekLast()]){
                dq.removeLast();
            }
            dq.addLast(i);
        }
        System.out.print(arr[dq.peek()]+" ");
    }
}
// T- O(N)
// S - O(K)
