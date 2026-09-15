// Week 7 - Task 6
// Question: Round grades to the next multiple of 5 when the difference is less than 3, but do not round grades below 38.
// Platform: HackerRank
// https://www.hackerrank.com/challenges/grading/problem
import java.util.*;
public class GradingStudents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            int g = sc.nextInt();
            if (g >= 38 && g % 5 >= 3) g += 5 - g % 5;
            System.out.println(g);
        }
    }
}
