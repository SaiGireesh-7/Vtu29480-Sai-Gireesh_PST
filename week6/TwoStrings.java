// Week 6 Task 3
// Question: Two Strings
// Platform: HackerRank
// https://www.hackerrank.com/challenges/two-strings/
import java.util.*;
public class TwoStrings { public static void main(String[]a){Scanner s=new Scanner(System.in);int t=s.nextInt();while(t-->0){String x=s.next(),y=s.next();boolean ok=false;for(char c='a';c<='z';c++)if(x.indexOf(c)>=0&&y.indexOf(c)>=0)ok=true;System.out.println(ok?"YES":"NO");}}}
