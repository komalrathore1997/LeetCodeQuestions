class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int majoritySize=n/2;
        Map<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        for(Map.Entry<Integer,Integer> ele:map.entrySet()){
            if(majoritySize<ele.getValue()){
                  return ele.getKey();
            }
        }

        return -1;
    }
}