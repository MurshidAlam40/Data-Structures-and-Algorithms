import java.util.*;
class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
class Remove_Duplicate_From_LL
{
    Node head;  
    Node tail;
	public void addToTheLast(Node node) 
	{
	  if (head == null) 
	  {
	   head = node;
	   tail = node;
	  } 
	  else 
	  {
	   tail.next = node;
	   tail = node;
	  }
	}
      void printList()
    {
        Node temp = head;
        while (temp != null)
        {
           System.out.print(temp.data+" ");
           temp = temp.next;
        }  
        System.out.println();
    }
	/* Drier program to test above functions */
	public static void main(String args[])
    {
         Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			Remove_Duplicate_From_LL llist = new Remove_Duplicate_From_LL(); 
			int a1=sc.nextInt();
			Node head= new Node(a1);
            llist.addToTheLast(head);
            for (int i = 1; i < n; i++) 
			{
				int a = sc.nextInt(); 
				llist.addToTheLast(new Node(a));
			}
			
        Solution g = new Solution();
		llist.head = g.removeDuplicates(llist.head);
		llist.printList();
    }
}


/*
class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
*/

class Solution
{
    //Function to remove duplicates from sorted linked list.
    Node removeDuplicates(Node head)
    {
	// Your code here
	    if(head == null || head.next == null){
            return head;
        }
        
        Node curr = head;
        
        while(curr.next != null){
            if(curr.data == curr.next.data){
                curr.next = curr.next.next;
            }
            else
                curr = curr.next;
        }
        
        return head;
    }
}