class Solution {

    int rep[]=new int[26];

    int find(int x){
        if(rep[x]==x)
            return x;
        
        return rep[x]=find(rep[x]);
    }

    void performUnion(int x, int y){
        x=find(x);
        y=find(y);
        if(x==y)
            return;
        if(x<y)
            rep[y]=x;
        else
            rep[x]=y;
    }

    public String smallestEquivalentString(String s1, String s2, String baseStr) {
        for(int i=0;i<26;i++)
            rep[i]=i;
        for(int i=0;i<s1.length();i++)
            performUnion(s1.charAt(i) - 'a', s2.charAt(i) - 'a');

        String ans="";
        for(char c: baseStr.toCharArray())
            ans+=(char)(find(c-'a')+'a');

        return ans;
    }
}
