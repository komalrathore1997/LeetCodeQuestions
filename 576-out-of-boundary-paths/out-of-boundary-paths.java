class Solution {
    private  Long[][][] memo = null;
    private  int mod= 1000000007;
    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        memo=new Long[m+1][n+1][maxMove+1];
        return (int) (findPathsHelperMethod(m,n,maxMove,startRow,startColumn));
    }

    public long findPathsHelperMethod(int m, int n, int maxMove, int row, int col){
       if(maxMove<0){
           return 0;
       }

       if(row==m || col==n || row < 0 || col < 0){
           return 1;
       }

       if(memo[row][col][maxMove]!=null){
           return memo[row][col][maxMove];
       }
       long total=0;
       long leftMaxMove = findPathsHelperMethod(m,n,maxMove-1,row,col-1);
       long rightMaxMove= findPathsHelperMethod(m,n,maxMove-1,row,col+1);
       long upLeftMaxMove = findPathsHelperMethod(m,n,maxMove-1,row-1,col);
       long downRightMaxMove = findPathsHelperMethod(m,n,maxMove-1,row+1,col);

       total=(leftMaxMove + rightMaxMove + upLeftMaxMove + downRightMaxMove)%mod;

       memo[row][col][maxMove]=total;

       return total;

    }
}