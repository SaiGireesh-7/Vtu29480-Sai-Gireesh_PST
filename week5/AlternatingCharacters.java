// Week 5 Task 6
// Question: Alternating Characters
// Platform: HackerRank
// https://www.hackerrank.com/challenges/alternating-characters/
import java.util.*;
public class AlternatingCharacters { public static void main(String[]a){Scanner s=new Scanner(System.in);int t=s.nextInt();while(t-->0){String x=s.next();int c=0;for(int i=1;i<x.length();i++)if(x.charAt(i)==x.charAt(i-1))c++;System.out.println(c);}}}
