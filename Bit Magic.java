class Solution {
    public static int bitMagic(int n, int[] arr) {
        // code here
        int cnt=0;
        for(int i=0; i<n/2; i++){
            if(arr[i]!=arr[n-1-i])
                cnt++;
        }
        return (cnt%2==0) ?  cnt/2 :  cnt/2+1;
    }
}
