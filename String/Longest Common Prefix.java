import java.io.*;
import java.util.*;

class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String strs[] = new String[n];
		for(int i=0; i<n; i++){
		    strs[i] = sc.next();
		}
		Solution obj = new Solution();
		System.out.println(obj.longestCommonPrefix(strs));
	}
}

class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        if(n == 0)
            return "";

        Arrays.sort(strs);
        String str1 = strs[0];
        String str2 = strs[n-1];
        int index = 0;

        while(index < str1.length()){
            if(str1.charAt(index) == str2.charAt(index)){
                index++;
            }
            else{
                break;
            }
        }
        if(index == 0){
            return "";
        }
        return str1.substring(0, index);
    }
}
