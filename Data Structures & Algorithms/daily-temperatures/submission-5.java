class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        // input validation
        if (temperatures == null || temperatures.length < 2)
            return temperatures;
        // We'll maintain the indexes of the days that are yet to see warmer temperature in a stack
        Deque<Integer> daysToSeeWarmerTemp = new ArrayDeque<>();
        // int[] result = new int[temperatures.length];
        for (int index = 0; index < temperatures.length; index++) {
            while (!daysToSeeWarmerTemp.isEmpty()
                && temperatures[daysToSeeWarmerTemp.peek()] < temperatures[index]) {
                temperatures[daysToSeeWarmerTemp.peek()] = index - daysToSeeWarmerTemp.pop();
            }
            daysToSeeWarmerTemp.push(index);
        }
        while (!daysToSeeWarmerTemp.isEmpty()) {
            temperatures[daysToSeeWarmerTemp.pop()] = 0;
        }
        return temperatures;
    }
}
