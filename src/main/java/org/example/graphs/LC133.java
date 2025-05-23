package org.example.graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LC133 {
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
    Map<Node, Node> map = new HashMap<>();
    public Node cloneGraph(Node node) {

            if(node == null) return null;
            Node curr = new Node(node.val);
            map.put(node, curr);
            for(Node nei : node.neighbors){
                if(!map.containsKey(nei)) cloneGraph(nei);
                curr.neighbors.add(map.get(nei));
            }
            return curr;


    }
}
