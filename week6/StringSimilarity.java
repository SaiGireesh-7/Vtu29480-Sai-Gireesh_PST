// Week 6 Task 1
// Question: String Similarity
// Platform: HackerRank
// https://www.hackerrank.com/challenges/string-similarity/
import java.util.*;
public class StringSimilarity { public static void main(String[]a){Scanner s=new Scanner(System.in);int t=s.nextInt();while(t-->0){String x=s.next();long ans=0;for(int i=0;i<x.length();i++){int j=0;while(i+j<x.length()&&x.charAt(j)==x.charAt(i+j))j++;ans+=j;}System.out.println(ans);}}}
