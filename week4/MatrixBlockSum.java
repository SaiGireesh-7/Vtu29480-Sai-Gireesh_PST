// Week 4 Task 9
// Question: Matrix Block Sum
// Platform: LeetCode
// https://leetcode.com/problems/matrix-block-sum/
class MatrixBlockSum { public int[][] matrixBlockSum(int[][] a,int k){int m=a.length,n=a[0].length;int[][]p=new int[m+1][n+1];for(int i=0;i<m;i++)for(int j=0;j<n;j++)p[i+1][j+1]=a[i][j]+p[i][j+1]+p[i+1][j]-p[i][j];int[][]r=new int[m][n];for(int i=0;i<m;i++)for(int j=0;j<n;j++){int x=Math.max(0,i-k),y=Math.max(0,j-k),u=Math.min(m-1,i+k),v=Math.min(n-1,j+k);r[i][j]=p[u+1][v+1]-p[x][v+1]-p[u+1][y]+p[x][y];}return r;} }
