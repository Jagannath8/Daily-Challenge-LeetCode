class Solution {
    ListNode head;
    public Solution(ListNode head) {
        this.head=head;
    }
    
    public int getRandom() {
        ListNode node=head;
        int count=0, ans=0;
        while(node!=null){
            count++;
            if((int)(Math.random()*count)==0)
                ans=node.val;
            
            node=node.next;
        }
        return ans;
    }
}
