// Week 5 Task 2
// Question: Birthday Chocolate
// Platform: HackerRank
// https://www.hackerrank.com/challenges/the-birthday-bar/problem
import java.util.*;
public class BirthdayChocolate { public static void main(String[]args){Scanner s=new Scanner(System.in);int n=s.nextInt();int[]a=new int[n];for(int i=0;i<n;i++)a[i]=s.nextInt();int d=s.nextInt(),m=s.nextInt(),ans=0;for(int i=0;i+m<=n;i++){int sum=0;for(int j=i;j<i+m;j++)sum+=a[j];if(sum==d)ans++;}System.out.println(ans);}}
