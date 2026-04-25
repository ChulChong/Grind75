package Grind75.Review;

import java.util.Stack;

public class Problem232 {
    private final Stack<Integer> st;
    private final Stack<Integer> que;

    public Problem232() {
        this.st = new Stack<>();
        this.que = new Stack<>();
    }

    public void push(int x) {
        st.push(x);
    }

    public int pop() {
        if (que.isEmpty()) {
            while (!st.isEmpty()) {
                que.push(st.pop());
            }
        }
        return que.pop();
    }

    public int peek() {
        if (que.isEmpty()) {
            while (!st.isEmpty()) {
                que.push(st.pop());
            }
        }
        return que.peek();
    }

    public boolean empty() {
        return st.empty() && que.empty();
    }
}
