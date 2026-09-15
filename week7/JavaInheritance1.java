// Week 7 - Task 7
// Question: Use inheritance so Bird can walk, fly and sing.
// Platform: HackerRank
// https://www.hackerrank.com/challenges/java-inheritance-1
class Animal { void walk(){ System.out.println("I am walking"); } }
class Bird extends Animal {
    void fly(){ System.out.println("I am flying"); }
    void sing(){ System.out.println("I am singing"); }
}
public class JavaInheritance1 {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.walk(); bird.fly(); bird.sing();
    }
}
