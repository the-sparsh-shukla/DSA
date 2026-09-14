class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        int n = nums.length;

        int[] freq = new int[n + 1];

        for (int i = 0; i < n; i++) {
            freq[nums[i]]++;
        }
         List<Integer> result = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (freq[i] == 0) {
                result.add(i);
            }
        }

        return result;
    }
}