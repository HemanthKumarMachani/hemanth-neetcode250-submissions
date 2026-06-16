class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        // input validation
        if (temperatures == null || temperatures.length == 0)
            return temperatures;
        Deque<Integer> stack = new ArrayDeque<>();
        //Finding the days with warmer temperature
        for (int index = 0; index < temperatures.length; index++) {
            while (!stack.isEmpty() && temperatures[index] > temperatures[stack.peek()]) {
                temperatures[stack.peek()] = index - stack.pop();
            }
            stack.push(index);
        }
        //filling remaining days that doesn't see warmer temperature with 0
        for(int day : stack){
            temperatures[day] = 0;
        }
        return temperatures;
    }
}
