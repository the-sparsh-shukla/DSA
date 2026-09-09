import java.util.Arrays;

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int window = s1.length();
        int length = s2.length();

        if (length < window) {
            return false;
        }

        int[] s1Arr = new int[26];
        int[] s2Arr = new int[26];

        
        for (int i = 0; i < window; i++) {
            int s1i = s1.charAt(i) - 'a';
            int s2i = s2.charAt(i) - 'a';

            s1Arr[s1i]++;
            s2Arr[s2i]++;
        }

        if (Arrays.equals(s1Arr, s2Arr)) {
            return true;
        }

        
        for (int i = 1; i <= length - window; i++) {
            int prev = s2.charAt(i - 1) - 'a';
            int next = s2.charAt(i + window - 1) - 'a';

            s2Arr[prev]--;
            s2Arr[next]++;

            if (Arrays.equals(s1Arr, s2Arr)) {
                return true;
            }
        }

        return false;
    }
}