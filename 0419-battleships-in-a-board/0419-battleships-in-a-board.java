class Solution {
    public int countBattleships(char[][] board) {

        int count = 0;
        //iterate the whole matrix

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                // if the particular cell contains the X
                if (board[i][j] == 'X') {
                    findCount(i, j, board);
                    count++;
                }
            }
        }
        return count;
    }

    public void findCount(int row, int col, char[][] board) {
        // invalid index or empty cell
        if (row >= board.length || col >= board[0].length || board[row][col] == '.')
            return;

        // modifiy the visited cell
        board[row][col] = '.';

        // recursive call for vertical and horizontal
        findCount(row + 1, col, board);
        findCount(row, col + 1, board);
    }
}