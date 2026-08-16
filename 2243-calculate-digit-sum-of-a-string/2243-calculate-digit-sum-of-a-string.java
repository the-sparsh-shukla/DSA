class Solution {
    public String digitSum(String s, int k) {

        while (s.length() > k) {

            String newString = "";

            for (int i = 0; i < s.length(); i += k) {

                int sum = 0;

                for (int j = i; j < i + k && j < s.length(); j++) {
                    sum = sum + (s.charAt(j) - '0');
                }

                newString = newString + sum;
            }

            s = newString;
        }

        return s;
    }
}