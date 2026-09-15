// Week 4 Task 7
// Question: Diagonal Difference
// Platform: HackerRank
// https://www.hackerrank.com/challenges/diagonal-difference/
import java.util.*;
public class DiagonalDifference { public static void main(String[] args){Scanner sc=new Scanner(System.in);int n=sc.nextInt(),a=0,b=0;for(int i=0;i<n;i++)for(int j=0;j<n;j++){int x=sc.nextInt();if(i==j)a+=x;if(i+j==n-1)b+=x;}System.out.println(Math.abs(a-b));}}
