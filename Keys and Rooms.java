class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean vis[]=new boolean[rooms.size()];
        vis[0]=true;
        Stack<Integer> st=new Stack();
        st.push(0);

        while(!st.isEmpty()){
            int node=st.pop();
            for(int nei: rooms.get(node)){
                if(!vis[nei]){
                    vis[nei]=true;
                    st.push(nei);
                }
            }
        }

        for(boolean v:vis){
            if(!v)
                return false;
        }
        
        return true;
    }
}
