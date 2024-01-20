class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int[] prefixMax=new int[n];
        int[] suffixMax=new int[n];
        
        prefixMax[0]=height[0];
        for(int i=1;i<n;i++){
            if(height[i]>prefixMax[i-1]){
                prefixMax[i]=height[i];
            }else{
                prefixMax[i]=prefixMax[i-1];
            }
        }

        suffixMax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            if(height[i]>suffixMax[i+1]){
                suffixMax[i]=height[i];
            }else {
                suffixMax[i] = suffixMax[i + 1];
            }
        }

        int ans=0;
        for(int i=0;i<n;i++){
            ans+=Math.min(prefixMax[i],suffixMax[i])-height[i];
        }

        return ans;
    }
}