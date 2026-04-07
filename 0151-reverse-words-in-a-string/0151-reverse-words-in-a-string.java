class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder(s);
        StringBuilder ans = new StringBuilder();
        StringBuilder temp = new StringBuilder();

        sb.reverse();

        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);

            if (ch != ' ') {
                temp.append(ch);
            } else {
                if (temp.length() > 0) {
                    temp.reverse();
                    ans.append(temp).append(" ");
                    temp.setLength(0);
                }
            }
        }

        if (temp.length() > 0) {
            temp.reverse();
            ans.append(temp);
        }

        return ans.toString().trim();
    }
}