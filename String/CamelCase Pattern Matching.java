import java.io.*;
import java.util.*;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(read.readLine());
        String[] Dictionary=read.readLine().split(" ");
        String Pattern=read.readLine();
        Solution ob = new Solution();
        ArrayList <String> ans = ob.CamelCase(N,Dictionary,Pattern);
        for(String u : ans){
            System.out.print(u+" ");
        }
        System.out.println(); 
    }
}

class Solution{
    ArrayList<String> CamelCase(int N,String[] Dictionary,String Pattern){
        //code here
        ArrayList<String> ans = new ArrayList<>();
        Arrays.sort(Dictionary);
        for(int i=0; i<Dictionary.length; i++){
            String str = "";
            for(int j=0; j<Dictionary[i].length(); j++){
                if(Character.isUpperCase(Dictionary[i].charAt(j)))
                    str += Dictionary[i].charAt(j);
                if(str.length() == Pattern.length())
                    break;
            }
            if(str.equals(Pattern))
            ans.add(Dictionary[i]);
        }
        if(ans.size() == 0){
            ans.add("-1");
        }
        return ans;
    }
}
