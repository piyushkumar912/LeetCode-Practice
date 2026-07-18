class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
 // Store maximum value of each column
        int[] maxCol = new int[n];
 // Find column maximums
        for(int j = 0; j<n; j++){
            int max = Integer.MIN_VALUE;
            for(int i = 0; i<m; i++){
                max = Math.max(max, matrix[i][j]);
            }
            maxCol[j] = max;
        }
// Replace -1 with column maximum
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                if(matrix[i][j] == -1){
                    matrix[i][j] = maxCol[j];
                }
            }
        }
        return matrix;
    }
}



//Time Complexity: O(m × n)
//Space Complexity: O(n)