// Week 4 Task 5
// Question: Time Conversion
// Platform: HackerRank
// https://www.hackerrank.com/challenges/time-conversion/problem

import java.util.*;

public class TimeConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int h = Integer.parseInt(s.substring(0, 2));
        String ap = s.substring(8);

        if (ap.equals("AM") && h == 12) {
            h = 0;
        }

        if (ap.equals("PM") && h != 12) {
            h += 12;
        }

        System.out.printf("%02d%s%n", h, s.substring(2, 8));
    }
}