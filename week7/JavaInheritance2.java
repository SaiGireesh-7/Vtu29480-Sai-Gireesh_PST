// Week 7 - Task 8
// Question: Create Arithmetic with add() and Adder that inherits Arithmetic.
// Platform: HackerRank
// https://www.hackerrank.com/challenges/java-inheritance-2/
class Arithmetic { int add(int a, int b) { return a + b; } }
class Adder extends Arithmetic { }
public class JavaInheritance2 {
    public static void main(String[] args) {
        Adder a = new Adder();
        System.out.println("My superclass is: Arithmetic");
        System.out.println(a.add(42, 13) + " " + a.add(10, 10) + " " + a.add(15, 5));
    }
}
