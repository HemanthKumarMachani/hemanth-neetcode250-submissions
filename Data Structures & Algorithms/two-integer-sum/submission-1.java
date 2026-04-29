class Solution {
    public int[] twoSum(int[] nums, int target) {
        //make sure input is valid
        if(nums == null || nums.length == 0) return new int []{-1, -1};
        Map<Integer, Integer> complementMap = new HashMap<>();
        for(int index = 0; index < nums.length; index++){
            int complement = target - nums[index];
            if(complementMap.containsKey(complement)){
                return new int [] {complementMap.get(complement), index};
            }
            complementMap.put(nums[index], index);
        }
        return new int []{-1, -1};
    }
}
