class Solution {
    public int[] sortedSquares(int[] nums) {
        if (nums == null || nums.length == 0)
            return nums;
        int [] result = Arrays.stream(nums)
                                   .boxed()
                                   .map(i -> i * i)
                                   .sorted((a, b) -> a - b)
                                   .mapToInt(Integer::intValue)
                                   .toArray();
        //return result.stream().mapToInt(Integer::intValue).toArray();
        return result;
    }
}