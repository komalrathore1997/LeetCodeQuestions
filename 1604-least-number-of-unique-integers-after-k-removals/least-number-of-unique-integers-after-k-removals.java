class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
       Map<Integer, Integer> map = new HashMap<>();
		for (int a : arr) {
			map.put(a, map.getOrDefault(a, 0) + 1);
		}
		
		List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(map.entrySet());
		
        entryList.sort((a,b)-> a.getValue()-b.getValue());

        for(Map.Entry<Integer,Integer> entry:entryList){
			int val = entry.getValue();
			if (val <= k) {
				k -= val;
				map.remove(entry.getKey());
			} else {
				break;
			}
		}

		return map.size();
    }
}