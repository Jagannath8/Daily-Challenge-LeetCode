class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head.next==null)
            return head;
        if(left==right)
            return head;
        
        ListNode dummy = new ListNode();
        dummy.next=head;
        ListNode prev=dummy;
        ListNode curr=head;
        
        for(int i=1;i<left;i++){
            prev=curr;
            curr=curr.next;
        }
        
        ListNode nex;
        for(int i=0; i<right-left;i++){
            nex=curr.next;
            curr.next=nex.next;
            nex.next=prev.next;
            prev.next=nex;
        }
        
        return dummy.next;
    }
}
