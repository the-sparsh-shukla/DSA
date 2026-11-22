
import java.util.*;

class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> st = new Stack<>();
        StringBuilder ans = new StringBuilder(s);

      
        for (int i = 0; i < ans.length(); i++) {
            char ch = ans.charAt(i);

            if (ch == '(') {
                st.push(i);
            } 
            else if (ch == ')') {
                if (!st.isEmpty()) {
                    st.pop();
                } else {
                    ans.setCharAt(i, '*');
                }
            }
        }

      
        while (!st.isEmpty()) {
            ans.setCharAt(st.pop(), '*');
        }

        
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < ans.length(); i++) {
            if (ans.charAt(i) != '*') {
                result.append(ans.charAt(i));
            }
        }

        return result.toString();
    }
}
