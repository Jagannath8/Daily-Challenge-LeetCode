class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack <Integer> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(') st.push(i);
            else if(s.charAt(i)==')'){
                if(!st.isEmpty()&&s.charAt((int)st.peek())=='(')
                    st.pop();
                else 
                    st.push(i);
            }
            else 
                continue;
        }
        StringBuilder sb=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            if(!st.isEmpty()&&(int)st.peek()==i) {
                st.pop();
                continue;
            }
            else 
                sb.append(s.charAt(i));
        }
        return sb.reverse().toString();
    }
}
