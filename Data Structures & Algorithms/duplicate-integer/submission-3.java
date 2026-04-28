class Solution {
    public boolean hasDuplicate(int[] nums) {
        //make sure input is valid
        if(nums == null || nums.length == 0) return false;
        Set<Integer> seen = new HashSet<>();
        for(int num : nums){
            if(!seen.add(num)) return true;
        }
        return false;
    }
}