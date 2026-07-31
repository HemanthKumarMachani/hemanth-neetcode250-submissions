class Solution {
    public boolean isValidSudoku(char[][] board) {
        // input validation
        if (board == null)
            return false;
        int N = board[0].length;
        // Initialize the N*N board
        Set<Character>[] rows = new HashSet[N];
        Set<Character>[] cols = new HashSet[N];
        Set<Character>[] squares = new HashSet[N];
        for (int i = 0; i < N; i++) {
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            squares[i] = new HashSet<>();
        }
        // validate each row, column, and square
        for (int row = 0; row < N; row++) {
            for (int col = 0; col < N; col++) {
                char val = board[row][col];
                int squareIdx = (row / 3) * 3 + (col / 3);
                if (val == '.')
                    continue;
                if (!rows[row].add(val))
                    return false;
                if (!cols[col].add(val))
                    return false;
                if (!squares[squareIdx].add(val))
                    return false;
            }
        }
        return true;
    }
}
