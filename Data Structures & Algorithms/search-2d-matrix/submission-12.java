class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // inpout validation
        if (matrix == null || matrix.length == 0)
            return false;
        int rows = matrix.length, cols = matrix[0].length;
        int low = 0, high = rows * cols - 1;
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
