class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> output = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        for(int i=0;i<numRows;i++){
            cur.add(0,1);
            for(int j=1;j<cur.size()-1;j++){
                cur.set(j, cur.get(j) + cur.get(j+1));
            }
            output.add(new ArrayList<>(cur));
        }
        return output;
    }
}
