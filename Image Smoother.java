class Solution {
    public int[][] imageSmoother(int[][] img) {
        int row=img.length;
        int col=img[0].length;
        int ans[][]=new int[row][col];
        for(int r=0;r<row;r++){
            for(int c=0;c<col;c++){
                ans[r][c]=avg(img,r,c,row,col);
            }
        }
        return ans;
    }

    private int avg(int img[][], int r, int c, int row, int col){
        int total=0, count=0;
        int top=Math.max(0, r-1);
        int bottom=Math.min(row, r+2);
        int left=Math.max(0, c-1);
        int right=Math.min(col, c+2);
        for(row=top;row<bottom;row++){
            for(col=left;col<right;col++){
                total+=img[row][col];
                count+=1;
            }
        }
        return total/count;
    }
}
