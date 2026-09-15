// Week 6 Task 5
// Question: Mars Exploration
// Platform: HackerRank
// https://www.hackerrank.com/challenges/mars-exploration/
import java.util.*;
public class MarsExploration { public static void main(String[]a){Scanner s=new Scanner(System.in);String x=s.next();String p="SOS";int c=0;for(int i=0;i<x.length();i++)if(x.charAt(i)!=p.charAt(i%3))c++;System.out.println(c);}}
