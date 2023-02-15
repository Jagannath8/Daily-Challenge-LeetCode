class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=num.length-1;i>=0||k>0;i--){
            if(i>=0){
                ans.add((num[i]+k)%10);
                k=(num[i]+k)/10;
            }
            else{
                ans.add(k%10);
                k/=10;
            }
        }
        Collections.reverse(ans);
        return ans;
    }
}
