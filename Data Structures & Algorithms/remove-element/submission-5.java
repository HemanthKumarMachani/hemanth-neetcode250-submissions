class Solution {
    public int removeElement(int[] nums, int val) {
        //make sure input is valid
        if(nums == null || nums.length == 0) return 0;
        int count = 0;
        for(int num : nums){
            if(num != val) nums[count++] = num;
        }
        return count;
    }
}