class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // make sure input is valid
        if (matrix == null)
            return false;
        int rows = matrix.length, cols = matrix[0].length, low = 0, high = (rows * cols) - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int midVal = matrix[mid / cols][mid % cols];
            if (midVal == target)
                return true;
            else if (midVal < target)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return false;
    }
}
