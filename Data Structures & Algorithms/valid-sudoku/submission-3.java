class Solution {
    public boolean isValidSudoku(char[][] board) {
        // input validation
        if (board == null)
            return false;
        int N = board[0].length;
        // initialize N*N board
        boolean[][] rows = new boolean[N][N];
        boolean[][] cols = new boolean[N][N];
        boolean[][] squares = new boolean[N][N];
        // Validate each row, column, square of the input board;
        for (int row = 0; row < N; row++) {
            for (int col = 0; col < N; col++) {
                int val = board[row][col];
                if (val == '.')
                    continue;
                // convert char digit to index (0 - 8)
                int idx = val - '1';
                int squareIdx = (row / 3) * 3 + (col / 3);
                if (rows[row][idx] || cols[col][idx] || squares[squareIdx][idx])
                    return false;
                // mark index val of row, col, square as seen
                rows[row][idx] = true;
                cols[col][idx] = true;
                squares[squareIdx][idx] = true;
            }
        }
        return true;
    }
}
