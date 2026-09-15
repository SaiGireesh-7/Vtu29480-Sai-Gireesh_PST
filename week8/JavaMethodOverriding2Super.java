// Week 8 - Task 2
// Question: Use super keyword to call the parent class method in Motorcycle.
// Platform: HackerRank
// https://www.hackerrank.com/challenges/java-method-overriding-2-super-keyword/
class Cycle {
    String define_me(){ return "a cycle with pedals."; }
    Cycle(){ System.out.println("Hello I am a cycle, I am " + define_me()); }
}
class Motorcycle extends Cycle {
    String define_me(){ return "a cycle with an engine."; }
    Motorcycle(){ System.out.println("Hello I am a motorcycle, I am " + define_me()); String temp = super.define_me(); System.out.println("My ancestor is a cycle who is " + temp); }
}
public class JavaMethodOverriding2Super { public static void main(String[] args){ new Motorcycle(); } }
