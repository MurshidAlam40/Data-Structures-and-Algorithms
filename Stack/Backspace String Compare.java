class Solution {
    public boolean backspaceCompare(String s, String t) {
    /*
        s = backSpace(s);
        t = backSpace(t);

        return s.equals(t);
    }
    static String backSpace(String str){
        StringBuilder ans = new StringBuilder();

        for(char ch : str.toCharArray()){
            if(ch != '#'){
                ans.append(ch);
            }
            else if(ans.length() > 0){
                ans.deleteCharAt(ans.length() - 1);
            }
        }
        return ans.toString();
        */
        Stack<Character> s1 = new Stack<>();
        Stack<Character> t1 = new Stack<>();

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '#' && !s1.isEmpty()){
                s1.pop();
            }
            else if(ch != '#'){
                s1.push(ch);
            }
        }
        
        for(int i=0; i<t.length(); i++){
            char ch = t.charAt(i);
            if(ch == '#' && !t1.isEmpty()){
                t1.pop();
            }
            else if(ch != '#'){
                t1.push(ch);
            }
        }
        /*
        String ans1 = "";
        while(!s1.isEmpty()){
            ans1 = s1.pop() + ans1;
        }

        String ans2 = "";
        while(!t1.isEmpty()){
            ans2 = t1.pop() + ans2;
        }
        
       // return ans1 == ans2;
       if(ans1 != ans2){
           return false;
       }
        return true;
       */
       if(s1.equals(t1)){
           return true;
       }
       return false;
    }
}
