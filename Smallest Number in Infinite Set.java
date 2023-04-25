class SmallestInfiniteSet {
    PriorityQueue<Integer> pq;
    public SmallestInfiniteSet() {
        pq=new PriorityQueue<>();
        for(int i=1;i<=1000;i++)
            pq.add(i);
    }
    
    public int popSmallest() {
        if(!pq.isEmpty())
            return pq.remove();

        return -1;
    }
    
    public void addBack(int num) {
        if(!pq.contains(num))
            pq.add(num);
    }
}
