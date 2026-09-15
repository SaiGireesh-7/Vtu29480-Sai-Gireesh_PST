// Week 8 - Task 3
// Question: Implement Singleton with a private constructor, public str variable and getSingleInstance().
// Platform: HackerRank
// https://www.hackerrank.com/challenges/java-singleton/
class Singleton {
    public String str;
    private static Singleton instance = new Singleton();
    private Singleton() {}
    public static Singleton getSingleInstance() { return instance; }
}
