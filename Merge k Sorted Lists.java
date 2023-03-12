class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists==null || lists.length==0)
            return null;

        return helper(lists, 0, lists.length-1);
    }

    public ListNode helper(ListNode lists[], int low, int high){
        if(low>high)
            return null;
        if(low==high)
            return lists[low];
        int mid=low+(high-low)/2;
        ListNode left=helper(lists, low, mid);
        ListNode right=helper(lists, mid+1, high);
        return merge(left, right);
    }

    public ListNode merge(ListNode n1, ListNode n2){
        ListNode temp=new ListNode(-1);
        ListNode prev=temp;
        while(n1!=null && n2!=null){
            if(n1.val<n2.val){
                prev.next=n1;
                n1=n1.next;
            }
            else{
                prev.next=n2;
                n2=n2.next;
            }
            prev=prev.next;
        }

        if(n1!=null)
            prev.next=n1;
        if(n2!=null)
            prev.next=n2;
        
        return temp.next;
    }
}
