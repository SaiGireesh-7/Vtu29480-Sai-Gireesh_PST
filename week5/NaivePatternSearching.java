// Week 5 Task 10
// Question: Naive Algorithm for Pattern Searching
// Platform: GeeksforGeeks
// https://www.geeksforgeeks.org/naive-algorithm-for-pattern-searching/

import java.util.*;

public class NaivePatternSearching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String pattern = sc.nextLine();

        for (int i = 0; i <= text.length() - pattern.length(); i++) {
            int j = 0;

            while (j < pattern.length()
                    && text.charAt(i + j) == pattern.charAt(j)) {
                j++;
            }

            if (j == pattern.length()) {
                System.out.print(i + " ");
            }
        }
    }
}