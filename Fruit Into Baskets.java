class Solution {
    public int totalFruit(int[] fruits) {
        Map<Integer, Integer> bas=new HashMap<>();
        int left=0, ans=0;
        for(int i=0;i<fruits.length;i++){
            bas.put(fruits[i], bas.getOrDefault(fruits[i],0)+1);
            while(bas.size()>2){
                bas.put(fruits[left], bas.get(fruits[left])-1);
                if(bas.get(fruits[left])==0)
                    bas.remove(fruits[left]);
                
                left++;
            }
            ans=Math.max(ans, i-left+1);
        }
        return ans;
    }
}
