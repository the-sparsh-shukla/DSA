class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int left = 0, right = n - 1;
        for(int num : nums){
            if(num % 2 == 0) ans[left++] = num;
            else ans[right--] = num;
        }
        return ans;
    }
}
