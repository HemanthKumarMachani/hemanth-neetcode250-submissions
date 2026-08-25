class Solution {
    public int shipWithinDays(int[] weights, int days) {
        if (weights == null)
            return 0;
        int low = 0, high = 0;
        for (int w : weights) {
            low = Math.max(low, w);
            high += w;
        }
        int result = high;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (canShip(weights, mid, days)) {
                result = Math.min(result, mid);
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }
    public boolean canShip(int[] weights, int capacity, int days) {
        int currentCapacity = capacity, ships = 1;
        for (int w : weights) {
            if (currentCapacity - w < 0) {
                ships++;
                if (ships > days) {
                    return false;
                }
                currentCapacity = capacity;
            }
            currentCapacity -= w;
        }
        return true;
    }
}