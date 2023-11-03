class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> res = new ArrayList<>();
        int i = 0; 
        int curr = 1; 
        while (i < target.length) {
            if (target[i] == curr) {
                res.add("Push");
                i++;
            } 
            else {
                res.add("Push");
                res.add("Pop");
            }
            curr++;
        }
        return res;
    }
}
