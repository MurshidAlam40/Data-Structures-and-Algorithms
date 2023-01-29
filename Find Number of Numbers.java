import java.util.*;
class Numbers{
public static void main(String[] args)
    {
    	Scanner sc=new Scanner(System.in);
    		int n=sc.nextInt();
    		int[] a=new int[n];
    		for(int i = 0; i < n; i++)
    		{
    			a[i]=sc.nextInt();
    		}
    		int k=sc.nextInt();
    		GfG g=new GfG();
    		System.out.println(g.num(a,n,k));
    }
}

/*Complete the Function below*/
class GfG
{
    public static int num(int a[], int n, int k)
    {
        //Your code here
        String s=Arrays.toString(a);
        String value = String.valueOf(k);
        char c =value.charAt(0);
        int count=0;
        
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)==c){
                count++;
            }
        }
        return count;
    }
}
