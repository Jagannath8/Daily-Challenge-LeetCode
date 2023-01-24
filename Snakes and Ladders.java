class Solution {
    public int snakesAndLadders(int[][] board) {
        int n=board.length;
        int steps=0;
        Queue<Integer> q=new LinkedList<Integer>();
        boolean vis[][]=new boolean[n][n];
        q.add(1);
        vis[n-1][0]=true;
        
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                int x=q.poll();
                if(x==n*n)
                    return steps;
                
                for(int k=1;k<=6;k++){
                    if(k+x > n*n)
                        break;

                    int pos[]=findCoordinates(k+x, n);
                    int row=pos[0];
                    int col=pos[1];
                    
                    if(vis[row][col]==true)
                        continue;
                    vis[row][col]=true;

                    if(board[row][col]==-1)
                        q.add(k+x);
                    else
                        q.add(board[row][col]);
                }
            }
            steps++;
        }
        return -1;
    }

    public int[] findCoordinates(int curr, int n){
        int row = n-(curr-1)/n -1;
        int col = (curr-1)%n;
        if(row%2 == n%2)
            return new int[]{row, n-1-col};
        else
            return new int[]{row,col};
    }
}
