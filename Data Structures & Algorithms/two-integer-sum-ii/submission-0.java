class Solution {
    public int[] twoSum(int[] numbers, int target) {
        //make sure input is valid
        if (numbers == null || numbers.length == 0)
            return numbers;
        int left = 0, right = numbers.length - 1;
        while (left < right) {
            //as the array is sorted, we can find the sum of inputs at left and right indexes
            //based on the sum we can move the left pointer to right when the sum is lower than the target
            //and move the right pointed to the left when the sum is higher than the target
            //else we found the indices that match the target
            //return the left and right indexes incrementing by 1 as array is 1-indexed.
            int sum = numbers[left] + numbers[right];
            if (sum > target)
                right--;
            else if (sum < target)
                left++;
            else {
                return new int[] { left + 1, right + 1 };
            }
        }
        return new int[] { -1, -1 };
    }
}