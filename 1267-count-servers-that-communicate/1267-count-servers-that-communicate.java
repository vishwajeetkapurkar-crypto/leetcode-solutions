class Solution {
    public int countServers(int[][] grid) {

        int rowcount[] = new int[grid.length];
        int columncount[] = new int[grid[0].length];
        int result = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    rowcount[i] += 1;
                    columncount[j] += 1;
                }
            }
        }

           for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                
                if (grid[i][j] == 1) {
                    if (rowcount[i] > 1 || columncount[j] > 1) {
                        result++;
                    }
                }
            }
        }
        return result;
    }
}