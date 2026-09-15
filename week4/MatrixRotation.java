// Week 4 Task 10
// Question: Matrix Rotation
// Platform: HackerRank
// https://www.hackerrank.com/challenges/matrix-rotation-algo/

import java.util.*;

public class MatrixRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int r = sc.nextInt();
        int[][] a = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        for (int layer = 0; layer < Math.min(m, n) / 2; layer++) {
            int top = layer;
            int left = layer;
            int bottom = m - 1 - layer;
            int right = n - 1 - layer;
            int len = 2 * (bottom - top + right - left);
            int shift = r % len;
            int[] temp = new int[len];
            int p = 0;

            for (int i = top; i <= bottom; i++) temp[p++] = a[i][left];
            for (int j = left + 1; j <= right; j++) temp[p++] = a[bottom][j];
            for (int i = bottom - 1; i >= top; i--) temp[p++] = a[i][right];
            for (int j = right - 1; j > left; j--) temp[p++] = a[top][j];

            p = 0;
            for (int i = top; i <= bottom; i++) a[i][left] = temp[(p++ + shift) % len];
            for (int j = left + 1; j <= right; j++) a[bottom][j] = temp[(p++ + shift) % len];
            for (int i = bottom - 1; i >= top; i--) a[i][right] = temp[(p++ + shift) % len];
            for (int j = right - 1; j > left; j--) a[top][j] = temp[(p++ + shift) % len];
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}