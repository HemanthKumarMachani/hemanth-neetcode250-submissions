class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        //make sure input is valid
        if(nums == null || nums.length == 0) return 0;
        int left = 0, sum = 0, minLen = Integer.MAX_VALUE;
        for(int right = 0; right < nums.length; right++){
            sum += nums[right];
            while(sum >= target){
                minLen = Math.min(minLen, right - left + 1);
                sum -= nums[left];
                left++;
            }
        }
        return (minLen == Integer.MAX_VALUE) ? 0 : minLen;
    }
}