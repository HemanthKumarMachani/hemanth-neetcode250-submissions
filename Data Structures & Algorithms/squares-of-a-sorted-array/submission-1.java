class Solution {
    public int[] sortedSquares(int[] nums) {
        if (nums == null || nums.length == 0)
            return nums;
        List<Integer> result = Arrays.stream(nums)
                                   .boxed()
                                   .map(i -> i * i)
                                   .sorted((a, b) -> a - b)
                                   .collect(Collectors.toList());
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}