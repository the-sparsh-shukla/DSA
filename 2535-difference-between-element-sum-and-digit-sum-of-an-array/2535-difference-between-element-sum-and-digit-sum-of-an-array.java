class Solution {
    public int differenceOfSum(int[] nums) {

        int elementSum = 0;
        int digitSum = 0;

        for (int i = 0; i < nums.length; i++) {

            elementSum = elementSum + nums[i];

            int n = nums[i];

            while (n > 0) {
                int digit = n % 10;
                digitSum = digitSum + digit;
                n = n / 10;
            }
        }

        return Math.abs(elementSum - digitSum);
    }
}