package dfs;

import java.util.Stack;

/**
 * Solution394
 */
public class Solution394 {
    public String decodeString(String s) {
        Stack<Integer> count = new Stack<>();
        Stack<String> result = new Stack<>();
        int i = 0;
        result.push("");
        while (i < s.length()) {
            char ch = s.charAt(i);
            if (ch >= '0' && ch <= '9') {
                int start = i;
                while (s.charAt(i + 1) >= '0' && s.charAt(i + 1) <= '9') i++;
                count.push(Integer.parseInt(s.substring(start, i + 1)));
            } else if (ch == '[') {
                result.push("");
            } else if (ch == ']') {
                String str = result.pop();
                StringBuilder sb = new StringBuilder();
                int times = count.pop();
                for (int j = 0; j < times; j += 1) {
                    sb.append(str);
                }
                result.push(result.pop() + sb.toString());
            } else {
                result.push(result.pop() + ch);
            }
            i += 1;
        }
        return result.pop();        
    }

    // private int pos = 0;
    // public String decodeString(String s) {
    //     StringBuilder sb = new StringBuilder();
    //     String num = "";
    //     for (int i = pos; i < s.length(); i++) {
    //         if (s.charAt(i) != '[' && s.charAt(i) != ']' && !Character.isDigit(s.charAt(i))) {
    //             sb.append(s.charAt(i));
    //         } else if (Character.isDigit(s.charAt(i))) {
    //             num += s.charAt(i);
    //         } else if (s.charAt(i) == '[') {
    //             pos = i + 1;
    //             String next = decodeString(s);
    //             for (int n = Integer.valueOf(num); n > 0; n--) sb.append(next);
    //             num = "";
    //             i = pos;
    //         } else if (s.charAt(i) == ']') {
    //             pos = i;
    //             return sb.toString();
    //         }
    //     }
    //     return sb.toString();
    // }
    
}