class Solution {
    public void rotate(int[] nums, int k) {
        int rotations = k % nums.length;
        // reverse entire array
        rotate(nums, 0, nums.length - 1); //{1,2,3,4,5,6,7,8} -> {8,7,6,5,4,3,2,1}
        // rotate from 0 to k - 1
        rotate(nums, 0, rotations - 1); //{8,7,6,5,4,3,2,1} -> {5,6,7,8,4,3,2,1}
        // rotate the other half
        rotate(nums, rotations, nums.length - 1); //{5,6,7,8,4,3,2,1} -> {5,6,7,8,1,2,3,4}
    }
    public static void rotate(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start++] = nums[end];
            nums[end--] = temp;
        }
    }
}