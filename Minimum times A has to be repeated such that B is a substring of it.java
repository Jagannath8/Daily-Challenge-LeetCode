class Solution {
    static int minRepeats(String A, String B) {
        // code here
        int count=1;
        String str=A;
        while(str.length()<B.length()){
            str+=A;
            count++;
        }
        
        if(str.contains(B))
            return count;
        
        str+=A;
        if(str.contains(B))
            return count+1;
        
        return -1;
    }
};
