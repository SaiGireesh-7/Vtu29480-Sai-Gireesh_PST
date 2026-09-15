// Week 5 Task 3
// Question: Max Subarray - maximum subarray and subsequence sums.
// Platform: HackerRank
// https://www.hackerrank.com/challenges/maxsubarray/
import java.util.*;
public class MaxSubarrayHackerRank { public static void main(String[]a){Scanner s=new Scanner(System.in);int t=s.nextInt();while(t-->0){int n=s.nextInt(),best=-1000000000,cur=0,sum=0,max=-1000000000;for(int i=0;i<n;i++){int x=s.nextInt();cur=Math.max(x,cur+x);best=Math.max(best,cur);sum+=x;max=Math.max(max,x);}System.out.println(best+" "+(sum>0?sum:max));}}}
