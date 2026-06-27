class Solution {
    public void rotate(int[] nums, int k) {
        // calculating the rotations
        int rotations = k % nums.length;
        // reverse the array {1,2,3,4,5,6,7,8} -> {8,7,6,5,4,3,2,1}
        rotate(0, nums.length - 1, nums);
        // reverse 0 to k elements to get the rotated array {8,7,6,5,4,3,2,1} -> {5,6,7,8,4,3,2,1}
        rotate(0, rotations - 1, nums);
        // reverse the remaining values from k + 1 to nums.length to bring them back to their
        // original form before reversing {5,6,7,8,4,3,2,1} -> {5,6,7,8,1,2,3,4}
        rotate(rotations, nums.length - 1, nums);
    }
    public static void rotate(int left, int right, int[] nums) {
        while (left < right) {
            int temp = nums[left];
            nums[left++] = nums[right];
            nums[right--] = temp;
        }
    }
}