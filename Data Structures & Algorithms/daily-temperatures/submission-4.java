class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        // input validation
        if (temperatures == null || temperatures.length < 2)
            return temperatures;
        int[] result = new int[temperatures.length];
        Deque<Integer> tempsIdx = new ArrayDeque<>();
        for (int index = 0; index < temperatures.length; index++) {
            while (!tempsIdx.isEmpty() && temperatures[index] > temperatures[tempsIdx.peek()]) {
                result[tempsIdx.peek()] = index - tempsIdx.pop();
            }
            tempsIdx.push(index);
        }
        return result;
    }
}
