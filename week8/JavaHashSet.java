// Week 8 - Task 7
// Question: Count the number of distinct pairs of strings using HashSet.
// Platform: HackerRank
// https://www.hackerrank.com/challenges/java-hashset/problem
import java.util.*;
public class JavaHashSet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt(); Set<String> set=new HashSet<>();
        while(t-->0){ String a=sc.next(), b=sc.next(); set.add(a+"#"+b); System.out.println(set.size()); }
    }
}
