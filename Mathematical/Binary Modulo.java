import java.util.*;
import java.io.*;
import java.lang.*;

class elements{
    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] str = br.readLine().trim().split(" ");
        String s = str[0];
		int m = Integer.parseInt(str[1]);
		Solution obj = new Solution();
		System.out.println(obj.modulo(s,m));
    }
}


class Solution{
	int modulo(String s, int m) {
		//Write your code here
		int ans = 0;
		//base
		int b = 1;
		
		for(int i=s.length()-1; i>=0; i--){
		   if(s.charAt(i) == '1'){
		       ans += b;;
		   }
		   b = (b*2)%m;
		}
		
		return ans%m;
	}
}
