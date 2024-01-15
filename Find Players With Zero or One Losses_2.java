class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        List<List<Integer>> result = new ArrayList<>();
        HashMap<Integer, Integer> winner = new HashMap<>();
        HashMap<Integer, Integer> looser = new HashMap<>();
        
        for(int match[]:matches){
            winner.put(match[0], winner.getOrDefault(match[0], 0)+1);
            looser.put(match[1], looser.getOrDefault(match[1], 0)+1);
        }
        
        ArrayList<Integer> w = new ArrayList<Integer>();
        ArrayList<Integer> l = new ArrayList<Integer>();
        
        for(int key:winner.keySet()){
            if(!looser.containsKey(key))
                w.add(key);
        }
        
        for(int key:looser.keySet()){
            if(looser.get(key)==1)
                l.add(key);
        }
        
        Collections.sort(w);
        Collections.sort(l);
        result.add(w);
        result.add(l);
        return result;

    }
}
