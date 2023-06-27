import java.util.*;
import java.math.*;

class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();
        Solution g=new Solution();
        System.out.println(g.multiply(a,b));
    }
}

class Solution {
    public String multiply(String num1, String num2) {
        if(num1.equals("0") || num2.equals("0"))
            return "0";

        int n1 = num1.length();
        int n2 = num2.length();
        int ans[] = new int[n1+n2-1];

        for(int i=0; i<n1; i++){
            int digit1 = num1.charAt(i)-'0';
            for(int j=0; j<n2; j++){
                int digit2 = num2.charAt(j)-'0';
                ans[i+j] += digit1 * digit2;
            }
        }

        for(int i=ans.length-1; i>0; i--){
            int carry = ans[i]/10;
            ans[i-1] += carry;

            ans[i] = ans[i]%10;
        }

        StringBuilder sb = new StringBuilder();
        for(int n : ans){
            sb.append(n);
        }
        return sb.toString();
    }
}
