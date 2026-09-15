// Week 8 - Task 10
// Question: Read two integers, divide them, and report InputMismatchException or ArithmeticException when needed.
// Platform: HackerRank
// https://www.hackerrank.com/challenges/java-exception-handling-try-catch
import java.util.*;
public class JavaExceptionHandlingTryCatch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try { int a=sc.nextInt(), b=sc.nextInt(); System.out.println(a/b); }
        catch(InputMismatchException e){ System.out.println("java.util.InputMismatchException"); }
        catch(ArithmeticException e){ System.out.println(e); }
    }
}
