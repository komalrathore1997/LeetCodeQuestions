class Solution {
    public int findSpecialInteger(int[] arr) {
        int n=arr.length;
        double persent=(n*25)/100;
        double key=Math.ceil(persent);
        int val=(int)key;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }

        for(Map.Entry<Integer,Integer> k:map.entrySet()){
            if(k.getValue()>val){
                return k.getKey();
            }
        }

        return -1;
        
    }
}