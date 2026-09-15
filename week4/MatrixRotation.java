// Week 4 Task 10
// Question: Matrix Layer Rotation
// Platform: HackerRank
// https://www.hackerrank.com/challenges/matrix-rotation-algo/
import java.util.*;
public class MatrixRotation { public static void main(String[] args){Scanner sc=new Scanner(System.in);int m=sc.nextInt(),n=sc.nextInt(),r=sc.nextInt();int[][]a=new int[m][n];for(int[]x:a)for(int j=0;j<n;j++)x[j]=sc.nextInt();for(int layer=0;layer<Math.min(m,n)/2;layer++){ArrayList<Integer>v=new ArrayList<>();for(int i=layer;i<m-layer;i++)v.add(a[i][layer]);for(int j=layer+1;j<n-layer;j++)v.add(a[m-layer-1][j]);for(int i=m-layer-2;i>=layer;i--)v.add(a[i][n-layer-1]);for(int j=n-layer-2;j>layer;j--)v.add(a[layer][j]);int q=r%v.size(),z=0;for(int i=layer;i<m-layer;i++)a[i][layer]=v.get((z++ + q)%v.size());for(int j=layer+1;j<n-layer;j++)a[m-layer-1][j]=v.get((z++ + q)%v.size());for(int i=m-layer-2;i>=layer;i--)a[i][n-layer-1]=v.get((z++ + q)%v.size());for(int j=n-layer-2;j>layer;j--)a[layer][j]=v.get((z++ + q)%v.size());}for(int[]x:a){for(int j=0;j<n;j++)System.out.print(x[j]+" ");System.out.println();}}}
