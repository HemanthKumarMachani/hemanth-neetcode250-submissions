class Solution {
    public int[] sortedSquares(int[] nums) {
        if (nums == null || nums.length == 0)
            return nums;
        return Arrays.stream(nums).map(i -> i * i).sorted().toArray();
    }
}