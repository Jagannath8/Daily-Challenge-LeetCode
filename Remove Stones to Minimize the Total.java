class Solution {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> heap=new PriorityQueue<>((a,b)->b-a);
        for(int num: piles){
            heap.add(num);
        }

        for(int i=0;i<k;i++){
            int curr=heap.remove();
            int remv=curr/2;
            heap.add(curr-remv);
        }

        int ans=0;
        for(int num: heap){
            ans+=num;
        }

        return ans;
    }
}
