class Solution {
    public int findFinalValue(int[] nums, int original) {

        boolean found = true;

        while (found) {

            found = false;

            for (int i = 0; i < nums.length; i++) {

                if (nums[i] == original) {
                    original = original * 2;
                    found = true;
                    break;
                }
            }
        }

        return original;
    }
}