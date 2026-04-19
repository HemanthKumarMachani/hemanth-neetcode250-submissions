class Solution {
    public int search(int[] nums, int target) {
        //make sure input is valid
        if(nums == null || nums.length == 0) return -1;
        int low = 0, high = nums.length-1;
        while(low <= high){
            int mid = low + (high - low)/2; //safe way to find mid and avoids integer overflow
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] < target){
                low = mid +1;
            }else{
                high = mid -1;
            }
        }
        return -1;
    }
}
