// Week 9 - Task 5
// Question: Handle division errors using Java try-catch.
// Platform: HackerRank
// https://www.hackerrank.com/challenges/java-exception-handling-try-catch/problem
import java.util.*;
public class JavaExceptionHandlingTryCatch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try { int a=sc.nextInt(), b=sc.nextInt(); System.out.println(a/b); }
        catch(InputMismatchException e){ System.out.println("java.util.InputMismatchException"); }
        catch(ArithmeticException e){ System.out.println(e); }
    }
}
