class Solution {
    public int countNicePairs(int[] nums) {
        int ans=0;
        int mod=1000000007;
        Map<Integer,Integer> cnt=new HashMap<>();
        for(int n: nums){
            int rev=reverse(n);
            int curr=cnt.getOrDefault(n-rev,0);
            cnt.put(n-rev, curr+1);
            ans=(ans+curr)%mod;
        }
        return ans;
    }

    public int reverse(int num){
        int revNum=0;
        while(num>0){
            int digit=num%10;
            revNum=revNum*10+digit;
            num=num/10;
        }
        return revNum;
    }
}
