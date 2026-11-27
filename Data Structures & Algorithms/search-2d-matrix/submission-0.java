class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int L = 0;
        int R = matrix[0].length - 1;
        int row = 0;


        while (row < matrix.length){
            if (L>R){
                row++;
                L = 0;
                R = matrix[0].length - 1;
                continue;

            } 
            int mid = (L+R) / 2;
            if (matrix[row][mid] == target) return true;
            if(matrix[row][mid] > target) R = mid - 1;
            else L = mid + 1;
        }

        return false;
                                                                      
    }
}
