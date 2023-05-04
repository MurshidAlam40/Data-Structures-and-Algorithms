import java.io.*;
import java.util.*;
class Main{
    public static void main (String[] args){
        
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine().trim();
        Solution ob = new Solution();
        if(ob.valid(S))
            System.out.println(1);
        else
            System.out.println(0);
    }
}

class Solution 
{ 
    boolean valid(String s) 
    { 
        // code here
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            // opening brackets
            if(ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            
            else { // closing brackets
                if(stack.isEmpty()){
                    return false;
                }
                else if( (ch == ')' && stack.peek() == '(')
                || (ch == '}' && stack.peek() == '{')
                || (ch == ']' && stack.peek() == '[')) {
                    stack.pop();
                }
                else {
                    return false;
                }
            }
        }
        if(stack.isEmpty())
            return true;
        else
            return false;
    }
} 
