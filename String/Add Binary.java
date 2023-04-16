import java.util.*;

public class Main{
	public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		
        
        Solution obj = new Solution();
		System.out.println(obj.addBinary(a, b));
    }
}

class Solution{
    
    public static String addBinary(String a, String b){
        StringBuilder sb = new StringBuilder();
        int i = a.length()-1;
        int j = b.length()-1;
        int carry = 0;
        int sum = 0;

        while(i>=0 || j>=0 || carry != 0){
            sum = carry;
            if(i>=0)
                sum += a.charAt(i)-'0';
            if(j>=0)
                sum += b.charAt(j)-'0';

            sb.append(sum%2);
            carry = sum/2;

            i--;
            j--;
        }

        return sb.reverse().toString();
    }
}
