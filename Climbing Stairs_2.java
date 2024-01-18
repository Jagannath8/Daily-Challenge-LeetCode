class Solution {
    public int climbStairs(int n) {
        if(n==1)
            return 1;
        int a=0,b=1;
        for(int i=0;i<n;i++){
            int temp=a+b;
            a=b;
            b=temp;
        }
        return b;
    }
}
