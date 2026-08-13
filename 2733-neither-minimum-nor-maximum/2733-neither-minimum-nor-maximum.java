class Solution {
    public int findNonMinOrMax(int[] nums) {
         if (nums.length <= 2) {
            return -1;
        }

        int min = nums[0];
        int max = nums[0];

        
        for (int num : nums) {
            if (num < min) {
                min = num;
            }

            if (num > max) {
                max = num;
            }
        }

        
        for (int num : nums) {
            if (num != min && num != max) {
                return num;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] nums = {3, 2, 1, 4};

    }
    
}