class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> res = new ArrayList<>();

        for(int i=0;i<matrix.length;i++){
            int minCol = findMinCol(matrix , i);
            int candidate = matrix[i][minCol];

            if(isMaxInCol(matrix , candidate , minCol)){
                res.add(candidate);
            }
        }
        return res;
    }
    private int findMinCol(int[][] matrix , int row){
        int minVal = matrix[row][0] , minCol = 0;
        for(int i=1;i<matrix[row].length;i++){
            if(matrix[row][i] < minVal){
                minVal = matrix[row][i];
                minCol = i;
            }
        }
        return minCol;
    }
    private boolean isMaxInCol(int[][] matrix , int val , int col){
        for(int i=0;i<matrix.length;i++){
            if(matrix[i][col] > val) return false;
        }
        return true;
    }
}