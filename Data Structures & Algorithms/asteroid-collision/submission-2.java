class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        // input validation
        if (asteroids == null || asteroids.length == 0)
            return asteroids;
        Deque<Integer> dq = new ArrayDeque<>();
        for (int a : asteroids) {
            // collision happens only when asteroids move in opposite direction
            while (!dq.isEmpty() && a < 0 && dq.peek() > 0) {
                int diff = a + dq.peek();
                if (diff < 0) {
                    dq.pop(); // bigger negative, destroyed
                } else if (diff > 0) {
                    a = 0;
                } else {
                    a = 0;
                    dq.pop(); // both are destroyed
                }
            }
            if (a != 0) {
                dq.push(a); // new asteroid
            }
        }
        int[] stateAfterCollision = new int[dq.size()];
        int index = 0;
        while (!dq.isEmpty()) {
            stateAfterCollision[index++] = dq.pollLast();
        }
        return stateAfterCollision;
    }
}