class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        // input validation
        if (asteroids == null || asteroids.length == 0)
            return asteroids;
        // stack to asteroids
        Deque<Integer> stack = new ArrayDeque<>();
        for (int a : asteroids) {
            while (a < 0 && (!stack.isEmpty()) && stack.peek() > 0) {
                int diff = stack.peek() + a;
                if (diff == 0) {
                    stack.pop();
                    a = 0;
                } else if (diff < 0) {
                    stack.pop();
                } else {
                    a = 0;
                }
            }
            if (a != 0)
                stack.push(a);
        }
        int[] result = new int[stack.size()];
        int index = 0;
        while (!stack.isEmpty()) {
            result[index++] = stack.pollLast();
        }
        return result;
    }
}