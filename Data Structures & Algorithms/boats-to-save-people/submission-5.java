class Solution {
    public int numRescueBoats(int[] people, int limit) {
        // input validation
        if (people == null || people.length == 0 || limit == 0)
            return 0;
        //Arrays.sort(people); TC : (NlongN)
        //replace with counting sort to reduce TC to O(N)
        int[] count = new int[limit + 1];
        //count people freq
        for (int p : people) {
            count[p]++;
        }
        //As now we have freq, use count sort to sort people in O(N)
        int pIdx = 0;
        for (int val = 1; val < count.length; val++) {
            while (count[val] > 0) {
                people[pIdx++] = val;
                count[val]--;
            }
        }
        // Two-Pointer approach to find minBoats required
        int left = 0, right = people.length - 1, minBoats = 0;
        while (left <= right) {
            if (people[left] + people[right] <= limit) {
                left++;
            }
            right--;
            minBoats++;
        }
        return minBoats;
    }
}