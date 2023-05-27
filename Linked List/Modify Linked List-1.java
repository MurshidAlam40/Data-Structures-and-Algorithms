import java.io.*;
import java.util.*;

class Node
{
    int data;
    Node next;
    public Node(int data)
    {
        this.data=data;
    }
}
class Main{
    public static void main(String args[]) throws IOException { 
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(in.readLine().trim());
        String s[]=in.readLine().trim().split(" ");
        Node head=new Node(Integer.parseInt(s[0]));
        Node copy=head;
        for(int i=1;i<n;i++){
            Node temp=new Node(Integer.parseInt(s[i]));
            copy.next=temp;
            copy=copy.next;
        }
        Solution ob=new Solution();
        Node ans=ob.modifyTheList(head);
        while(ans!=null){
            System.out.print(ans.data+" ");
            ans=ans.next;
        }
        System.out.println();
    }
}

class Solution{
    public static Node modifyTheList(Node head){
        Stack<Integer> stack = new Stack<>();
        Node curr = head;
        while(curr != null){
            stack.push(curr.data);
            curr = curr.next;
        }
        
        int n = stack.size()/2;
        int i = 0;
        
        curr = head;
        while(curr != null){ 
            if(i < n)
                curr.data = stack.pop() - curr.data;
            else
                curr.data = stack.pop(); 
            curr = curr.next;
            
            i++;
        }
        return head;
    }
}
