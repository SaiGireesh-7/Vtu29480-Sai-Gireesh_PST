// Week 4 Session 5 - Strassen's Matrix Multiplication
// Reference: GeeksforGeeks
// https://www.geeksforgeeks.org/problems/multiply-the-matrices-1587115620/
// Question: Multiply two matrices.
public class StrassenMatrixMultiplication { static int[][] mul(int[][]a,int[][]b){int m=a.length,n=b[0].length,k=b.length;int[][]c=new int[m][n];for(int i=0;i<m;i++)for(int j=0;j<n;j++)for(int x=0;x<k;x++)c[i][j]+=a[i][x]*b[x][j];return c;} }
