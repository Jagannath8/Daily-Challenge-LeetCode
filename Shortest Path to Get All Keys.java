class Solution {
    public int shortestPathAllKeys(String[] grid) {
        int n = grid.length, m = grid[0].length();
        char[][] c = new char[n][];
        for(int i = 0; i<n; i++) c[i] = grid[i].toCharArray();
        int key = 0;
        Queue<int[]> q = new LinkedList<>();
        int[][] dir = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
        boolean[][][] vis = new boolean[31][31][64];
        int I = -1, J = -1;
        for(int i = 0; i<n; i++) {
            for(int j = 0; j<m; j++) {
                if(c[i][j] == '@') {
                    I = i;
                    J = j;
                }
                if(isLower(c[i][j])) key |= 1 << (c[i][j] - 'a');
            }
        }
        vis[I][J][0] = true;
        q.add(new int[]{I, J, 0, 0});
        while(!q.isEmpty()) {
            var v = q.poll();
            if(v[2] == key) return v[3];
            for(var d : dir) {
                int x = d[0] + v[0], y = d[1] + v[1];
                if(x >= 0 && x < n && y >= 0 && y < m && c[x][y] != '#' && !vis[x][y][v[2]]) {
                    if(isLower(c[x][y])) {
                        int mask = v[2] | (1 << (c[x][y] - 'a'));
                        q.add(new int[]{x, y, mask, v[3] + 1});
                        vis[x][y][mask] = true;
                    }
                    else if(isUpper(c[x][y])) {
                        if(((v[2] >> (c[x][y] - 'A')) & 1) == 1) {
                            q.add(new int[]{x, y, v[2], v[3] + 1});
                            vis[x][y][v[2]] = true;
                        }
                    }
                    else {
                        q.add(new int[]{x, y, v[2], v[3] + 1});
                        vis[x][y][v[2]] = true;
                    }
                }
            }
        }
        return -1;
    }
    public boolean isLower(char c){
        return c >= 'a' && c <= 'z';
    }
    public boolean isUpper(char c) {
        return c >= 'A' && c <= 'Z';
    }
}
