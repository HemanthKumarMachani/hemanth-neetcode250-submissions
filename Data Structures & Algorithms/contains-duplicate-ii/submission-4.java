class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        //make sure input is valid
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

        //Below implementation doesn't work when n and ka are same for example nums = [24,24] and k = 2
        // int start = 0;
        // int end = k;
        // while (end < nums.length) {
        //     Set<Integer> seen = new HashSet<>();
        //     for (int index = start; index <= end; index++) {
        //         if (seen.contains(nums[index]))
        //             return true;
        //         seen.add(nums[index]);
        //     }
        //     start++;
        //     end++;
        // }
        // return false;
    }
}