class SummaryRanges {

    private Set<Integer> ans;

    public SummaryRanges() {
        ans=new TreeSet<>();
    }
    
    public void addNum(int value) {
        ans.add(value);
    }
    
    public int[][] getIntervals() {
        if(ans.isEmpty())
            return new int[0][2];

        List<int[]> intervals=new ArrayList<>();
        int left=-1, right=-1;
        for(Integer value: ans){
            if(left<0)
                left=right=value;
            
            else if(value==right+1)
                right=value;
            
            else{
                intervals.add(new int[] {left, right});
                left=right=value;
            }
        }
        intervals.add(new int[] {left, right});
        return intervals.toArray(new int[0][]);
    }
}
