class Solution {
    public String toHex(int num) {
        if (num == 0) {
            return "0";
        }

        String hex = "0123456789abcdef";
        StringBuilder result = new StringBuilder();

        long n = num;

        if (n < 0) {
            n = n + 4294967296L;
        }

        while (n > 0) {
            int remainder = (int)(n % 16);
            result.append(hex.charAt(remainder));
            n = n / 16;
        }

        return result.reverse().toString();
    }
}