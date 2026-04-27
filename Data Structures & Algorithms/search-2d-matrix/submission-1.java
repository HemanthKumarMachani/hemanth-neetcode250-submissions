class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //make sure input is valid
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return false;
        int rows = matrix.length, cols = matrix[0].length, low = 0, high = rows * cols - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int midValue = matrix[mid / cols][mid % cols];
            if (midValue == target)
                return true;
            else if (midValue < target)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return false;
    }
}