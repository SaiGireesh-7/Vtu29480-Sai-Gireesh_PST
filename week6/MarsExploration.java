// Week 6 Task 5
// Question: Mars Exploration
// Platform: HackerRank
// https://www.hackerrank.com/challenges/mars-exploration/

import java.util.*;

public class MarsExploration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String pattern = "SOS";
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != pattern.charAt(i % 3)) {
                count++;
            }
        }

        System.out.println(count);
    }
}