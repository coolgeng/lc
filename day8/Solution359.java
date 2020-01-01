package day8;

import java.util.HashMap;

/**
 * Solution359
 */
public class Solution359 {

    
}



class Logger {

    /** Initialize your data structure here. */
    public Logger() {
        
    }
    
    HashMap<String, Integer> msgMap = new HashMap<String, Integer>();
    
    /** Returns true if the message should be printed in the given timestamp, otherwise returns false.
        If this method returns false, the message will not be printed.
        The timestamp is in seconds granularity. */
    public boolean shouldPrintMessage(int timestamp, String message) {
        if (msgMap.containsKey(message)) {
            if ((timestamp - msgMap.get(message)) < 10) {
                return false;
            } else {
                msgMap.put(message, timestamp);
                return true;
            }
        } else {
            msgMap.put(message, timestamp);
            return true;
        }
    }
}