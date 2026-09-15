// Week 6 Task 1
// Question: String Similarity
// Platform: HackerRank
// https://www.hackerrank.com/challenges/string-similarity/

import java.util.*;

public class StringSimilarity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();
            long answer = 0;

            for (int i = 0; i < s.length(); i++) {
                int j = 0;

                while (i + j < s.length()
                        && s.charAt(j) == s.charAt(i + j)) {
                    j++;
                }

                answer += j;
            }

            System.out.println(answer);
        }
    }
}