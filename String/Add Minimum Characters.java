import java.util.*;
import java.lang.*;
import java.io.*;

class Main{
    public static void main(String args[])throws IOException{
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Solution ob = new Solution();
        System.out.println(ob.addMinChar(str));
    }
}

class Solution{
	public static int addMinChar(String str){
		//code here
		int n = str.length();
		
		int i = 0 ; int j = n-1;
		int temp = n-1;
		
		while(i < j){
		    if(str.charAt(i) == str.charAt(j)){
		        i++;
		    }
		    else{
		        j = temp;
		        i = 0;
		        temp--;
		    }
		    j--;
		}
		return n-temp-1;
	}
}
