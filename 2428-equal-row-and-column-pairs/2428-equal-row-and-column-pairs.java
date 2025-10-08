class Solution {
    public int equalPairs(int[][] grid) {

        int n = grid.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            count += hasPair(grid, i, 0);
        }
        return count;
    }

    public int hasPair(int grid[][], int i, int j) {
        int col = 0;
        int count = 0;
        while (col < grid.length) {

            if (grid[0][col] == grid[i][j]) {
                boolean flag = true;
                for (int k = 0; k < grid.length; k++) {
                    if (grid[i][k] != grid[k][col]) {
                        flag = false;
                        break;
                    }
                }
                if (flag)
                    count++;
            }
            col++;
        }
        return count;
    }
}