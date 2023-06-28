/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        /*
        //Brute forece
        if(head == null && head.next == null){
            return true;
        }

        ArrayList<Integer> list = new ArrayList<>();
        while(head != null){
            list.add(head.val);
            head = head.next;
        }
        //using two pointer technique
        int start = 0;
        int end = list.size()-1;

        while(start < end){
            if(list.get(start) != list.get(end))
                return false;
            start++;
            end--;
        }
        return true;
        */
        if(head == null && head.next == null){
            return true;
        }
        
        ListNode fast = head;
        ListNode slow = head;
        //find the middle of LinkedList
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        //Move slow to right half
        if(fast.next != null)
            slow = slow.next;
        //revrese the list start from slow
        ListNode revHead = reverse(slow);
        //compare the left half, right half are equal or not
        while(revHead != null && head.next != null){
            if(head.val != revHead.val)
                return false;
            head = head.next;
            revHead = revHead.next;
        }
        return true;
    }
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        while(head != null){
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}
