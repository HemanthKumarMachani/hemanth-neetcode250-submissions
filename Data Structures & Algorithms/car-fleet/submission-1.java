class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        // input validation
        if (position == null || speed == null || position.length != speed.length)
            return 0;
        int n = position.length;
        Double[][] positionAndSpeed = new Double[n][2];
        for (int index = 0; index < n; index++) {
            positionAndSpeed[index][0] = (double) position[index];
            positionAndSpeed[index][1] = (double) (target - position[index]) / speed[index];
        }
        // sort them by initial starting position in ascending order
        Arrays.sort(positionAndSpeed, (a, b) -> Double.compare(a[0], b[0]));

        int fleetCount = 0;
        double carFleetTimeToTarget = 0.0;
        // start iterating from the car closest to the target (Rigth -> Left)
        for (int index = n - 1; index >= 0; index--) {
            double carTimeToTarget = positionAndSpeed[index][1];
            // if this car takes LONGER than the car fleet ahead of it
            // it will never catch up and becomes the leader of new car fleet;
            if (carTimeToTarget > carFleetTimeToTarget) {
                fleetCount++;
                carFleetTimeToTarget = carTimeToTarget;
            }
            // else if it takes less time merges in to the current fleet
        }
        return fleetCount;
    }
}
