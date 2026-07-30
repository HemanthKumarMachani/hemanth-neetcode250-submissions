class Solution {
    public int longestConsecutive(int[] nums) {
        // input validation
        if (nums == null || nums.length == 0)
            return 0;
        int lcs = 0;
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }
        for (int n : numSet) {
            if (!numSet.contains(n - 1)) {
                int currentLongest = 1;
                int currNum = n;
                while (numSet.contains(currNum + 1)) {
                    currentLongest++;
                    currNum++;
                }
                lcs = Math.max(currentLongest, lcs);
            }
        }
        return lcs;
    }
}
