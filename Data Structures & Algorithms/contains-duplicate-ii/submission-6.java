class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // input validation
        if (nums == null || nums.length == 0)
            return false;
        Set<Integer> seen = new HashSet<>();
        for (int index = 0; index < nums.length; index++) {
            if (index > k) {
                seen.remove(nums[index - k - 1]);
            }
            if (!seen.add(nums[index])) {
                return true;
            }
            seen.add(nums[index]);
        }
        return false;
    }
}