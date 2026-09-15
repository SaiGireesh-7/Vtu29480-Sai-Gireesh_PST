// Week 4 Task 8
// Question: Transpose Matrix
// Platform: LeetCode
// https://leetcode.com/problems/transpose-matrix/
class TransposeMatrix { public int[][] transpose(int[][] a){int m=a.length,n=a[0].length;int[][]b=new int[n][m];for(int i=0;i<m;i++)for(int j=0;j<n;j++)b[j][i]=a[i][j];return b;} }
