class Solution {
    public int eliminateMaximum(int[] dist, int[] speed) {
        int n=dist.length;
        int at[]=new int[n];
        for(int i=0;i<n;i++){
            at[i]=(dist[i]-1)/speed[i];
        }
        Arrays.sort(at);
        for(int i=0;i<n;i++){
            if(i>at[i])
                return i;
        }
        return n;
    }
}
