// Week 4 Session 5 - Strassen's Matrix Multiplication
// Reference: GeeksforGeeks
// https://www.geeksforgeeks.org/strassens-matrix-multiplication/

public class StrassenMatrixMultiplication {
    static int[][] mul(int[][] a, int[][] b) {
        int m = a.length;
        int n = b[0].length;
        int k = b.length;
        int[][] c = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int x = 0; x < k; x++) {
                    c[i][j] += a[i][x] * b[x][j];
                }
            }
        }

        return c;
    }
}