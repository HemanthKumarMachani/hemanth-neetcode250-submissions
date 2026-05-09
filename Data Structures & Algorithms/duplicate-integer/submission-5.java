class Solution {
    public boolean hasDuplicate(int[] nums) {
        // make sure input is valid
        if (nums == null || nums.length == 0)
            return false;
        Set<Integer> uniques = new HashSet<>();
        for (int num : nums) {
            if (!uniques.add(num))
                return true;
        }
        return false;
    }
}