class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck); 
        int n = deck.length;
        int[] result = new int[n];
        Deque<Integer> indices = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            indices.add(i); 
        }
        
        for (int card : deck) {
            int idx = indices.poll(); 
            result[idx] = card; 
            if (!indices.isEmpty()) {
                indices.add(indices.poll()); 
            }
        }
        return result;
    }
}
