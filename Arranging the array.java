import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long a[] = new long[(int)(n)];
       
       
        for (int i = 0; i < n; i++) {
            a[i] = in.nextLong();
        }
        
        Compute obj = new Compute();
        obj.Rearrange(a, n);
        
        StringBuilder output = new StringBuilder();
        for(int i=0;i<n;i++)
            output.append(a[i]+" ");
        System.out.println(output);
    }
}


class Compute {
    
    public void Rearrange(long a[], long n)
    {
        // Your code goes here
        ArrayList<Long> pos = new ArrayList<>();
        ArrayList<Long> neg = new ArrayList<>();
        
        for(int i=0; i<n; i++){
            if(a[i]>=0)
                pos.add(a[i]);
            else
                neg.add(a[i]);
        }
        int j;
        for(j=0; j<neg.size(); j++){
            a[j] = neg.get(j);
        }
        for(int i=0; i<pos.size(); i++){
            a[j]=pos.get(i);
            j++;
        }
        return;
    }
}
