class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        long low=Long.MAX_VALUE;
        long high=0;
        long min=Long.MAX_VALUE;
        for(int t: time){
            low=Math.min(low,t);
            min=Math.min(min,t);
        }

        high=totalTrips*min;
        while(low<high){
            long mid=low+(high-low)/2;
            if(helper(mid, totalTrips, time))
                high=mid;
            else
                low=mid+1;
        }
        return low;
    }

    public boolean helper(long isValidTime, int totalTrips, int time[]){
        long trips=0;
        for(int t: time)
            trips+=isValidTime/t;
        
        if(trips>=totalTrips)
            return true;
        
        return false;
    }
}
