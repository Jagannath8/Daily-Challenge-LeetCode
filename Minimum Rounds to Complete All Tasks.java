class Solution {
    public int minimumRounds(int[] tasks) {
        Map<Integer, Integer> map=new HashMap<>();
        for(int t: tasks){
            map.put(t, map.getOrDefault(t,0)+1);
        }

        int rounds=0;
        for(int freq: map.values()){
            if(freq==1)
                return -1;
            if(freq%3==0)
                rounds+=freq/3;
            else
                rounds+=(freq/3)+1;
        }
        return rounds;
    }
}
