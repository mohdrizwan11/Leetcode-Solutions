/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) 
    {
        if(node == null) return null;

        //Map from Original node -> cloned node
        Map<Node, Node> map = new HashMap<>();

        //clone the starting node
        Node clone = new Node(node.val);
        map.put(node, clone);

        //Queue for BFS
        Queue<Node> q = new LinkedList<>();
        q.add(node);

        while(!q.isEmpty())
        {
            Node curr = q.poll();

            //Traverse neighbors
            for(Node neighbor : curr.neighbors)
            {
                if(!map.containsKey(neighbor))
                {
                    //Clone neighbor if not already cloned
                    map.put(neighbor, new Node(neighbor.val));
                    q.add(neighbor);
                }
                
                //Link the clone of curr with the clone of neighbor
                map.get(curr).neighbors.add(map.get(neighbor));
            }
        }

        return clone;
    }
}