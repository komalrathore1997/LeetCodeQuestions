class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int majoritySize=nums.length/2;

        if(nums.length==1){
            return nums[0];
        }
        int count=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                count++;
            }else{
                count=1;
            }

            if(majoritySize < count){
                return nums[i];
            }
        }

        return -1;
    }
}