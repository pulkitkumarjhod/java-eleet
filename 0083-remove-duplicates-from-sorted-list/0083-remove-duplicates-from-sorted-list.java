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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode temp = head.next, curr = head;
        while(curr != null){
            while(temp != null && curr.val == temp.val){
                temp = temp.next;
                curr.next = temp;
            }
            curr = curr.next; 
            if(curr != null) temp = curr.next;
        }
        return head;
    }
}