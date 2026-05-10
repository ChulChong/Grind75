package Grind75.Medium;

import java.util.Stack;

public class Problem150 {
    public static void main(String[] args) {
        String[] token = {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
        System.out.println(evalRPN(token));
    }

    public static int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for (String s : tokens) {
            if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
                int b = st.pop();
                int a = st.pop();
                if (s.equals("+")) st.push(a + b);
                else if (s.equals("-")) st.push(a - b);
                else if (s.equals("*")) st.push(a * b);
                else st.push(a / b);
            } else {
                st.push(Integer.parseInt(s));
            }
        }
        return st.pop();

        /*Stack<String> st = new Stack<>();
        for (String s : tokens) {
            int num1 = 0;
            int num2 = 0;
            if (s.equals("+")) {
                num1 = Integer.parseInt(st.pop());
                num2 = Integer.parseInt(st.pop());
                st.push(String.valueOf(num1 + num2));
            } else if (s.equals("-")) {
                num1 = Integer.parseInt(st.pop());
                num2 = Integer.parseInt(st.pop());
                st.push(String.valueOf(num2 - num1));
            } else if (s.equals("*")) {
                num1 = Integer.parseInt(st.pop());
                num2 = Integer.parseInt(st.pop());
                st.push(String.valueOf(num1 * num2));
            } else if (s.equals("/")) {
                num1 = Integer.parseInt(st.pop());
                num2 = Integer.parseInt(st.pop());
                st.push(String.valueOf(num2 / num1));
            } else {
                st.push(s);
            }
        }
        return Integer.parseInt(st.pop());*/
    }


}
