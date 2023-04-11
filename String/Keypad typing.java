import java.io.*;
import java.util.*;
class Main {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
	
	    String s=sc.nextLine();
	    
	    System.out.println(printNumber(s,s.length()));
	
	}

    //Function to find matching decimal representation of a string as on the keypad.
    public static String printNumber(String s, int n) 
    {
        //Your code here
        //method 1
        /*
        String ans = "";
        
        String num = "22233344455566677778889999";
        
        for(int i=0; i<n; i++){
            ans += num.charAt(s.charAt(i) - 'a');
        }
        
        return ans;
        */
        
        String ans = "";
        
        String num = "22233344455566677778889999";
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        
        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            int pos = alpha.indexOf(ch);
            ans += num.charAt(pos);
        }
        return ans;
    }
}
