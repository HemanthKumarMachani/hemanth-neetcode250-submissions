class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> stack = new ArrayDeque<>();
        for (int ad : asteroids) {
            while (!stack.isEmpty() && ad < 0 && stack.peek() > 0) {
                int diff = ad + stack.peek();
                if (diff < 0) {
                    stack.pop();
                } else if (diff > 0) {
                    ad = 0;
                } else {
                    ad = 0;
                    stack.pop();
                }
            }
            if (ad != 0) {
                stack.push(ad);
            }
        }
        int[] result = new int[stack.size()];
        int index = 0;
        while (!stack.isEmpty()) {
            result[index++] = stack.pollLast();
        }
        return result;
    }
}