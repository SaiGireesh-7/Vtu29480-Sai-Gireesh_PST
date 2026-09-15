// Week 4 Task 3
// Question: Compare the Triplets
// Platform: HackerRank
// https://www.hackerrank.com/challenges/compare-the-triplets/problem

import java.util.*;

public class CompareTheTriplets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 0;

        for (int i = 0; i < 3; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            if (x > y) {
                a++;
            } else if (x < y) {
                b++;
            }
        }

        System.out.println(a + " " + b);
    }
}