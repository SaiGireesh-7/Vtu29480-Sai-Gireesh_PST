// Week 5 Task 3
// Question: Max Subarray
// Platform: HackerRank
// https://www.hackerrank.com/challenges/maxsubarray/

import java.util.*;

public class MaxSubarrayHackerRank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            boolean positive = false;
            int max = Integer.MIN_VALUE;

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                if (a[i] > 0) positive = true;
                max = Math.max(max, a[i]);
            }

            int cur = 0;
            int best = Integer.MIN_VALUE;
            int sum = 0;

            for (int x : a) {
                cur = Math.max(x, cur + x);
                best = Math.max(best, cur);
                if (x > 0) sum += x;
            }

            System.out.println(positive ? best + " " + sum : max + " " + max);
        }
    }
}