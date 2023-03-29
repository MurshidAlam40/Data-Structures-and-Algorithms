import java.io.*;
import java.util.*; 
class Main{
    public static void main(String args[]) throws IOException { 
        Scanner read = new Scanner(System.in);
   
        String S = read.nextLine();
        Solution ob = new Solution();
        int ans = ob.countSubstring(S);
        System.out.println(ans);
    } 
} 

class Solution 
{ 
    int countSubstring(String S) 
    { 
        // code here
        int ans = 0;
        //pick the start element
        for(int i=0; i<S.length(); i++){
            //count upper and lower
            int count = 0;
            //pick end element
            for(int j=i; j<S.length(); j++){
                //if jth element in lower case count++
                if(S.charAt(j) >= 'a' && S.charAt(j) <= 'z')
                    count++;
                else//if element in upper case
                    count--;
                //if upper - lower = 0 than update ans    
                if(count == 0)
                    ans++;
            }
        }
        return ans;
    }
} 
