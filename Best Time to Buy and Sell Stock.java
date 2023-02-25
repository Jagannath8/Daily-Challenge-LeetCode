class Solution {
    public int maxProfit(int[] prices) {
        int max=0,j=0;
        for(int i=1;i<prices.length;i++){
            int diff=prices[i]-prices[j];
            if(diff>max)
                max=diff;
            
            if(prices[i]<prices[j])
                j=i;
        }
        return max;
    }
}
