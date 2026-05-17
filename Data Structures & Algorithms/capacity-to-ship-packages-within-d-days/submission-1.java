class Solution {
    public int shipWithinDays(int[] weights, int days) {
        // make sure input is valid
        if (weights == null || weights.length == 0)
            return 0;
        int left = Arrays.stream(weights).max().getAsInt();
        int right = Arrays.stream(weights).sum();
        int minCapacity = right;
        while (left <= right) {
            int cap = left + (right - left) / 2;
            if (canShip(weights, cap, days)) {
                minCapacity = Math.min(minCapacity, cap);
                right = cap - 1;
            } else {
                left = cap + 1;
            }
        }
        return minCapacity;
    }
    public static boolean canShip(int[] weights, int cap, int days) {
        int ships = 1, currentCap = cap;
        for (int weight : weights) {
            if (currentCap - weight < 0) {
                ships++;
                if (ships > days)
                    return false;
                currentCap = cap;
            }
            currentCap -= weight;
        }
        return true;
    }
}