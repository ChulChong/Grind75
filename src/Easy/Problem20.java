package Easy;

import java.util.HashMap;
import java.util.Stack;

public class Problem20 {

    public static void main(String[] args) {
        String s = "()[]{}";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        HashMap<Character, Character> hm = new HashMap<>();
        hm.put(')', '(');
        hm.put('}', '{');
        hm.put(']', '[');
        for (char c : s.toCharArray()) {
            if (hm.containsKey(c)) {
                if (st.empty() || st.pop() != hm.get(c)) {
                    return false;
                }
            } else {
                st.push(c);
            }
        }
        return st.isEmpty();
    }


}
