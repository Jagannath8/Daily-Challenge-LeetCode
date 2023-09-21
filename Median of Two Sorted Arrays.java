class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums2.length < nums1.length)
            return findMedianSortedArrays(nums2, nums1);
        
        int m=nums1.length;
        int n=nums2.length;

        int start=0, end=m;
        while(start<=end){
            int p1=(start+end)/2;
            int p2=(m+n+1)/2-p1;
            int l1 = p1==0 ? Integer.MIN_VALUE : nums1[p1-1];
            int l2 = p2==0 ? Integer.MIN_VALUE : nums2[p2-1];
            int r1 = p1==m ? Integer.MAX_VALUE : nums1[p1];
            int r2 = p2==n ? Integer.MAX_VALUE : nums2[p2];

            if(l1<=r2 && l2<=r1){
                if((m+n)%2==0)
                    return (Math.max(l1, l2) + Math.min(r1, r2))/2.0;
                else
                    return Math.max(l1, l2);
            }

            else if(l1>r2){
                end=p1-1;
            }

            else{
                start=p1+1;
            }
        }
        return 0.0;
    }
}
