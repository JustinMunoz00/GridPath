public class GridPath {
    /** Initialized in the constructor with distinct values that never change */
    private int[][] grid;

    public GridPath (int[][] values)
    {
        grid = values; 
    }

    /**
     * Returns the Location representing a neighbor of the grid element at row and
     * col,
     * as described in part (a)
     * Preconditions: row is a valid row index and col is a valid column index in
     * grid.
     * row and col do not specify the element in the last row and last column of
     * grid.
     */
    public Location getNextLoc(int row, int col) {
        int below;
        int right;
        boolean missingBelow = false;
        if (grid.length > row+1) below = grid[row+1][col];
        else {
            missingBelow = true;
            below = 0;
        }
        if (grid[row].length > col+1 ) right = grid[row][col+1];
        else return new Location(row+1, col);
        if (!missingBelow && below < right) return new Location(row+1, col);
        else return new Location(row, col+1);
    }

    /**
     * Computes and returns the sum of all values on a path through grid, as
     * described in
     * part (b)
     * Preconditions: row is a valid row index and col is a valid column index in
     * grid.
     * row and col do not specify the element in the last row and last column of
     * grid.
     */
    public int sumPath(int row, int col) {
        Location loc = new Location(row, col);
        int sum = grid[row][col];
        int r = loc.getRow();
        int c = loc.getCol();
        while (r < grid.length - 1 || c < grid[r].length - 1){
            loc = getNextLoc(r, c);
            r = loc.getRow();
            c = loc.getCol();
            sum += grid[r][c];
        }
        return sum;
    }
    public String toString() {
        String s = "";
        for (int[] row:grid){
            for (int col:row){
                s += col + " ";
            }
            s += "\n";
        }
        return s;
    }
}