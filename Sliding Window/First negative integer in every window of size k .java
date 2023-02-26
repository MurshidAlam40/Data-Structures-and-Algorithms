import java.util.*;
class SlidingWindow{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
	
		long a[] = new long[(int)(n)];
		for(int i = 0 ;i < n; i++){
			a[i]=sc.nextLong();
		}
		
		int k = sc.nextInt();
            
        Compute obj = new Compute();
        long answer[] = obj.printFirstNegativeInteger(a, n, k);
        int sz = answer.length;
        
        StringBuilder output = new StringBuilder();
        for(int i=0;i<sz;i++)
            output.append(answer[i]+" ");
        System.out.println(output);
            
	}
}

class Compute {
    
    public long[] printFirstNegativeInteger(long A[], int N, int K)
    {
        ArrayList<Long> ans = new ArrayList<>();
        // A Double Ended Queue, dq that will
        // store indexes of useful array elements
        Deque<Long> dq = new LinkedList<>();
        
        int j = 0;
        int i = 0;
        
        while(j < N) {
            // Process first k (or first window)
            // elements of array
            if(j <= K - 1) {
                if(A[j] < 0)
                    dq.add(A[j]);
                    
                    if(j == K - 1) {
                        if(!dq.isEmpty() && dq.peek() < 0)
                            ans.add(dq.peek());
                        else
                            ans.add((long) 0);
                    }
                    j++;
            }
            else{
                if(!dq.isEmpty() && A[i] < 0)
                    dq.poll();
                
                if(A[j] < 0)
                    dq.add(A[j]);
                
                if(!dq.isEmpty() && dq.peek() < 0){
                    ans.add(dq.peek());
                }
                else{
                    ans.add((long) 0);
                }
                j++;
                i++;
            }
        }
        
        long arr[] = new long[ans.size()];
        
        for (int k=0; k<ans.size(); k++){
            arr[k] = ans.get(k);
        }
        
        return arr;
    }
}
