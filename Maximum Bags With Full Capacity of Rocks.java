class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int n=capacity.length, full=0;
        int rem[]= new int[n];
        for(int i=0;i<n;i++){
            rem[i]=capacity[i]-rocks[i];
        }
        Arrays.sort(rem);

        for(int i=0;i<n;i++){
            if(additionalRocks>=rem[i]){
                additionalRocks-=rem[i];
                full++;
            }
            else
                break;
        }
        return full;
    }
}
