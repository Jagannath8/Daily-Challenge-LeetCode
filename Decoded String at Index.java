class Solution {
    public String decodeAtIndex(String s, int k) {
        long len=0;
        for(char ch: s.toCharArray()){
            if(Character.isDigit(ch))
                len*=(ch-'0');
            else
                len++;
        }

        for(int i=s.length()-1;i>=0;i--){
            char curr=s.charAt(i);
            if(Character.isDigit(curr)){
                len/=(curr-'0');
                k%=len;
            }
            else{
                if(k==0 || len==k)
                    return String.valueOf(curr);
                len--;
            }
        }
        return "";
    }
}
