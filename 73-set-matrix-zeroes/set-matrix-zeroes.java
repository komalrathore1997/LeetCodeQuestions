class Solution {
    public void setZeroes(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        
        int[] rowZero=new int[n];
        Arrays.fill(rowZero,0);
        int[] colZero=new int[m];
        Arrays.fill(colZero,0);

        int marker=Integer.MIN_VALUE;
        for(int row=0;row<n;row++){
            for(int col=0;col<m;col++){
                if(matrix[row][col]==0){
                     rowZero[row]=1;
                     colZero[col]=1;
                }
  
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(rowZero[i]==1 || colZero[j]==1){
                    matrix[i][j]=0;
                }
            }
        }
    }
}


