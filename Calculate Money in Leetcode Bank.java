class Solution {
    public int totalMoney(int n) {
        int cnt=n/7;
        int rem=n%7;
        int total=((cnt*(cnt-1))/2)*7;
        total+=cnt*28;
        total+=((rem*(rem+1))/2) + (cnt*rem);
        return total;
    }
}
