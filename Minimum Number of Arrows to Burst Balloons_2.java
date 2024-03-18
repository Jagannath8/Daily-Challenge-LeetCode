class Solution {
    public int findMinArrowShots(int[][] points) {
        int arrows=1;
        Arrays.sort(points, (a,b) -> Integer.compare(a[1], b[1]));
        int end=points[0][1];
        for(int []p: points){
            if(p[0]>end){
                end=p[1];
                arrows++;
            }
        }
        return arrows;
    }
}
