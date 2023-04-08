class Solution {
    HashMap<Node, Node> mp=new HashMap<>();
    public Node cloneGraph(Node node) {
        if(node==null)
            return null;

        if(mp.containsKey(node))
            return mp.get(node);

        mp.put(node, new Node(node.val));
        for(Node val: node.neighbors){
            mp.get(node).neighbors.add(cloneGraph(val));
        }
        return mp.get(node);
    }
}
