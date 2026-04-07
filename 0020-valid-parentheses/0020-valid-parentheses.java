import java.util.*;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for (char ch : s.toCharArray()) {
            // Push opening brackets
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else {
                // If stack empty, invalid
                if (st.isEmpty()) return false;

                // Check matching pairs
                if (ch == ')' && st.peek() != '(') return false;
                if (ch == '}' && st.peek() != '{') return false;
                if (ch == ']' && st.peek() != '[') return false;

                st.pop();
            }
        }
        return st.isEmpty();
    }
}