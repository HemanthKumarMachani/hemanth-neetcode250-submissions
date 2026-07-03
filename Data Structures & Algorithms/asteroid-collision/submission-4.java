class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        // input validation
        if (asteroids == null || asteroids.length == 0)
            return asteroids;
        Deque<Integer> asteroidsState = new ArrayDeque<>();
        for (int asteroid : asteroids) {
            while (!asteroidsState.isEmpty() && asteroid < 0 && asteroidsState.peek() > 0) {
                int diff = asteroid + asteroidsState.peek();
                if (diff < 0) {
                    asteroidsState.pop();
                } else if (diff > 0) {
                    asteroid = 0;
                } else {
                    asteroidsState.pop();
                    asteroid = 0;
                }
            }
            if (asteroid != 0)
                asteroidsState.push(asteroid);
        }
        int[] state = new int[asteroidsState.size()];
        int index = 0;
        while (!asteroidsState.isEmpty()) {
            state[index++] = asteroidsState.pollLast();
        }
        return state;
    }
}