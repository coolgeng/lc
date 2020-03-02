package design;

import java.util.HashMap;

/**
 * Solution146
 */
public class Solution146 {

    HashMap<Integer, Node> map;
    int capicity, count;
    Node head, tail;

    public LRUCache(int capacity) {
        this.capicity = capacity;
        map = new HashMap<>();
        head = new Node(0, 0);
        tail = new Node(0, 0);
        head.next = tail;
        tail.pre = head;
        head.pre = null;
        tail.next = null;
        count = 0;   
    }
    
    public int get(int key) {
        
    }
    
    public void put(int key, int value) {
        
    }
}

class Node {
    int key;
    int value;
    Node pre;
    Node next;
    
    public Node(int key, int value) {
        this.key = key;
        this.value = value;
    }
    }