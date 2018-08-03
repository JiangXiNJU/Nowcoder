package LeetCode;

/**
 * Given a linked list, rotate the list to the right by k places, where k is non-negative.

 Example 1:

 Input: 1->2->3->4->5->NULL, k = 2
 Output: 4->5->1->2->3->NULL
 Explanation:
 rotate 1 steps to the right: 5->1->2->3->4->NULL
 rotate 2 steps to the right: 4->5->1->2->3->NULL
 Example 2:

 Input: 0->1->2->NULL, k = 4
 Output: 2->0->1->NULL
 Explanation:
 rotate 1 steps to the right: 2->0->1->NULL
 rotate 2 steps to the right: 1->2->0->NULL
 rotate 3 steps to the right: 0->1->2->NULL
 rotate 4 steps to the right: 2->0->1->NULL
 */
public class Solution061_Rotate_List {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null||head.next==null) return head;
        ListNode p_ahead=head;
        int len=0;
        while(len<k){
            p_ahead=p_ahead.next;
            len++;
            if(p_ahead==null) p_ahead=head;
        }
        if(p_ahead==head) return head;
        ListNode p_cur=head;
        while(p_ahead.next!=null){
            p_cur=p_cur.next;
            p_ahead=p_ahead.next;
        }
        ListNode final_head=p_cur.next;
        p_cur.next=null;
        p_ahead.next=head;
        return head;
    }
}
