public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null)
            return head;
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                while(slow!=head){
                    slow=slow.next;
                    head=head.next;
                }
                return slow;
            }
        }
        return null;
    }
}
