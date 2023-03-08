class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=Integer.MIN_VALUE;
        for(int i=0;i<piles.length;i++){
            high=Math.max(high, piles[i]);
        }

        while(low<high){
            int mid=low+(high-low)/2;
            if(isValid(mid, piles, h))
                high=mid;
            else
                low=mid+1;
        }
        return low;
    }

    public boolean isValid(int max, int piles[], int h){
        int hours=0;
        for(int i: piles){
            int time=i/max;
            hours+=time;
            if(i%max!=0)
                hours++;
        }

        if(hours<=h)
            return true;

        return false;
    }
}
