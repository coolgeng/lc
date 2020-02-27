package stack;

import java.io.ObjectOutputStream.PutField;
import java.util.Stack;

/**
 * Solution232
 */
public class Solution232 {
 /** Initialize your data structure here. */
private Stack<Integer> input ;
private Stack<Integer> output ;

public MyQueue() {
    input = new Stack<>();
    output = new Stack<>();
}

/** Push element x to the back of queue. */
public void push(int x) {
    input.push(x);
}

/** Removes the element from in front of queue and returns that element. */
public int pop() {
    if (output.size() != 0) {
        return output.pop();
    }
    while (!input.isEmpty()) {
        output.push(input.pop());
    }
    return output.pop();
}

/** Get the front element. */
public int peek() {
    if (output.size() != 0) {
        return output.peek();
    }   
    while (!input.isEmpty()) {
        output.push(input.pop());
    }
    return output.peek();
}

/** Returns whether the queue is empty. */
public boolean empty() {
    if (input.size() == 0 && output.size() ==0) return true;
    return false;
}
    
}