import java.util.*;

public class Main{
	public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		
        
        Solution ob = new Solution();
        System.out.println(ob.binaryAdd(n, s));
    }
}

class Solution{
    static String binaryAdd(int n, String s){
        // code here
        char ch[] = s.toCharArray();
        
        for(int i=ch.length-1; i>=0; i--){
           if(ch[i] == '0'){
               ch[i] = '1';
               s = String.valueOf(ch);
               return s;
           }
           
           else if( ch[i] == '1'){
               ch[i] ='0';
           }
        }
        s = String.valueOf(ch);
        return '1'+s;
    }
}
