class Solution {
    public String reverseWords(String s) {
        StringBuilder res=new StringBuilder();
        int n=s.length();
        for(int i=0; i<n; i++){
            int j=i;
            while(j<n && s.charAt(j) != ' ') j++;
            for(int a=j-1; a>=i;a--){
                res.append(s.charAt(a));
            }
            i=j;
            if(i<n) res.append(' ');
        }
        return res.toString();
    }
}
