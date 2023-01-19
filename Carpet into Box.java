import java.util.*;
import java.io.*;
import java.lang.*;

class Geeks
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int A =sc.nextInt();
        int B =sc.nextInt();
        int C =sc.nextInt();
        int D =sc.nextInt();

        System.out.println(new Solution().carpetBox(A,B,C,D)); 
    }
}

class Solution{
    int carpetBox(int A, int B, int C, int D) { 
        //code here
        int length =A;
        int breadth = B;
        int step=0;
        while(length > C || breadth > D){
            if(length > C){
                step ++;
                length/=2;
            }
            if(breadth > D){
                step++;
                breadth/=2;
            }
        }
        
        int ans = step;
        step = 0;
        
        length = B;
        breadth = A;
        while(length > C || breadth > D){
            if(length > C){
                step ++;
                length/=2;
            }
            if(breadth > D){
                step++;
                breadth/=2;
            }
        }
        return Math.min(ans, step);
    }  
}
