class Solution {
    public int duplicateNumbersXOR(int[] nums) {

        int[] count = new int[51];

        for (int i = 0; i < nums.length; i++) {
            count[nums[i]]++;
        }

        int answer = 0;

        for (int i = 0; i < count.length; i++) {

            if (count[i] == 2) {
                answer = answer ^ i;
            }
        }

        return answer;
    }
}