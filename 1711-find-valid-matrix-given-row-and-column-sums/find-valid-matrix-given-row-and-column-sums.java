class Solution {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int rows = rowSum.length;
        int cols = colSum.length;
        int cur_row = 0 , cur_col = 0;
        int[][] res = new int[rows][cols];

        while(cur_row < rows || cur_col < cols){
            if(cur_row >= rows){
                res[rows - 1][cur_col] = colSum[cur_col];
                cur_col++;
                continue;
            }else if(cur_col >= cols){
                res[cur_row][cols - 1] = rowSum[cur_row];
                cur_row++;
                continue;
            }

            int value = Math.min(rowSum[cur_row] , colSum[cur_col]);
            rowSum[cur_row] -= value;
            colSum[cur_col] -= value;
            res[cur_row][cur_col] = value;

            if(rowSum[cur_row] == 0){
                cur_row++;
            }
            if(colSum[cur_col] == 0){
                cur_col++;
            }
        }
        return res;
    }
}