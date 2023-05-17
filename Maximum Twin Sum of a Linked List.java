class Solution {
    public int pairSum(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        int max=0;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        ListNode curr, prev=null;
        while(slow!=null){
            curr=slow.next;
            slow.next=prev;
            prev=slow;
            slow=curr;
        }

        while(prev!=null){
            max=Math.max(max, head.val+prev.val);
            prev=prev.next;
            head=head.next;
        }
        return max;
    }
}
