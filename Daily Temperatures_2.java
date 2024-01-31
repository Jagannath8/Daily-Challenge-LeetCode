class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] ans = new int[n];

        Stack<Integer> stk = new Stack<>();

        for(int i =0;i<n;i++){
            if(stk.isEmpty())
            stk.push(i);
            else{
                while(!stk.isEmpty() && temperatures[i]>temperatures[stk.peek()]){
                int op = stk.pop();
                ans[op] = i - op;
                }
                stk.push(i);
            }
        }

        return ans;
    }
}
