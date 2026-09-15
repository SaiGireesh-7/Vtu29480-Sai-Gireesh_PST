// Week 6 Task 3
// Question: Two Strings
// Platform: HackerRank
// https://www.hackerrank.com/challenges/two-strings/

import java.util.*;

public class TwoStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String a = sc.next();
            String b = sc.next();
            boolean found = false;

            for (char c = 'a'; c <= 'z'; c++) {
                if (a.indexOf(c) >= 0 && b.indexOf(c) >= 0) {
                    found = true;
                    break;
                }
            }

            System.out.println(found ? "YES" : "NO");
        }
    }
}