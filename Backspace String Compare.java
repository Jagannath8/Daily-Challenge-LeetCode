class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> first = new Stack<>();
        Stack<Character> second = new Stack<>();
        
        for(char c : s.toCharArray()){
            if(c=='#'){
                if(!first.isEmpty())
                    first.pop();
            }
            else
                first.push(c);
        }
        
        for(char c : t.toCharArray()){
            if(c=='#'){
                if(!second.isEmpty())
                    second.pop();
            }
            else
                second.push(c);
        }

        while(!first.isEmpty()){
            char cur = first.pop();
            if(second.isEmpty() || cur !=second.pop())
                return false;
        }

        return second.isEmpty();
    }
}
