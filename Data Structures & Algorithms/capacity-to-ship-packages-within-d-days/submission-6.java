class Solution {
    public int shipWithinDays(int[] weights, int days) {
        // input validation
        if (weights == null)
            return 0;
        int low = 0, high = 0;
        for (int w : weights) {
            low = Math.max(low, w);
            high += w;
        }
        int minCapacity = high;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (canShip(weights, mid, days)) {
                high = mid - 1;
                minCapacity = Math.min(minCapacity, mid);
            } else {
                low = mid + 1;
            }
        }
        return minCapacity;
    }
    public static boolean canShip(int[] weights, int capacity, int days) {
        int currentCap = capacity, ships = 1;
        for (int weight : weights) {
            if (currentCap - weight < 0) {
                ships++;
                if (ships > days)
                    return false;
                currentCap = capacity;
            }
            currentCap -= weight;
        }
        return true;
    }
}