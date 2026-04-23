package Grind75.Review;

import java.util.Stack;

public class Problem20 {

    public static void main(String[] args) {
        String s = "()[]{}";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                st.push(c);
            } else {
                if (st.isEmpty()) return false;
                char stPop = st.pop();
                if (c == ')' && stPop != '(' || c == '}' && stPop != '{' || c == ']' && stPop != '[') {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}
