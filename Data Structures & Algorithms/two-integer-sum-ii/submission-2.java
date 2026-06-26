class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // input validation
        if (numbers == null || numbers.length == 0)
            return numbers;
        int left = 0, right = numbers.length - 1;
        while (left < right) {
            if (numbers[left] + numbers[right] == target) {
                return new int[] {left + 1, right + 1};
            } else if (numbers[left] + numbers[right] > target)
                right--;
            else
                left++;
        }
        return new int[] {-1, -1};
    }
}
