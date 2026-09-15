// Week 6 Task 7
// Question: Palindrome Index
// Platform: HackerRank
// https://www.hackerrank.com/challenges/palindrome-index/problem
import java.util.*;
public class PalindromeIndex { static boolean ok(String s,int l,int r){while(l<r)if(s.charAt(l++)!=s.charAt(r--))return false;return true;}public static void main(String[]a){Scanner s=new Scanner(System.in);int t=s.nextInt();while(t-->0){String x=s.next();int l=0,r=x.length()-1;while(l<r&&x.charAt(l)==x.charAt(r)){l++;r--;}if(l>=r)System.out.println(-1);else System.out.println(ok(x,l+1,r)?l:(ok(x,l,r-1)?r:-1));}}}
