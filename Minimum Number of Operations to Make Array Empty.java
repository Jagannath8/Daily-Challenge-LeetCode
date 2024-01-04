class Solution {
    public int minOperations(int[] nums) {
        Map<Integer,Integer> mp=new HashMap<>();
        int cnt=0;
        for(int n: nums){
            mp.put(n, mp.getOrDefault(n,0)+1);
        }
        for(int val: mp.values()){
            if(val==1)
                return -1;
            cnt+=val/3;
            if(val%3!=0)
                cnt++;
        }
        return cnt;
    }
}
