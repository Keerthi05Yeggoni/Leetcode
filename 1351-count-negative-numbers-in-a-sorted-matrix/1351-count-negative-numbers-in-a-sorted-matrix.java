class Solution {
    public int countNegatives(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int row = 0;
        int col = grid[0].length-1;
        int cnt = 0;
        while(row<n && col>=0){
            if(grid[row][col]>=0){
                row++;
            }else{
                cnt += n-row;
                col--;
            }
        }
        return cnt;
    }
}