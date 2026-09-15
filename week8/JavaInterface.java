// Week 8 - Task 6
// Question: Implement AdvancedArithmetic and return the sum of all divisors of n.
// Platform: HackerRank
// https://www.hackerrank.com/challenges/java-interface/
interface AdvancedArithmetic { int divisor_sum(int n); }
class MyCalculator implements AdvancedArithmetic {
    public int divisor_sum(int n) {
        int sum=0;
        for(int i=1;i<=n;i++) if(n%i==0) sum+=i;
        return sum;
    }
}
