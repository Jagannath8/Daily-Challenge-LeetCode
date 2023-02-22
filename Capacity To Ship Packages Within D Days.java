class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left=0;
        int right=Integer.MAX_VALUE;
        while(left<right){
            int mid=left+(right-left)/2;
            if(helper(weights,mid,days))
                right=mid;
            else
                left=mid+1;
        }
        return left;
    }

    public boolean helper(int weights[], int mid, int days){
        int count=1, sum=0;
        for(int w: weights){
            if(w>mid)
                return false;
            if((sum+=w)>mid){
                if(++count > days){
                    return false;
                }                
                sum=w;
            }
        }
        return true;
    }
}
