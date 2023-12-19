class Solution {
    public int[][] imageSmoother(int[][] img) {
        int n=img.length;
        int m=img[0].length;
        int smothing[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int count=0;
                int sum=0;

                for(int x=i-1;x<=i+1;x++){
                    for(int y=j-1;y<=j+1;y++){
                        if(0<=x && x<n && 0<=y && y<m){
                           sum+=img[x][y];
                           count+=1;
                        } 
                    }
                }

                smothing[i][j]=sum/count;
            }
        }

        return smothing;
    }
}