class Solution {
    public int lengthOfLongestSubstring(String s) {

        ArrayList<Character> list = new ArrayList<>();

        int max = 0;

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            while (list.contains(ch)) {
                list.remove(0);
            }

            list.add(ch);

            if (list.size() > max) {
                max = list.size();
            }
        }

        return max;
    }
}