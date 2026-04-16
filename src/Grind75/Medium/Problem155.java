package Grind75.Medium;

import java.util.Stack;

public class Problem155 {

    private final Stack<Integer> st;
    private final Stack<Integer> minStack;

    public Problem155() {
        st = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {
        st.push(val);
        if (minStack.isEmpty()) {
            minStack.push(val);
        } else {
            minStack.push(Math.min(val, minStack.peek()));
        }
    }

    public void pop() {
        st.pop();
        minStack.pop();
    }

    public int top() {
        return st.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
