// Week 7 - Task 2
// Question: Use Java instanceof to count Student, Rockstar and Hacker objects.
// Platform: HackerRank
// https://www.hackerrank.com/challenges/java-instanceof-keyword/problem
import java.util.*;
class Student {}
class Rockstar {}
class Hacker {}
public class JavaInstanceofKeyword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), student = 0, rockstar = 0, hacker = 0;
        for (int i = 0; i < n; i++) {
            String s = sc.next(); Object obj;
            if (s.equals("Student")) obj = new Student();
            else if (s.equals("Rockstar")) obj = new Rockstar();
            else obj = new Hacker();
            if (obj instanceof Student) student++;
            if (obj instanceof Rockstar) rockstar++;
            if (obj instanceof Hacker) hacker++;
        }
        System.out.println(student + " " + rockstar + " " + hacker);
    }
}
