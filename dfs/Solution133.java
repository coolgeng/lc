package dfs;

import java.util.ArrayList;
import java.util.List;

/**
 * Solution133
 */
public class Solution133 {
    public Node cloneGraph(Node node) {
        
    }
    
}

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