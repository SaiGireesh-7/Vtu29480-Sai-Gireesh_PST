// Week 4 Task 9
// Question: Matrix Block Sum
// Platform: LeetCode
// https://leetcode.com/problems/matrix-block-sum/

class MatrixBlockSum {
    public int[][] matrixBlockSum(int[][] mat, int k) {
        int m = mat.length;
        int n = mat[0].length;
        int[][] ans = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int x = Math.max(0, i - k); x <= Math.min(m - 1, i + k); x++) {
                    for (int y = Math.max(0, j - k); y <= Math.min(n - 1, j + k); y++) {
                        ans[i][j] += mat[x][y];
                    }
                }
            }
        }

        return ans;
    }
}