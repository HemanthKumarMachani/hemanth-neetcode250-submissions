class Solution {
    public int[] sortArrayByParity(int[] nums) {
        // input validation
        if (nums == null)
            return nums;
        int evenCount = 0;
        int[] sortedResult = new int[nums.length];
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] % 2 == 0) {
                evenCount++;
            }
        }
        int evenIdx = 0, oddIdx = evenCount;
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] % 2 == 0)
                sortedResult[evenIdx++] = nums[index];
            else
                sortedResult[oddIdx++] = nums[index];
        }
        return sortedResult;
    }
}