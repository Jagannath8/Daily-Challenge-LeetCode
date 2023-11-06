class SeatManager {
    private PriorityQueue<Integer> seats;
    public SeatManager(int n) {
        seats=new PriorityQueue<>();
        for(int i=1;i<=n;i++){
            seats.offer(i);
        }
    }
    
    public int reserve() {
        if(!seats.isEmpty()){
            int res=seats.poll();
            return res;
        }
        else
            return -1;
    }
    
    public void unreserve(int seatNumber) {
        seats.offer(seatNumber);
    }
}
