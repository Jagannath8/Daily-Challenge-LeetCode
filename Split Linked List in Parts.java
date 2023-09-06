class Solution {
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] ans=new ListNode[k];
        int len=0;
        ListNode node=head;
        while(node!=null){
            len++;
            node=node.next;
        }

        int n=len/k, r=len%k;
        node=head;
        for(int i=0;i<k;i++){
            int subSize=(i<r) ? (n+1) : n;
            if(subSize==0)
                ans[i]=null;
            else{
                ListNode subHead=node;
                for(int j=0;j<subSize-1;j++){
                    node=node.next;
                }
                ListNode nextNode=node.next;
                node.next=null;
                ans[i]=subHead;
                node=nextNode;
            }
        }
        return ans;
    }
}
