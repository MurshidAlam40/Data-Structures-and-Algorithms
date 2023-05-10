import java.util.*;
import java.io.*;

class Node
{
    int data;
    Node next;
    
    Node(int x)
    {
        data = x;
        next = null;
    }
}


class Main{
       public static void makeLoop(Node head, Node tail, int x){
        if (x == 0) return;
        
        Node curr = head;
        for(int i=1; i<x; i++)
            curr = curr.next;
        
        tail.next = curr;
    }
    
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int num = sc.nextInt();
        Node head = new Node(num);
        Node tail = head;
        
        for(int i=0; i<n-1; i++){
            num = sc.nextInt();
            tail.next = new Node(num);
            tail = tail.next;
        }
        
        int pos = sc.nextInt();
        makeLoop(head, tail, pos);
        Solution x = new Solution();
        System.out.println(x.findFirstNode(head));
    } 
} 
   
/* class Node
{
    int data;
    Node next;
    
    Node(int x)
    {
        data = x;
        next = null;
    }
}*/

class Solution {
    //Function to find first node if the linked list has a loop.
    public static int findFirstNode(Node head){
        //code here
        /*
        HashSet<Node> ans = new HashSet<>();
        while(head!=null) {
            if(ans.contains(head))
                return head.data;
            ans.add(head);
            head = head.next;
        }
        return -1;
        //t- o(n)
        //s- o(n)
        */
        
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
                break;
        }
        
        if(fast == null || fast.next == null){
            return -1;
        }
        
        Node temp = head;
        while(temp != slow){
            temp = temp.next;
            slow = slow.next;
        }
        return slow.data;
        //t- o(n)
        //s- o(1)
    }
}
