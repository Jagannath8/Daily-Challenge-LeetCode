class Solution {
    public int countNegatives(int[][] grid) {
        int count=0;
        int row=0, col=grid[0].length-1;
        while(row<grid.length && col>=0){
            if(grid[row][col]<0){
                count+=(grid.length-row); 
                col--;
            }
            else
                row++;
        }
        return count;
    }
}
