class Solution {
    public int maxPoints(int[][] points) {
        int ans=0;       
        for(int i=0;i<points.length;i++){
            Map<Double, Integer> map=new HashMap<>();
            for(int j=i+1;j<points.length;j++){
                double y2 = points[j][1], y1 = points[i][1];
                double x2 = points[j][0], x1 = points[i][0];
                double slope;                
                if(x1==x2)
                    slope=Double.MAX_VALUE;
                else{
                    slope=(y1-y2)/(x1-x2);
                    if(slope==-0.0)
                        slope=0.0;
                }
                
                map.put(slope, map.getOrDefault(slope,0)+1);
                ans=Math.max(ans, map.get(slope));
            }
        }
        return ans+1;
    }
}
