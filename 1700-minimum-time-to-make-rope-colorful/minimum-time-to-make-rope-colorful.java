class Solution {
    public int minCost(String colors, int[] neededTime) {
        int ans=0;
        int start=0;
        int end=0;
        int n=colors.length();
        int totalTime=0;
        while(start<n && end<n){
           int maxTime=0;
           int groupTime=0;
           while(end<n && colors.charAt(start)==colors.charAt(end)){
               maxTime=Math.max(maxTime,neededTime[end]);
               groupTime+=neededTime[end];
               end++;
           }

           totalTime+=(groupTime-maxTime);
           start=end;
        }

        return totalTime;
    }
}