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
    public ListNode swapNodes(ListNode head, int k) {
        //Count Nodes
        ListNode temp = head;
        int count = 0;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        //kth node from start
        ListNode start = head;
        for(int i = 1; i < k; i++){
            start = start.next;
        }
        //kth node from end
        ListNode end = head;
        for(int i = 1; i < count - k + 1; i++){
            end = end.next;
        }
        //swap values
        int tempVal = start.val;
        start.val = end.val;
        end.val = tempVal;

        return head;
    }
}