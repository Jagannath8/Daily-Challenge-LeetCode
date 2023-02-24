class Solution {
    public int minimumDeviation(int[] nums) {
        TreeSet<Integer> ts=new TreeSet<>();
        for(int x: nums){
            if(x%2==0)
                ts.add(x);
            else
                ts.add(x*2);
        }

        int ans=Integer.MAX_VALUE;
        while(true){
            int val=ts.last();
            ans=Math.min(ans, val-ts.first());
            if(val%2==0){
                ts.remove(val);
                ts.add(val/2);
            }

            else
                break;
        }
        return ans;
    }
}
