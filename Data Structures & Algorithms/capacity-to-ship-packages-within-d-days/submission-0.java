class Solution {
    public int shipWithinDays(int[] weights, int days) {
        // make sure input is valid
        if (weights == null || weights.length == 0)
            return 0;
        int minCapacity = Arrays.stream(weights).max().getAsInt();
        while (true) {
            int ships = 1;
            int cap = minCapacity;
            for (int weight : weights) {
                if (cap - weight < 0) {
                    ships++;
                    cap = minCapacity;
                }
                cap -= weight;
            }
            if (ships <= days)
                return minCapacity;
            minCapacity++;
        }
    }
}