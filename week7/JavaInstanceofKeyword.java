// Week 7 - Task 2
// Question: Given objects, use Java instanceof to count how many objects belong to each class.
// Platform: HackerRank
// https://www.hackerrank.com/challenges/java-instanceof-keyword/problem
import java.util.*;
class Student {}
class Rockstar {}
class Hacker {}
public class JavaInstanceofKeyword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0, b = 0, c = 0;
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            if (s.equals("Student")) a++;
            else if (s.equals("Rockstar")) b++;
            else if (s.equals("Hacker")) c++;
        }
        System.out.println(a + " " + b + " " + c);
    }
}
