// Week 8 - Task 9
// Question: Implement power(n,p) and throw exceptions for negative values or both zero.
// Platform: HackerRank
// https://www.hackerrank.com/challenges/java-exception-handling
class MyCalculator {
    public long power(int n, int p) throws Exception {
        if(n<0 || p<0) throw new Exception("n or p should not be negative.");
        if(n==0 && p==0) throw new Exception("n and p should not be zero.");
        return (long)Math.pow(n,p);
    }
}
