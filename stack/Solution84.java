package stack;

/**
 * Solution84
 */
public class Solution84 {

    public int largestRectangleArea(int[] heights) {
        int maxarea = 0;
        for (int i = 0; i < heights.length; i++) {
            for (int j = i; j < heights.length; j++) {
                int minheight = Integer.MAX_VALUE;
                for (int k = i; k <= j; k++)
                    minheight = Math.min(minheight, heights[k]);
                maxarea = Math.max(maxarea, minheight * (j - i + 1));
            }
        }
        return maxarea;
    }


    
    // public int calculateArea(int[] heights, int start, int end) {
    //     if (start > end)
    //         return 0;
    //     int minindex = start;
    //     for (int i = start; i <= end; i++)
    //         if (heights[minindex] > heights[i])
    //             minindex = i;
    //     return Math.max(heights[minindex] * (end - start + 1), Math.max(calculateArea(heights, start, minindex - 1), calculateArea(heights, minindex + 1, end)));
    // }
    // public int largestRectangleArea(int[] heights) {
    //     return calculateArea(heights, 0, heights.length - 1);
    // }


//     In this approach, we maintain a stack. Initially, we push a -1 onto the stack to mark the end. We start with the leftmost bar and keep pushing 
//     the current bar's index onto the stack until we get two successive numbers in descending order, i.e. until we get a[i]<a[i-1]a[i]<a[i−1]. Now, we 
//      start popping the numbers from the stack until we hit a number stack[j]stack[j] on the stack such that a\big[stack[j]\big] \leq a[i]a[stack[j]]≤a[i]. 
//      Every time we pop, we find out the area of rectangle formed using the current element as the height of the rectangle and the difference between the the current
// element's index pointed to in the original array and the element stack[top-1] -1stack[top−1]−1 as the width i.e. if we pop an element stack[top]stack[top] 
// and i is the current index to which we are pointing in the original array, the current area of the rectangle will be considered as:

// (i-stack[top-1]-1) \times a\big[stack[top]\big].(i−stack[top−1]−1)×a[stack[top]].

// Further, if we reach the end of the array, we pop all the elements of the stack and at every pop, this time we use the following equation to 
// find the area: (stack[top]-stack[top-1]) \times a\big[stack[top]\big](stack[top]−stack[top−1])×a[stack[top]], where stack[top]stack[top] refers 
//to the element just popped. Thus, we can get the area of the of the largest rectangle by comparing the new area found everytime.

// The following example will clarify the process further:
    public class Solution {
        public int largestRectangleArea(int[] heights) {
            Stack < Integer > stack = new Stack < > ();
            stack.push(-1);
            int maxarea = 0;
            for (int i = 0; i < heights.length; ++i) {
                while (stack.peek() != -1 && heights[stack.peek()gs] >= heights[i])
                    maxarea = Math.max(maxarea, heights[stack.pop()] * (i - stack.peek() - 1));
                stack.push(i);
            }
            while (stack.peek() != -1)
                maxarea = Math.max(maxarea, heights[stack.pop()] * (heights.length - stack.peek() -1));
            return maxarea;
        }
    }
    


}