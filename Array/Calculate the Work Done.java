
import java.util.*;
import java.io.*;


class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
       
        int n = sc.nextInt();
        int cap = sc.nextInt();
        
        int a[] = new int[n];
        for(int i = 0; i<n; ++i){
            a[i] = sc.nextInt();
        }
        System.out.println(new Solution().workDone(n, a, cap));
      
    }
}



class Solution{
    public int workDone(int n, int a[], int cap){
        // Code Here.
        Set<Integer> itemsOnBelt = new HashSet<>();
        Deque<Integer> belt = new LinkedList<>();
        int work = 0;
        for (int i = 0; i < n; i++) {
            if (!itemsOnBelt.contains(a[i])) {
                work++;
                if (belt.size() == cap) {
                    int lastItem = belt.removeLast();
                    itemsOnBelt.remove(lastItem);
                }
                belt.addFirst(a[i]);
                itemsOnBelt.add(a[i]);
            }
        }
        return work;
    }
}
