// Week 4 Task 7
// Question: Diagonal Difference
// Platform: HackerRank
// https://www.hackerrank.com/challenges/diagonal-difference/

import java.util.*;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        int x = 0;
        int y = 0;

        for (int i = 0; i < n; i++) {
            x += a[i][i];
            y += a[i][n - 1 - i];
        }

        System.out.println(Math.abs(x - y));
    }
}