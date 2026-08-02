class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        // input validation
        if (asteroids == null || asteroids.length == 0)
            return asteroids;
        // stack to store asteroids state
        Deque<Integer> asteroidState = new ArrayDeque<>();
        for (int a : asteroids) {
            while (a < 0 && (!asteroidState.isEmpty()) && asteroidState.peek() > 0) {
                int diff = a + asteroidState.peek();
                if (diff < 0) {
                    asteroidState.pop();
                } else if (diff > 0) {
                    a = 0;
                } else {
                    asteroidState.pop();
                    a = 0;
                }
            }
            if (a != 0)
                asteroidState.push(a);
        }
        int[] state = new int[asteroidState.size()];
        int index = 0;
        while (!asteroidState.isEmpty()) {
            state[index++] = asteroidState.pollLast();
        }
        return state;
    }
}