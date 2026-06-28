class Solution {
    public int uniquePaths(int m, int n) {
        int [][] mat = new int[m][n];
        //fill the first 0th row with 1
        for(int i = 0; i<n; i++){   
            mat[0][i] = 1;
        }
        //fill 0th col with 1
        for(int j = 0; j<m; j++){
            mat [j][0] = 1;
        }
        //complete the mat from 1,1 to m-1,n-1
        for(int i = 1; i<m; i++){
            for(int j =1; j<n; j++){
                mat[i][j] = mat[i-1][j] + mat[i][j-1];
        }
        }
        return mat[m-1][n-1];
    }
}