class Solution {
    public int minDeletionSize(String[] strs) {
        int remove=0;
        int k=strs[0].length();
        for(int i=0;i<k;i++){
            for(int j=1;j<strs.length;j++){
                if(strs[j].charAt(i)<strs[j-1].charAt(i)){
                    remove++;
                    break;
                }
            }
        }
        return remove;
    }
}
