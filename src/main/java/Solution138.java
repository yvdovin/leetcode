import java.util.HashMap;
import java.util.Map;

public class Solution138 {

    Map<Node, Node> map = new HashMap<>();

    public Node copyRandomList(Node head) {
        return copy(head);
    }

    public Node copy(Node node) {
        if (node == null) return null;
        if (map.containsKey(node)) return map.get(node);
        Node newNode = new Node(node.val);
        map.put(node, newNode);
        newNode.next = copy(node.next);
        newNode.random = copy(node.random);
        return newNode;
    }
}

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}