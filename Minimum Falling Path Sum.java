class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int r=matrix.length;
        int c=matrix[0].length;
        int ans=Integer.MAX_VALUE;
        HashMap<String,Integer> hm=new HashMap<>();
        for(int i=0;i<c;i++){
            ans=Math.min(ans, solve(0,i,matrix, hm));
        }
        return ans;
    }

    public static int solve(int i, int j, int arr[][], HashMap<String,Integer> hm){
        int r=arr.length;
        int c=arr[0].length;
        if(i==r)
            return 0;
        
        if(j<0 || j>=c)
            return Integer.MAX_VALUE;

        String key=i+"ij"+j;
        if(hm.containsKey(key))
            return hm.get(key);

        int op1, op2, op3;
        op1=solve(i+1, j-1, arr, hm);
        op2=solve(i+1, j, arr, hm);
        op3=solve(i+1, j+1, arr, hm);

        hm.put(key, arr[i][j]+Math.min(op1, Math.min(op2,op3)));
        return arr[i][j]+Math.min(op1, Math.min(op2,op3));
    }
}
