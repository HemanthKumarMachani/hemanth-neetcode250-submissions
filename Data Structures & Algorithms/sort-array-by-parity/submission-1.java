class Solution {
    public int[] sortArrayByParity(int[] nums) {
        // input validation
        if (nums == null)
            return nums;
        int evenIdx = 0;
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] % 2 == 0) {
                int temp = nums[evenIdx];
                nums[evenIdx++] = nums[index];
                nums[index] = temp;
            }
        }
        return nums;
    }
}