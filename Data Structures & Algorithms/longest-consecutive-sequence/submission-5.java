class Solution {
    public int longestConsecutive(int[] nums) {
        //make sure input is valid
        if (nums == null || nums.length == 0)
            return 0;
        int longestConsecutiveSeq = 0;
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums)
            numSet.add(num);
        for (int num : numSet) {
            if (!numSet.contains(num - 1)) {
                int currentNum = num, currentLongest = 1;
                while (numSet.contains(currentNum + 1)) {
                    currentLongest++;
                    currentNum++;
                }
                longestConsecutiveSeq = Math.max(longestConsecutiveSeq, currentLongest);
            }
        }
        return longestConsecutiveSeq;
    }
}
