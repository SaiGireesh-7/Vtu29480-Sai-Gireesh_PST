// Week 5 Task 2
// Question: The Birthday Bar / Birthday Chocolate
// Platform: HackerRank
// https://www.hackerrank.com/challenges/the-birthday-bar/

import java.util.*;

public class BirthdayChocolate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int d = sc.nextInt();
        int m = sc.nextInt();
        int count = 0;

        for (int i = 0; i <= n - m; i++) {
            int sum = 0;

            for (int j = i; j < i + m; j++) {
                sum += a[j];
            }

            if (sum == d) {
                count++;
            }
        }

        System.out.println(count);
    }
}