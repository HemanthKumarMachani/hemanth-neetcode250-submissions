class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        // input validation
        if (temperatures == null || temperatures.length == 0)
            return temperatures;
        Deque<Integer> stack = new ArrayDeque<>();
        int[] result = new int[temperatures.length];
        // Finding the days with warmer temperature
        for (int index = 0; index < temperatures.length; index++) {
            while (!stack.isEmpty() && temperatures[index] > temperatures[stack.peek()]) {
                result[stack.peek()] = index - stack.pop();
            }
            stack.push(index);
        }
        return result;
    }
}
