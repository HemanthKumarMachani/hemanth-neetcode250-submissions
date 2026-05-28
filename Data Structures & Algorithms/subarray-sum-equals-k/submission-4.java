class Solution {
    public int subarraySum(int[] nums, int k) {
        // map: prefixSum -> how many times it has occurred
        Map<Integer, Integer> prefixCount = new HashMap<>();

        // Empty prefix (sum=0) exists once before we start
        prefixCount.put(0, 1);

        int currentSum = 0;
        int count = 0;

        for (int num : nums) {
            currentSum += num;                          // extend prefix to current index

            // How many previous prefixes had sum = (currentSum - k)?
            // Each one forms a valid subarray ending here
            int complement = currentSum - k;
            count += prefixCount.getOrDefault(complement, 0);

            // Record current prefix sum
            prefixCount.put(currentSum,
                prefixCount.getOrDefault(currentSum, 0) + 1);
        }

        return count;
    }
}