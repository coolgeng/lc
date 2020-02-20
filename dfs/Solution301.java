package day4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

/**
 * Solution301
 */
public class Solution301 {

    int l = 0;
    int r = 0;
    
    private boolean isValid(String s) {
        int count = 0;
        for (char ch:s.toCharArray()) {
            if (ch=='(') {
                count ++; 
            } else if (ch ==')') {
                count --;
            } 
            if (count < 0) return false;
        }
        return true;
    }

    public List<String> removeInvalidParentheses(String s) {
      List<String> res = new ArrayList<>();
      
      // sanity check
      if (s == null) return res;
      
      Set<String> visited = new HashSet<>();
      Queue<String> queue = new LinkedList<>();
      
      // initialize
      queue.add(s);
      visited.add(s);
      
      boolean found = false;
      
      while (!queue.isEmpty()) {
        s = queue.poll();
        
        if (isValid(s)) {
          // found an answer, add to the result
          res.add(s);
          found = true;
        }
      
        if (found) continue;
      
        // generate all possible states
        for (int i = 0; i < s.length(); i++) {
          // we only try to remove left or right paren
          if (s.charAt(i) != '(' && s.charAt(i) != ')') continue;
        
          String t = s.substring(0, i) + s.substring(i + 1);
        
          if (!visited.contains(t)) {
            // for each state, if it's not visited, add it to the queue
            queue.add(t);
            visited.add(t);
          }
        }
      }
      
      return res;
    }
    
}