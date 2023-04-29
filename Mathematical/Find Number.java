import java.io.*;
import java.util.*;
class Main{
    public static void main (String[] args){
        
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        Solution ob=new Solution();
        System.out.println(ob.findNumber(n));
    }
}


class Solution
{
    public long findNumber(long N)
    {
        /*
        long ans = 0;
        
        while(N>0){
            ans *= 10;
            if(N%5 == 0){
                ans += 9;
                N /= 5;
                N--;
            }
            else if(N%5 == 1){
                ans += 1;
                N /= 5;
            }
            else if(N%5 == 2){
                ans += 3;
                N /= 5;
            }
            else if(N%5 == 3){
                ans += 5;
                N /= 5;
            }
            else{
                ans += 7;
                N /= 5;
            }
        }
        //reverse the ans . which will give the actual result
        long num = 0;
        while(ans > 0){
            num = num*10 + ans%10;
            ans /= 10;
        }
        return num;
        */
        
        //second method
        String str = "";
        long ans = 0;
        int odd[] = {1, 3, 5, 7, 9};
        
        while(N>0){
            long curr = N%5;
            if(curr == 0){
                str = odd[4] + str;
                N = N/5;
                N--;
            }
            else{
                str = odd[(int)curr - 1] + str;
                N = N/5;
            }
        }
        
        return Long.parseLong(str);
    }
}
